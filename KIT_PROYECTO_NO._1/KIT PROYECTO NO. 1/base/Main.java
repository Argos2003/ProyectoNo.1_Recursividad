public class Main {
    public static void main(String[] args) throws Exception {
        
        if (args.length != 3) {
            System.out.println("¡ATENCIÓN! Cantidad incorrecta de archivos.");
            instrucciones();
            return;
        } else {
            String arch_arbol = args[0];
            String arch_cuerdas = args[1];
            String arch_salida = args[2];

            if (!arch_arbol.endsWith(".binary_tree") || !arch_cuerdas.endsWith(".txt") || !arch_salida.endsWith(".txt")) {
                System.out.println("¡ATENCIÓN! El orden o las extensiones son incorrectas.");
                instrucciones();
                return;
            }

            String nomArbol = arch_arbol.substring(arch_arbol.lastIndexOf("/") + 1);
            String nomCuerdas = arch_cuerdas.substring(arch_cuerdas.lastIndexOf("/") + 1);
            String nomSalida = arch_salida.substring(arch_salida.lastIndexOf("/") + 1);

            nomArbol = nomArbol.replace(".binary_tree", "");
            nomCuerdas = nomCuerdas.replace(".txt", "");
            nomSalida = nomSalida.replace(".txt", "");

            if (!nomArbol.equals(nomCuerdas) || !nomArbol.equals(nomSalida)) {
                System.out.println("¡ATENCIÓN! Uno o más nombres de archivos no coinciden.");
                instrucciones();
                return;
            }
        }
        
        BinaryTree binary_tree = new BinaryTree(args[0]);
        StringWriter string_writer = new StringWriter(args[2]);
        StringReader string_reader = new StringReader(args[1]);

        for (int index = 0; index < string_reader.length(); index++) {
            if (binary_tree.contains_string(string_reader.get(index))) {
                string_writer.write(true);
            } else {
                string_writer.write(false);
            }
        }

        string_writer.close();
    }

    public static void instrucciones(){
        System.out.println("\niNSTRUCCIONES PARA USO:\n");
        System.out.println("java Main <ARCHIVO_TREE><ARCHIVO_CUERDAS><ARCHIVO_SALIDA>");
        System.out.println("<ARCHIVO_TREE>: tests/binary trees/nombre.binary_tree");
        System.out.println("<ARCHIVO_CUERDAS>: tests/strings/nombre.txt");
        System.out.println("<ARCHIVO_SALIDA>: tests/expected/nombre.txt");
    }
}
