import java.io.*;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BinaryTree {
    public BinaryTree(String filePath) {
        // Constructor de la clase. Aqui debes leer el archivo y construir tu arbol binario
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            String linea = br.readLine();
            String[] alfabeto = linea.split(",");

            linea = br.readLine();
            String[] nodoRaiz = linea.split(",");
            Nodo raiz = new Nodo(nodoRaiz);

            ConcurrentLinkedQueue<Nodo> padres = new LinkedList<>();

        } catch (Exception e) {
            System.out.println("Error al leer archivo de binary_tree.");
        }
    }

    public boolean contains_string(String string) {
        // Evalua si un arbol contiene otro sub arbol que pueda generar la cadena proporcionada
        return false;
    }
}
