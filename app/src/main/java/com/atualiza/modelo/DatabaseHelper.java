package com.atualiza.modelo;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    // Nome do banco de dados
    private static final String DATABASE_NAME = "Atualiza.db";
    // Versão do banco de dados. Aumente este número quando fizer uma alteração na estrutura
    private static final int DATABASE_VERSION = 1;

    // Nome da tabela do usuário
    private static final String TABLE_USUARIO = "usuario";

    // Nomes das colunas da tabela usuario
    private static final String COLUMN_ID = "id_usuario";
    private static final String COLUMN_NOME = "nome";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_SENHA = "senha";
    private static final String COLUMN_TELEFONE = "telefone";

    // Comando SQL para criar a tabela do usuário
    private static final String CREATE_TABLE_USUARIO = "CREATE TABLE " + TABLE_USUARIO + "("
            + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + COLUMN_NOME + " TEXT,"
            + COLUMN_EMAIL + " TEXT UNIQUE,"
            + COLUMN_SENHA + " TEXT,"
            + COLUMN_TELEFONE + " TEXT" + ")";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Cria a tabela de usuário
        db.execSQL(CREATE_TABLE_USUARIO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Descarta a tabela antiga se ela existir
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USUARIO);
        // Cria a tabela novamente
        onCreate(db);
    }
}
