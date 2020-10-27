package mi.app.ejercicio4_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onCheckboxClicked(View view) {

        TextView wtf = (TextView) findViewById(R.id.txt);
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.lun:
                if (checked) {
                    Toast.makeText(getApplicationContext(), "Lunes añadido", Toast.LENGTH_SHORT).show();
                    break;
                }
                else break;
            case R.id.mar:
                if (checked) {
                    Toast.makeText(getApplicationContext(), "Martes añadido", Toast.LENGTH_SHORT).show();
                    break;
                }
                else break;
            case R.id.mier:
                if (checked) {
                    Toast.makeText(getApplicationContext(), "Miercoles añadido", Toast.LENGTH_SHORT).show();
                    break;
                }
                else break;
            case R.id.jue:
                if (checked) {
                    Toast.makeText(getApplicationContext(), "Jueves añadido", Toast.LENGTH_SHORT).show();
                    break;
                }
                else break;
            case R.id.vie:
                if (checked) {
                    Toast.makeText(getApplicationContext(), "Viernes añadido", Toast.LENGTH_SHORT).show();
                    break;
                }
                else break;
            case R.id.sab:
                if (checked) {
                    Toast.makeText(getApplicationContext(), "Sabado añadido", Toast.LENGTH_SHORT).show();
                    break;
                }
                else break;
            case R.id.dom:
                if (checked) {
                    Toast.makeText(getApplicationContext(), "Domingo añadido", Toast.LENGTH_SHORT).show();
                    wtf.setVisibility(View.VISIBLE);
                    break;
                }
                else {
                    wtf.setVisibility(View.INVISIBLE);
                    break;
                }
        }
    }

}