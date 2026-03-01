import java.io.*;

public class StringWriter {
    private BufferedWriter bw;
    public StringWriter(String filePath) {
        // Constructor de la clase. Aqui debe crear un FileWriter o una estructura similar para escribir a disco
        try {
            bw = new BufferedWriter(new FileWriter(filePath));
        } catch (Exception e) {
            System.out.println("Error al crear archivo de salida");
        }
    }

    public void write(boolean result) {
        // Escribe "true" o "false" en el archivo, uno por linea
        try {
            if (result) {
                bw.write("true");
            } else {
                bw.write("false");
            }
            bw.newLine();
        } catch (Exception e) {
            System.out.println("Error al escribir resultado");
        }
    }

    public void close() {
        // Cierra el archivo
        try {
            if (bw != null) {
                bw.close();
            }
        } catch (Exception e) {
            System.out.println("Error al cerrar archivo");
        }
    }
}

