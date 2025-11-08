public class Jugador {
    private String nombre;
    private String contrasenia;
    private double puntuacion;

    public Jugador(String nombre, String contrasenia) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.puntuacion = 0.0;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getContrasenia() { return contrasenia; }
    public void setContrasenia(String contrasenia) { this.contrasenia = contrasenia; }

    public double getPuntuacion() { return puntuacion; }
    public void setPuntuacion(double puntuacion) { this.puntuacion = puntuacion; }
}