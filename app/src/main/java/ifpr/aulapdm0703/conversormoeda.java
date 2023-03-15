package ifpr.aulapdm0703;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class conversormoeda extends AppCompatActivity {
    EditText etReal;
    EditText etDolar;
    Button breal;
    Button bdolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversormoeda);

        etReal=findViewById(R.id.numreal);
        etDolar=findViewById(R.id.numdolar);
        breal=findViewById(R.id.breal);
        bdolar=findViewById(R.id.bdolar);

        breal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String real = etReal.getText().toString();
            }
        });
    }
}