package proyectomed;

public class Arbol {
    Nodo raiz;
    public Arbol(){
        raiz = null;
    }
    //Método para insertar un nodo en el Árbol
    public void agregar(int d, String n){
        Nodo nuevo = new Nodo(d, n);
        if(raiz == null){
            raiz = nuevo;
        }else{
            Nodo auxi = raiz;
            Nodo padre;
            while(true){
                padre=auxi;
                if(d<auxi.dato){
                    auxi=auxi.hijoizquierdo;
                    if(auxi == null){
                        padre.hijoizquierdo = nuevo;
                        return;
                    }
                }else{
                    auxi=auxi.hijoderecho;
                    if(auxi == null){
                        padre.hijoderecho = nuevo;
                        return;
                    }
                }
            }
        }
    }
    //Método para saber cuando el árbol está vacío
    public boolean Vacío(){
        return raiz == null;
    }
    //Método para recorrer el árbol InOrder
    public void InOrder(Nodo r){
        if(r!= null){
            InOrder(r.hijoizquierdo);
            System.out.println(r.dato);
            InOrder(r.hijoderecho);
        }
    }
}
