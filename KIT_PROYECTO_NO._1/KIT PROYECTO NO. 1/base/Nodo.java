public class Nodo {
    private int hijoIzquierda, hijoDerecha;
    private String valorAlfabeto; 
    private Nodo iz, der;
    private boolean izNodo = false, derNodo = false;

    public Nodo(String[] nodo){
        this.valorAlfabeto = nodo[0];
        this.hijoIzquierda = Integer.parseInt(nodo[1]);
<<<<<<< HEAD
<<<<<<< HEAD
        this.hijoIzquierda = Integer.parseInt(nodo[2]);
=======
>>>>>>> parent of 6598a9e (PRUEBA2)
=======
>>>>>>> parent of 6598a9e (PRUEBA2)
        this.hijoDerecha = Integer.parseInt(nodo[2]);
    }

    public String getValor(){
        return this.valorAlfabeto;
    }

    public int getHI(){
        return this.hijoIzquierda;
    }

    public int getHD(){
        return this.hijoDerecha;
    }

    public Nodo getIz(){
        return this.iz;
    }

    public Nodo getDer(){
        return this.der;
    }

    public void setIz(Nodo hijo){
        this.iz = hijo;
    }

    public void setDer(Nodo hijo){
        this.der = hijo;
    }

    public boolean check(String string){
        if (!this.valorAlfabeto.equals(String.valueOf(string.charAt(0)))) {
            return false;
        }

        if (string.length() == 1) {
            return true;
        }

        if (this.iz != null) {
            izNodo = this.iz.check(string.substring(1));
        }
        if (this.der != null) {
            derNodo = this.der.check(string. substring(1));
        }
        return izNodo || derNodo;
    }
<<<<<<< HEAD
<<<<<<< HEAD

    
=======
>>>>>>> parent of 6598a9e (PRUEBA2)
=======
>>>>>>> parent of 6598a9e (PRUEBA2)
}
