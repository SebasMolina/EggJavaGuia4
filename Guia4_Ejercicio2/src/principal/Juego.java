/*
Clase  Juego:  esta  clase  posee  los  siguientes  atributos:  Jugadores  (conjunto  de 
Jugadores) y Revolver
Métodos:




*/
package principal;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Sebas
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public Juego() {
        jugadores = new ArrayList<>();
        revolver = new RevolverDeAgua();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }
//llenarJuego(ArrayList<Jugador>jugadores,  Revolver  r):  este  método  recibe  los 
//jugadores y el revolver para guardarlos en los atributos del juego.    
    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r){
        this.jugadores = jugadores;
        this.revolver  = r;
    }
/*
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y 
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, 
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se 
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.    
*/    
    public void ronda(){
        Jugador unJugador;
        int maximo=this.jugadores.size(), i=0;
        System.out.println("Posicion Carga Agua: "+ revolver.getPosicionAgua());
        do{
            System.out.print("Posicion actual: "+revolver.getPosicionActual() + " | ");
            unJugador = this.jugadores.get(i);
            if(unJugador.disparo(revolver)){
                System.out.println(unJugador.getNombre()+" se mojo");
                break;
            } else {
                System.out.println(unJugador.getNombre()+" no se mojo");
            }
            if(i==maximo-1){
                i=0;
            } else {
                i++;
            }
        } while(!unJugador.isMojado());
    }
    
}
