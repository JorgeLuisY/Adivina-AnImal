package proyect.yapo.android.adivinaanimal;

public class Arbol {

    public String carga;
    public Arbol izquierdo;
    public Arbol derecho;

    public Arbol(String carga){
        this.carga = carga;}

    public Arbol(String carga, Arbol izquierdo, Arbol derecho){
        this.carga = carga;
        this.izquierdo = izquierdo;
        this.derecho = derecho;}

    @Override
    public String toString() {
        return this.carga;
    }


    public String getCarga(){
        return this.carga;
    }

    public void setCarga(String carga){
        this.carga = carga;
    }

    public Arbol getDerecho(){
        return this.derecho;
    }

    public void setDerecho(Arbol derecho){
        this.derecho = derecho;
    }

    public Arbol getIzquierdo(){
        return this.izquierdo;
    }

    public void setIzquierdo(Arbol izquierdo){
        this.izquierdo = izquierdo;
    }

    public void imprimirArbol(Arbol arbol){
        if (arbol == null){
            return;
        }
        System.out.print(arbol);
        imprimirArbol(arbol.izquierdo);
        imprimirArbol(arbol.derecho);
    }

}


