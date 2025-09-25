package com.atualiza.modelo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

// Classe responsável pelo acesso e manipulação dos dados do usuário no banco de dados
public class UsuarioDAO {

    // Instâncias do banco de dados e do helper
    private SQLiteDatabase database;
    private DatabaseHelper dbHelper;

    // Construtor que inicializa o helper
    public UsuarioDAO(Context context) {
        dbHelper = new DatabaseHelper(context);
    }

    // Método para abrir a conexão com o banco de dados
    public void open() {
        database = dbHelper.getWritableDatabase();
    }

    // Método para fechar a conexão com o banco de dados
    public void close() {
        dbHelper.close();
    }

    // Método para inserir um novo usuário no banco de dados
    public long inserirUsuario(Usuario usuario) {
        // Objeto para armazenar os valores das colunas
        ContentValues values = new ContentValues();
        values.put("nome", usuario.getNome());
        values.put("email", usuario.getEmail());
        values.put("senha", usuario.getSenha());
        values.put("telefone", usuario.getTelefone());

        // Insere a linha no banco de dados e retorna o ID da nova linha
        return database.insert("usuario", null, values);
    }
    // Adiciona este método na sua classe UsuarioDAO
    public Usuario buscarUsuario(String email, String senha) {
        Cursor cursor = null;
        try {
            // Query para buscar um usuário com base no e-mail e senha
            cursor = database.query("usuario",
                    new String[]{"id_usuario", "nome", "email", "senha", "telefone"},
                    "email = ? AND senha = ?",
                    new String[]{email, senha},
                    null, null, null);

            // Se encontrou um usuário, retorna o objeto
            if (cursor != null && cursor.moveToFirst()) {
                Usuario usuario = new Usuario();
                usuario.setId_usuario(cursor.getInt(0));
                usuario.setNome(cursor.getString(1));
                usuario.setEmail(cursor.getString(2));
                usuario.setSenha(cursor.getString(3));
                usuario.setTelefone(cursor.getString(4));
                return usuario;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return null; // Retorna null se não encontrou o usuário
    }
}