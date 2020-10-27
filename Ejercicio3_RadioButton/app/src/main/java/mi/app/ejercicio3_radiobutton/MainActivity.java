package mi.app.ejercicio3_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnAceptar = (Button) findViewById(R.id.btnAceptar);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioGroup radio = (RadioGroup) findViewById(R.id.Radio);

                RadioButton btn = (RadioButton) findViewById(radio.getCheckedRadioButtonId());


                switch (btn.getText().toString()){
                    case "Matrix":
                        Toast t1 = Toast.makeText(getApplicationContext(),"Maquinote el NEO", Toast.LENGTH_SHORT);
                        t1.show();
                        break;
                    case "In Time":
                        Toast t2 = Toast.makeText(getApplicationContext(),"Que mal Justin", Toast.LENGTH_SHORT);
                        t2.show();
                        break;
                    case "Blade Runner":
                        Toast t3 = Toast.makeText(getApplicationContext(),"Mas allá de Orión...", Toast.LENGTH_SHORT);
                        t3.show();
                        break;
                    case "Terminator":
                        Toast t4 = Toast.makeText(getApplicationContext(),"Volveré", Toast.LENGTH_SHORT);
                        t4.show();
                        break;
                    default:
                        break;
                }

            }
        });
    }
}