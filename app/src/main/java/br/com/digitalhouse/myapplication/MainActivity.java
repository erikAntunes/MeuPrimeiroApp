package br.com.digitalhouse.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoApertado(View view){

        System.out.println("Botão foi apertado");
        TextView respostaTextView = findViewById(R.id.text_resposta_id);
        EditText textoDigitado = findViewById(R.id.text_digitado_id);
        respostaTextView.setText("A idade é "+textoDigitado.getText());

        Toast.makeText(this,"Idade Armazenada Com Sucesso",Toast.LENGTH_LONG).show();

    }
}
