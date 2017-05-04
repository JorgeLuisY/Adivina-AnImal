package proyect.yapo.android.adivinaanimal;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class Animal extends AppCompatActivity {

    public static Arbol raiz = new Arbol("Pajaro");






/*
    public void goTheEnd(){
        Intent i = new Intent(this,FinJuego.class);
        startActivity(i);
    }

    public boolean si(String pregunta){
        //respuesta = ();
        return true;

    }
/*
    def si(pregunta): #funcion de ayuda
            respuesta = (input(pregunta + "\n")).lower()
    print()
	return ( respuesta[0] == 's' or  respuesta[0] == 'y' )
	*/
/*
    Arbol raiz = new Arbol ("Pajaro");

    public void startGame(){

        while (true){
            if (si("Estas pensando en un animal ?"))
        }

    }
    def animal() :
            # arbol con un solo nodo
            raiz = Arbol("pajaro")
	# Hasta que el usuario salga
	while True:
    print()
		if not si(" Estas pensando en un animal ? ") : break
            # recorrer el Arbol
            arbol = raiz
		while arbol.obtenerIzquierdo() != None :
    prompt = arbol.obtenerCarga() + " ?"
            if si(prompt):
    arbol = arbol.obtenerDerecho()
            else:
    arbol = arbol.obtenerIzquierdo()
            # conjeturar!
    conjetura = arbol.obtenerCarga()
    prompt = "¿ Es un " + conjetura + " ? "
            if si(prompt) :
    print ("¡Soy el mejor!" + '\n' + " ******************** ! FIN DEL JUEGO ¡ ******************** "+ '\n'+ '\n'+ '\n')
			continue
                    # obtener mas informacion
            prompt = "Cual es el nombre del animal ?  \n"
    animal = input(prompt)
    prompt = "Que pregunta permite distinguir, un %s de un %s ? \n"
    pregunta = input(prompt % (animal,conjetura))
            # agrega mas informacion al Arbol
		arbol.asignarCarga(pregunta)
    prompt = "Estas pensando en un %s ? "
            if si(prompt % animal) :
            arbol.asignarIzquierdo(Arbol(conjetura))
            arbol.asignarDerecho(Arbol(animal))
            else :
            arbol.asignarIzquierdo(Arbol(conjetura))
            arbol.asignarDerecho(Arbol(animal))
*/}

