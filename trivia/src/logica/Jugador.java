package logica;

public class Jugador {
    private String nombre;
    private String tipo;
    private String passwd;


    public Jugador(String nombre) {
        this.nombre = nombre;
        this.tipo = "default";
        this.passwd = "";
    }
    
    public Jugador(String nombre, String passwd) {
        this.nombre = nombre;
        this.tipo = "jugador";
        this.passwd = passwd;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nombre+": tipo: "+tipo+", contraseña: "+passwd;
    }
    
    
}
