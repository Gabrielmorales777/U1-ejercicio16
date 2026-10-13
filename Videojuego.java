
public class Videojuego {

    private String nombre;
    private String genero;
    private double horasJugadas;

    public Videojuego(String nombre, String genero, double horasJugadas) {

        if (horasJugadas < 0) {
            throw new IllegalArgumentException(
                    "Las horas jugadas no pueden ser negativas"
            );
        }

        this.nombre = nombre;
        this.genero = genero;
        this.horasJugadas = horasJugadas;
    }


    public void registrarSesion(double horas) {

        if (horas < 0) {
            throw new IllegalArgumentException(
                    "Las horas de la sesión no pueden ser negativas"
            );
        }

        horasJugadas += horas;
    }


    public boolean esJuegoProlongado() {
        return horasJugadas > 50;
    }


    public double getHorasJugadas() {
        return horasJugadas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }
}
