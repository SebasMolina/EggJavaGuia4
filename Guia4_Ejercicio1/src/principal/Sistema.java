package principal;

/**
 *
 * @author Sebas
 */
public class Sistema {
/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de 
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase 
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener 
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, 
mostrar desde la clase Persona, la información del Perro y de la Persona.
*/
    public static void main(String[] args) {
        //Ejercicio 1
        Persona primeraPersona = new Persona("Perez","Enzo","25231222",33);
        Persona segundaPersona = new Persona("Rodriguez","Maria","31553124",31);
        Perro unPerro = new Perro("Pitufo","Pitbull",5,"Grande");
        Perro otroPerro = new Perro("Firulais","Bulldog Frances",2,"Pequeño");
        System.out.println("Perros en adopcion: ");
        System.out.println(unPerro);
        System.out.println(otroPerro);
        System.out.println("**************************************************");
        System.out.printf("%s %s quiere adoptar a %s\n",primeraPersona.getApellido(),primeraPersona.getNombre(),unPerro.getNombre());
        System.out.printf("%s %s quiere adoptar a %s\n",segundaPersona.getNombre(),segundaPersona.getApellido(),otroPerro.getNombre());
        primeraPersona.setPerro(unPerro);
        segundaPersona.setPerro(otroPerro);
        System.out.println("**************************************************");
        System.out.println(primeraPersona);
        System.out.println(segundaPersona);
        
    }
    
}
