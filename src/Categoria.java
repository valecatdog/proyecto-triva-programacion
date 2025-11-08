import java.util.ArrayList;

public class Categoria {
    private String nombre;
    private String descripcion;
    private ArrayList<Jugador> jugadores;
    private ArrayList<Double> puntajes;

    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.jugadores = new ArrayList<>();
        this.puntajes = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public ArrayList<Jugador> getJugadores() { return jugadores; }
    public ArrayList<Double> getPuntajes() { return puntajes; }
    
    // Métodos para gestionar jugadores y puntajes
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
    
    public void agregarPuntaje(double puntaje) {
        puntajes.add(puntaje);
    }
}