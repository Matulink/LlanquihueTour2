package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class GestorDeTours {
    public ArrayList<Tour> cargaTXT(String rutaArchivo) {
        ArrayList<Tour> listaTours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;
            while ((linea = br.readLine())!=null){
                String[] datos = linea.split(";");

                if (datos.length == 3) {
                    String nombre = datos[0];
                    String tipo = datos[1];
                    int precio = Integer.parseInt(datos[2]);
                    Tour nuevoTour = new Tour(nombre, tipo, precio);
                    listaTours.add(nuevoTour);
                }
            }
        }catch (Exception e) {
            System.out.println("Error en la lectura del archivo: " +e.getMessage());
        }
        return listaTours;
    }
}
