package principal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class Sistema {
/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se 
trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola 
carga de agua, se dispara y se moja.
*/
    public static void main(String[] args) {
        //Ejercicio 2
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Cuanto Jugadores habrá? ");
        int cantJugadores = leer.nextInt();
        ArrayList<Jugador> listaJugadores= new ArrayList<>();
        //CREACION JUGADORES
        for (int i =0; i<cantJugadores;i++){
            Jugador jugador = new Jugador();
            listaJugadores.add(jugador); 
        }
        //CREACION JUEGO
        Juego nuevoJuego = new Juego();
        RevolverDeAgua r = new RevolverDeAgua();
        r.llenarRevolver();     //en que posicion queda la carga de agua
        nuevoJuego.llenarJuego(listaJugadores, r);
        
        nuevoJuego.ronda();
        System.out.println("Termino el Juego");

        
        
        
        
    }
    
}
