/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del 
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado 
(indica si está mojado o no el jugador). El número de jugadores será decidido por el 
usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:


*/
package principal;

/**
 *
 * @author Sebas
 */
public class Jugador {
    private static int id=0;
    private String nombre;
    private boolean mojado;
    
    public Jugador() {
        id++;
        nombre = "Jugador " + id;
        mojado = false;
    }
    
    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    @Override
    public String toString() {
        return String.format("Nombre: %s, mojado: %s",nombre,mojado);
    }
    
/*
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de 
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el 
revolver tira el agua, el jugador se moja. 
El atributo mojado pasa a false y el método devuelve true, sino false.
*/
    public boolean disparo(RevolverDeAgua r){
        boolean mojar = r.mojar(); //posicionactual es la misma que posicionAgua? 
        r.siguienteChorro();
        if (mojar){
            mojado = true;
        }
        return mojar;
    }
    
    
}
