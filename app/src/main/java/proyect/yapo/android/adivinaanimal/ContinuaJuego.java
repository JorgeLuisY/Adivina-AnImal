package proyect.yapo.android.adivinaanimal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ContinuaJuego extends AppCompatActivity {
    EditText inputt;
    Button btnSave ;
    Button btnCancel;
    TextView textss;
    EditText pregunta;
    private Arbol arbol = Animal.raiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continua_juego);
        btnSave = (Button)findViewById(R.id.btnSave);
        btnCancel = (Button)findViewById(R.id.btnCancel);
        textss = (TextView)findViewById(R.id.question2);
        pregunta = (EditText)findViewById(R.id.textIn) ;

        btnSave.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View viev){
                if (save(viev)){
                    String animal = pregunta.getText().toString();

                    textss.setText("¿ Que pregunta permite distingir entre "+animal + " de un "+arbol.getCarga() + " ?" );
                    String pre = pregunta.getText().toString();
                    pregunta.setText("");

                    arbol.setCarga(pre);



                }
            }
        });
    }

    public boolean save(View view){
        return true;
    }
    public boolean cancel(View view){
        return false;
    }
}
