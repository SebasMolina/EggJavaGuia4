/*
Clase  Revolver  de  agua: esta  clase  posee  los  siguientes  atributos:  posición  actual 
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la 
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán 
aleatoriamente.
Métodos:






•  toString(): muestra información del revolver (posición actual y donde está el agua)
*/
package principal;

/**
 *
 * @author Sebas
 */
public class RevolverDeAgua {
    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return String.format("Posicion Agua= %d | Posicion actual %d\n", posicionAgua, posicionActual);
    }
// llenarRevolver(): le pone los valores de posición actual y de posición del agua. 
// Los  valores deben ser aleatorios.
    public void llenarRevolver(){
        posicionAgua = ((int)(Math.random()*6)+1); //aleatorio del 1 al 6
        posicionActual = ((int)(Math.random()*6)+1); //aleatorio del 1 al 6
    }
// mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar(){
        return (posicionActual == posicionAgua);
    }
// siguienteChorro(): cambia a la siguiente posición del tambor    
    public void siguienteChorro(){
        if (posicionActual==6){
            posicionActual=1;
        } else {
            posicionActual++;//le suma 1 a la posicion actual
        }
    }
    
    
}
