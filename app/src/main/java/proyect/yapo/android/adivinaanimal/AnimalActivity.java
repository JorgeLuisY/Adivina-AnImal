package proyect.yapo.android.adivinaanimal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnimalActivity extends AppCompatActivity {

    private Arbol arbol = Animal.raiz;
    Button btnYes ;
    Button btnNot;
    TextView texts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        btnYes = (Button)findViewById(R.id.btnYes);
        btnNot = (Button)findViewById(R.id.btnNot);
        texts = (TextView) findViewById(R.id.question);

        question();


         btnYes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View viev){
                if (btnyes(viev)){


                    while (arbol.getIzquierdo() != null){
                        texts.setText("¿ Es un "+ arbol.getCarga() + " ?");
                        if (btnyes(viev)){
                            arbol.getDerecho();
                        }
                        else {
                            arbol.getIzquierdo();
                        }

                    }

                    texts.setText("¿ Es un "+ arbol.getCarga() + " ?");
                    if (btnyes(viev)){
                        finJuego();
                    }
                }
            }
        });

    }


    public boolean btnyes(View view){
        return true;
    }
    public boolean btnNot(View view){
        return false;
    }
    public void finJuego(){
        Intent i = new Intent(this,FinJuego.class);
        startActivity(i);
    }
    public void question(){
        texts.setText("¿ Estas pensando en un animal ?");
    }

}
