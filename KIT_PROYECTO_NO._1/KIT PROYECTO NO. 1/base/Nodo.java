public class Nodo {
    private int hijoIzquierda, hijoDerecha;
    private String valorAlfabeto;

    public Nodo(String[] nodo){
        this.valorAlfabeto = nodo[0];
        this.hijoIzquierda = Integer.parseInt(nodo[1]);
        this.hijoIzquierda = Integer.parseInt(nodo[2]);
    }
}
