import java.io.*;
import java.util.ArrayList;

public class Persistencia {
    private static final String ARCHIVO_JUGADORES = "jugadores.dat";
    private static final String ARCHIVO_PREGUNTAS = "preguntas.dat";
    private static final String ARCHIVO_CATEGORIAS = "categorias.dat";
    private static final String ARCHIVO_RANKINGS = "rankings.dat";

    public static void guardarJugadores(ArrayList<Jugador> jugadores) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_JUGADORES))) {
            oos.writeObject(jugadores);
        } catch (IOException e) {
            System.err.println("Error al guardar jugadores: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Jugador> cargarJugadores() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO_JUGADORES))) {
            return (ArrayList<Jugador>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar jugadores: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    // Métodos similares para preguntas, categorías y rankings...
    public static void guardarPreguntas(ArrayList<Pregunta> preguntas) {
        // Implementación similar...
    }

    public static ArrayList<Pregunta> cargarPreguntas() {
        // Implementación similar...
        return new ArrayList<>();
    }
}