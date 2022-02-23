
package principal;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Sebas
 */
public class Baraja {
    private HashSet<Carta> baraja;

    public Baraja() {
        this.baraja = new HashSet<>();
    }
    
    public void crearBaraja(){
        Carta carta;
        String palo1="basto",palo2="oro",palo3="copa",palo4="espada";
        for(int i=1;i<13;i++){
            if(i==8 || i==9){
                continue;
            }else{
                carta = new Carta(i,palo1);
                baraja.add(carta);
            }
        }
    }
    
    
}
