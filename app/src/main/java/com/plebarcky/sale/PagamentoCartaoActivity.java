package com.plebarcky.sale;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PagamentoCartaoActivity extends ActionBarActivity {

    private Button btnCartaoDebito;
    private Button btnCartaoCredito;
    private Button btnCartaoParcelado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento_cartao);

        btnCartaoCredito = (Button) findViewById(R.id.btnCartaoCredito);
        btnCartaoCredito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPagamentoCartaoCreditoRealizado();
            }
        });

        btnCartaoDebito = (Button) findViewById(R.id.btnCartaoDebito);
        btnCartaoDebito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPagamentoCartaoDebitoRealizado();
            }
        });

        btnCartaoParcelado = (Button) findViewById(R.id.btnCartaoParcelado);
        btnCartaoParcelado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPagamentoCartaoParceladoRealizado();
            }
        });
    }

    private void showPagamentoCartaoDebitoRealizado() {
        Toast.makeText(getBaseContext(), "Pagamento débito registrado!", Toast.LENGTH_LONG).show();
    }

    private void showPagamentoCartaoCreditoRealizado() {
        Toast.makeText(getBaseContext(), "Pagamento crédito registrado!", Toast.LENGTH_LONG).show();
    }

    private void showPagamentoCartaoParceladoRealizado() {
        Toast.makeText(getBaseContext(), "Pagamento Parcelado registrado!", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pagamento_cartao, menu);
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
