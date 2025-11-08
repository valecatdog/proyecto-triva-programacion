import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Obtener la instancia del sistema (Singleton)
        SistemaJuego sistema = SistemaJuego.getInstancia();
        
        // Crear categorías
        Categoria categoriaDeportes = new Categoria("Deportes", "Preguntas sobre diversos deportes");
        Categoria categoriaHistoria = new Categoria("Historia", "Preguntas sobre historia mundial");
        
        // Agregar categorías al sistema
        sistema.addCategoria(categoriaDeportes);
        sistema.addCategoria(categoriaHistoria);
        
        // Crear preguntas
        ArrayList<String> respuestasDeporte = new ArrayList<>();
        respuestasDeporte.add("Fútbol");
        respuestasDeporte.add("Básquetbol");
        respuestasDeporte.add("Tenis");
        respuestasDeporte.add("Natación");
        
        Pregunta pregunta1 = new Pregunta(
            "¿Cuál es el deporte más popular del mundo?", 
            respuestasDeporte, 
            "Fútbol", 
            categoriaDeportes
        );
        
        // Agregar pregunta al sistema
        sistema.addPregunta(pregunta1);
        
        // Crear y agregar jugadores
        Jugador jugador1 = new Jugador("Juan", "password123");
        sistema.addJugador(jugador1);
        
        // Ver preguntas disponibles
        ArrayList<Pregunta> preguntas = sistema.verPreguntas();
        System.out.println("Preguntas disponibles: " + preguntas.size());
    }
}