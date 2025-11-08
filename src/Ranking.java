import java.util.ArrayList;

public class Ranking {
    private ArrayList<Jugador> jugadores;
    private ArrayList<Double> puntajes;

    public Ranking() {
        this.jugadores = new ArrayList<>();
        this.puntajes = new ArrayList<>();
    }

    // Getters
    public ArrayList<Jugador> getJugadores() { return jugadores; }
    public ArrayList<Double> getPuntajes() { return puntajes; }
    
    // Métodos para gestionar el ranking
    public void agregarJugadorConPuntaje(Jugador jugador, double puntaje) {
        jugadores.add(jugador);
        puntajes.add(puntaje);
    }
    
    public void eliminarJugador(Jugador jugador) {
        int index = jugadores.indexOf(jugador);
        if (index != -1) {
            jugadores.remove(index);
            puntajes.remove(index);
        }
    }
}