package ifpr.aulapdm0703;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculadora extends AppCompatActivity {
    EditText etN1;
    EditText etN2;
    Button bmais;
    Button bmenos;
    Button bmultiplica;
    Button bdivide;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        etN1=findViewById(R.id.N1);
        etN2=findViewById(R.id.N2);
        bmais=findViewById(R.id.bmais);
        bmenos=findViewById(R.id.bmenos);
        bmultiplica=findViewById(R.id.bmultiplica);
        bdivide=findViewById(R.id.bdivide);
        resultado=findViewById(R.id.resultado);

        bmais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = etN1.getText().toString();
                String n2 = etN2.getText().toString();
                resultado.setText(n1 + n2);
            }
        });
    }
}