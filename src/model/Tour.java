package model;

public class Tour {
    private String nombre,tipo;
    private int precio;

    //Constructor Vacío
    public Tour() {
    }
    //Constructor
    public Tour(String nombre, String tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
    //Getter
    public String getNombre() {return nombre;}
    public String getTipo() {return tipo;}
    public int getPrecio() {return precio;}

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;}
    public void setTipo(String tipo) {
        this.tipo = tipo;}
    public void setPrecio(int precio) {
        this.precio = precio;}

    //ToString
    @Override
    public String toString() {
        return "Nombre = " + nombre + "\nTipo = " + tipo + "\nPrecio = " + precio;
    }
}
