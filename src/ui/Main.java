package ui;

import data.GestorDeTours;
import model.Tour;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GestorDeTours gestor = new GestorDeTours();
        ArrayList<Tour> misTours = gestor.cargaTXT("src/resources/DatosDeTours.txt");

        if (misTours.isEmpty()){
            System.out.println("No se pudieron cargar tours o el archivo está vacío");
        }

        System.out.println("==== Catálogo de Tours ====");
        for (Tour t : misTours){
            System.out.println(t.toString());
            System.out.println("---------------------------");
        }

        System.out.println("==== Datos Filtrados (Tours de Aventura) ====");
        boolean encontrado = false;
        for (Tour t : misTours) {
            if (t.getTipo().equalsIgnoreCase("Aventura")) {
                System.out.println(t.toString());
                System.out.println("---------------------------");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron tours de tipo Aventura.");
        }
    }
}