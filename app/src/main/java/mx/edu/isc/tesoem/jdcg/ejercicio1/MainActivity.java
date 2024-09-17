package mx.edu.isc.tesoem.jdcg.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numUno;
    EditText numDos;
    Button accion;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numUno = findViewById(R.id.numUno);
        numDos = findViewById(R.id.numDos);
        accion = findViewById(R.id.accion);
        resultado = findViewById(R.id.resultado);


        accion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int numeroUno = Integer.parseInt(numUno.getText().toString());
                int numeroDos = Integer.parseInt(numDos.getText().toString());

                int suma = numeroUno + numeroDos;

                resultado.setText("Resultado: " + suma);
            }
        });
    }
}
