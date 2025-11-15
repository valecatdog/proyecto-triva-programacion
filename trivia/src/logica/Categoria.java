package logica;

import java.util.ArrayList;

public class Categoria {
    private String nombre;
    private String descripcion;
    private ArrayList<Jugador> jugadores;
    private ArrayList<Double> puntaje; //no se por que no le gusta

    public Categoria(String nombre, String descripcion, ArrayList<Jugador> jugadores, ArrayList<Double> puntaje) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.jugadores = jugadores;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Double> getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(ArrayList<Double> puntaje) {
        this.puntaje = puntaje;
    }
    
    
    
}
