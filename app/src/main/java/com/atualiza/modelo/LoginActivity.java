package com.atualiza.modelo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etEmail, etSenha;
    private Button btnEntrar;
    private TextView tvCriarConta;

    private UsuarioDAO usuarioDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Vincula os elementos do layout às variáveis
        etEmail = findViewById(R.id.et_email_login);
        etSenha = findViewById(R.id.et_senha_login);
        btnEntrar = findViewById(R.id.btn_entrar);
        tvCriarConta = findViewById(R.id.tv_criar_conta);

        // Inicializa o DAO
        usuarioDAO = new UsuarioDAO(this);

        // Define a ação para o botão "Entrar"
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                realizarLogin();
            }
        });

        // Define a ação para o link "Criar sua conta"
        tvCriarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redireciona para a tela de cadastro
                Intent intent = new Intent(LoginActivity.this, CadastroActivity.class);
                startActivity(intent);
            }
        });
    }

    private void realizarLogin() {
        String email = etEmail.getText().toString().trim();
        String senha = etSenha.getText().toString().trim();

        // 1. Validação dos campos
        if (TextUtils.isEmpty(email) || TextUtils.isEmpty(senha)) {
            Toast.makeText(this, "Por favor, preencha e-mail e senha.", Toast.LENGTH_SHORT).show();
            return;
        }

        // 2. Busca o usuário no banco de dados
        usuarioDAO.open();
        Usuario usuarioLogado = usuarioDAO.buscarUsuario(email, senha);
        usuarioDAO.close();

        // 3. Verifica o resultado
        if (usuarioLogado != null) {
            Toast.makeText(this, "Login realizado com sucesso!", Toast.LENGTH_SHORT).show();
            // TODO: Redirecionar para a tela inicial do app
        } else {
            Toast.makeText(this, "E-mail ou senha incorretos.", Toast.LENGTH_SHORT).show();
        }
    }
}