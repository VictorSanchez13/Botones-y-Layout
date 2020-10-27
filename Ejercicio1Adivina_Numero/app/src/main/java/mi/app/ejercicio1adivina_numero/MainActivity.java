package mi.app.ejercicio1adivina_numero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int randomNum = (int) (Math.random() * 100) + 1;

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView mensaje = (TextView) findViewById(R.id.mensaje);
                EditText num = (EditText) findViewById(R.id.numero);
                int numero = Integer.parseInt((num.getText().toString()));

                if (numero == randomNum){
                    mensaje.setText("CORRECTO!!");
                }
                else if(numero > randomNum){
                    mensaje.setText("TE HAS PASADO!!");
                }
                else if(numero < randomNum){
                    mensaje.setText("TE HAS QUEDADO CORTO!!");
                }
            }
        });

    }
}