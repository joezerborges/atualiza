package com.atualiza.modelo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private TextView tvSaudacao;
    private View cardCadastrarVeiculo;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vincula os elementos do layout às variáveis
        tvSaudacao = findViewById(R.id.tv_saudacao);
        cardCadastrarVeiculo = findViewById(R.id.card_cadastrar_veiculo);
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Define a saudação (exemplo)
        tvSaudacao.setText("Olá, Joezer");

        // Define a ação de clique para o card de cadastrar veículo
        cardCadastrarVeiculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Redirecionar para a tela de cadastro de veículo
                Toast.makeText(MainActivity.this, "Abrir tela de cadastro de veículo", Toast.LENGTH_SHORT).show();
            }
        });

        // Configura a barra de navegação inferior
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                // Futuramente, aqui vamos gerenciar a navegação entre as telas
                int itemId = item.getItemId();
                if (itemId == R.id.nav_home) {
                    // Já estamos na tela inicial, não faz nada ou atualiza a tela
                    return true;
                } else if (itemId == R.id.nav_vehicles) {
                    // TODO: Redirecionar para a tela de veículos
                    Toast.makeText(MainActivity.this, "Abrir tela de veículos", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId == R.id.nav_settings) {
                    // TODO: Redirecionar para a tela de configurações
                    Toast.makeText(MainActivity.this, "Abrir tela de configurações", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });
    }
}