public class Main {

    public static void main(String[] args) {


        Videojuego juego1 = new Videojuego("Minecraft", "Sandbox", 20);
        Videojuego juego2 = new Videojuego("Counter-Strike 2", "Shooter", 40);

        juego1.registrarSesion(35);
        juego2.registrarSesion(5);


        System.out.println("Videojuego: " + juego1.getNombre());
        System.out.println("Horas jugadas: " + juego1.getHorasJugadas());
        System.out.println("¿Es un juego prolongado? "
                + juego1.esJuegoProlongado());

        System.out.println();

        System.out.println("Videojuego: " + juego2.getNombre());
        System.out.println("Horas jugadas: " + juego2.getHorasJugadas());
        System.out.println("¿Es un juego prolongado? "
                + juego2.esJuegoProlongado());
    }
}
