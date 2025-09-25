package com.atualiza.modelo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    // Declaração dos elementos da interface
    private EditText etNome, etEmail, etSenha, etConfirmarSenha;
    private Button btnCadastrar;

    // Declaração do objeto DAO
    private UsuarioDAO usuarioDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        // Inicializa os elementos da interface
        etNome = findViewById(R.id.et_nome);
        etEmail = findViewById(R.id.et_email);
        etSenha = findViewById(R.id.et_senha);
        etConfirmarSenha = findViewById(R.id.et_confirmar_senha);
        btnCadastrar = findViewById(R.id.btn_cadastrar);

        // Inicializa o DAO
        usuarioDAO = new UsuarioDAO(this);

        // Define a ação do botão de cadastro
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastrarUsuario();
            }
        });
    }

    private void cadastrarUsuario() {
        // Pega os dados digitados pelo usuário e remove espaços extras
        String nome = etNome.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String senha = etSenha.getText().toString().trim();
        String confirmarSenha = etConfirmarSenha.getText().toString().trim();

        // 1. Validação dos campos
        if (TextUtils.isEmpty(nome) || TextUtils.isEmpty(email) || TextUtils.isEmpty(senha) || TextUtils.isEmpty(confirmarSenha)) {
            Toast.makeText(this, "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!senha.equals(confirmarSenha)) {
            Toast.makeText(this, "As senhas não coincidem.", Toast.LENGTH_SHORT).show();
            return;
        }

        // 2. Criação do objeto Usuario
        Usuario novoUsuario = new Usuario(nome, email, senha, null); // Telefone é opcional

        // 3. Salva o usuário no banco de dados
        usuarioDAO.open();
        long resultado = usuarioDAO.inserirUsuario(novoUsuario);
        usuarioDAO.close();

        // 4. Feedback para o usuário
        if (resultado > 0) {
            Toast.makeText(this, "Usuário cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
            // Redirecionar para a tela de login
            // finish();
        } else {
            Toast.makeText(this, "Erro ao cadastrar usuário. O e-mail já pode estar em uso.", Toast.LENGTH_SHORT).show();
        }
    }
}