package proyectomed;

public class Nodo {
    int dato;
    String nombre;
    Nodo hijoizquierdo, hijoderecho;
    public Nodo(int d, String n){
        this.dato = d;
        this.nombre = n;
        this.hijoderecho = null;
        this.hijoizquierdo =  null;
    }
    public String toString(){
        return nombre + "Su dato es " + dato;
    }
}
