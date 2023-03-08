package ifpr.aulapdm0703;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonpag2;
    Button calculadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonpag2=findViewById(R.id.buttonpag2);
        calculadora=findViewById(R.id.calculadora);
        buttonpag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in= new Intent(MainActivity.this,Tela2.class);
                startActivity(in);
            }


        });
        calculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, calculadora.class);
                startActivity(in);
            }
        });
    }
}