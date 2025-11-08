import java.util.ArrayList;

public class SistemaJuego {
    private static SistemaJuego instancia;
    private ArrayList<Jugador> jugadores;
    private ArrayList<Pregunta> preguntas;
    private ArrayList<Categoria> categorias;
    private ArrayList<Ranking> rankings;

    // Constructor privado para Singleton
    private SistemaJuego() {
        this.jugadores = new ArrayList<>();
        this.preguntas = new ArrayList<>();
        this.categorias = new ArrayList<>();
        this.rankings = new ArrayList<>();
        cargarDatos();
    }

    public static SistemaJuego getInstancia() {
        if (instancia == null) {
            instancia = new SistemaJuego();
        }
        return instancia;
    }

    // Métodos de gestión de preguntas
    public void addPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
        guardarDatos();
    }

    public void delPregunta(Pregunta pregunta) {
        preguntas.remove(pregunta);
        guardarDatos();
    }

    public void modPregunta(Pregunta preguntaVieja, Pregunta preguntaNueva) {
        int index = preguntas.indexOf(preguntaVieja);
        if (index != -1) {
            preguntas.set(index, preguntaNueva);
            guardarDatos();
        }
    }

    // Métodos de gestión de jugadores
    public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
        guardarDatos();
    }

    public void delJugador(Jugador jugador) {
        jugadores.remove(jugador);
        guardarDatos();
    }

    public void modJugador(Jugador jugadorViejo, Jugador jugadorNuevo) {
        int index = jugadores.indexOf(jugadorViejo);
        if (index != -1) {
            jugadores.set(index, jugadorNuevo);
            guardarDatos();
        }
    }

    // Métodos de gestión de categorías
    public void addCategoria(Categoria categoria) {
        categorias.add(categoria);
        guardarDatos();
    }

    public void delCategoria(Categoria categoria) {
        categorias.remove(categoria);
        guardarDatos();
    }

    public void modCategoria(Categoria categoriaVieja, Categoria categoriaNueva) {
        int index = categorias.indexOf(categoriaVieja);
        if (index != -1) {
            categorias.set(index, categoriaNueva);
            guardarDatos();
        }
    }

    // Métodos de gestión de rankings
    public void addRanking(Ranking ranking) {
        rankings.add(ranking);
        guardarDatos();
    }

    public void delRanking(Ranking ranking) {
        rankings.remove(ranking);
        guardarDatos();
    }

    public void modRanking(Ranking rankingViejo, Ranking rankingNuevo) {
        int index = rankings.indexOf(rankingViejo);
        if (index != -1) {
            rankings.set(index, rankingNuevo);
            guardarDatos();
        }
    }

    public ArrayList<Pregunta> verPreguntas() {
        return new ArrayList<>(preguntas);
    }
    
    // Getters para las listas
    public ArrayList<Jugador> getJugadores() { return new ArrayList<>(jugadores); }
    public ArrayList<Categoria> getCategorias() { return new ArrayList<>(categorias); }
    public ArrayList<Ranking> getRankings() { return new ArrayList<>(rankings); }

    // Persistencia básica
    private void cargarDatos() {
        // Implementar carga desde archivo/BD
        System.out.println("Cargando datos...");
    }

    private void guardarDatos() {
        // Implementar guardado en archivo/BD
        System.out.println("Guardando datos...");
    }
}