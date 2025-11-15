package logica;

import java.util.ArrayList;

public class Juego {
        private ArrayList <Jugador> jugadores;
        private ArrayList <Pregunta> preguntas;
        private ArrayList <Categoria> categorias;
        private ArrayList <Ranking> rankings;

    private Juego(ArrayList<Jugador> jugadores, ArrayList<Pregunta> preguntas, ArrayList<Categoria> categorias, ArrayList<Ranking> rankings) {
        this.jugadores = jugadores;
        this.preguntas = preguntas;
        this.categorias = categorias;
        this.rankings = rankings;
    }
    
    
        
        
}
