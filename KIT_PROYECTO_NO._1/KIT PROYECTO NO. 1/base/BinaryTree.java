import java.io.*;
<<<<<<< HEAD
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BinaryTree {
=======
import java.util.concurrent.ConcurrentLinkedQueue;

public class BinaryTree {

    String[] alfabeto;
    Nodo raiz;


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
=======
                // Lectura Alfabeto
            String linea = br.readLine();
            this.alfabeto = linea.split(",");

                // Lectura Raíz
            linea = br.readLine();
            String[] nodoRaiz = linea.split(",");
            this.raiz = new Nodo(nodoRaiz);

            ConcurrentLinkedQueue<Nodo> padres = new ConcurrentLinkedQueue<>();
            padres.add(raiz);
            ConcurrentLinkedQueue<int[]> indicadores = new ConcurrentLinkedQueue<>();
            indicadores.add(new int[]{raiz.getHI(), raiz.getHD()});

                //Lectura Ramas
            while ((linea = br.readLine()) != null ) {
                String[] subNodos = linea.split("\\|");
                ConcurrentLinkedQueue<Nodo> nPadres = new ConcurrentLinkedQueue<>();
                ConcurrentLinkedQueue<int[]> nIndicadores = new ConcurrentLinkedQueue<>();

                int indiceSubnodo = 0;
                for (int i = 0; i < padres.size(); i++){
                    Nodo padre = padres.poll();
                    int[] indicador = indicadores.poll();

                    int izquierda = indicador[0];
                    int derecha = indicador[1];

                    if (izquierda == 1) {
                        String[] subNodo = subNodos[indiceSubnodo].split(",");
                        Nodo hijo = new Nodo(subNodo);
                        padre.setIz(hijo);
                        nPadres.add(hijo);
                        nIndicadores.add(new int[]{hijo.getHI(), hijo.getHD()});
                        indiceSubnodo++;
                    }

                    if (derecha == 1) {
                        String[] subnodo = subNodos[indiceSubnodo].split(",");
                        Nodo hijo = new Nodo(subnodo);
                        padre.setDer(hijo);
                        nPadres.add(hijo);
                        nIndicadores.add(new int[]{hijo.getHI(), hijo.getHD()});
                        indiceSubnodo++;
                    }
                }
                    // Salto de nivel en el árbol.
                padres = nPadres;
                indicadores = nIndicadores;

            }

            br.close();
>>>>>>> parent of 6598a9e (PRUEBA2)

        } catch (Exception e) {
            System.out.println("Error al leer archivo de binary_tree.");
        }
    }

    public boolean contains_string(String string) {
        // Evalua si un arbol contiene otro sub arbol que pueda generar la cadena proporcionada
<<<<<<< HEAD
        return false;
    }
=======

        if (this.raiz == null || string == null) {
            return false;
        }

        return raiz.check(string);
    }    
>>>>>>> parent of 6598a9e (PRUEBA2)
}
