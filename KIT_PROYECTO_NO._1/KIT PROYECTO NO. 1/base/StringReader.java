import java.io.*;
import java.util.ArrayList;

public class StringReader {
    private ArrayList<String> strings;
    public StringReader(String filePath) {
        // Constructor de la clase. Aqui debe leer el archivo y almacenar todas las cadenas que contiene
        strings = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null) {
                if (!line.trim().equals("")) {
                    strings.add(line.trim());
                }
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error al leer archivo de strings");
        }
    }

    public int length() {
        // modifique este metodo para que devuelva la cantidad correcta de cadenas a evaluar
        return strings.size();
    }

    public String get(int index) {
        // modifique este metodo para que devuelva la cadena en la posicion index
        return strings.get(index);
    }
}
