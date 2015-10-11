package com.plebarcky.sale;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormaPagamentoActivity extends ActionBarActivity {

    private Button btnFormaDinheiro;
    private Button btnFormaCartao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forma_pagamento);

        btnFormaDinheiro = (Button) findViewById(R.id.btnFormaDinheiro);
        btnFormaDinheiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMsgPagamentoDinheiro();
            }
        });

        btnFormaCartao = (Button) findViewById(R.id.btnFormaCartao);
        btnFormaCartao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPagamentoCartao();
            }
        });


    }

    private void showPagamentoCartao()  {
        Intent intent = new Intent(this, PagamentoCartaoActivity.class);
        startActivity(intent);
    }

    private void showMsgPagamentoDinheiro() {
        Toast.makeText(getBaseContext(), "Pagamento com Dinheiro foi realizado!", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_forma_pagamento, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
