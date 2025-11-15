package logica;

public class Jugador {
    private String nombre;
    private String passwd;
    private double puntaje;

    public Jugador(String nombre, String passwd, double puntaje) {
        this.nombre = nombre;
        this.passwd = passwd;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
    
}
