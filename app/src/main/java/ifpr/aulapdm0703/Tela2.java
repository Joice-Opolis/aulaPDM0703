package ifpr.aulapdm0703;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela2 extends AppCompatActivity {
    Button buttonvoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        buttonvoltar=findViewById(R.id.buttonvoltar);
        buttonvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Tela2.this,MainActivity.class);
                startActivity(in);
            }
        });
    }
}