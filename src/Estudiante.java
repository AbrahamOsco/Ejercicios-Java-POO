
public class Estudiante {
    private final String NOMBRE; // Atributo de instancia y ademas es una CTE (constante) no puede cambiar
    private static int cantEstudiantes = 0; // Atributo de clase lo comparten todas las clases.
    private  int edad;  // atributo de instancia, que puede cambiar de valor
    private  int cantMateriasAprobadas; // atirbuto de instancia que puede cambiar de valor.

    private double atributoLoco;

    // constructor (tonto) por default.
    // public Estudiante(){ }  no puedo hacer en este caso porque

    // Constructor mas prolijo;
    public Estudiante(String nombre, int edad, int cantMateriasAprobadas){
        this.NOMBRE = nombre;
        this.edad = edad;
        this.atributoLoco = 15.40;
        this.cantMateriasAprobadas = cantMateriasAprobadas;
        cantEstudiantes ++;
    }
    public double getAtributoLoco(){
        return atributoLoco;
    }

    public void printCantEstudiantes(){
        System.out.println("La cantidad de estudiantes es : " + (cantEstudiantes) );
    }

    // Visibldad  tipoDeDatoQueRetorna nombreMetodo()
    public void saludar(String unNombre){
        cantEstudiantes++;
        System.out.println("Hola Mi Nombre es " + this.NOMBRE + " como estas : " + unNombre + (this.edad) + "Atributo loco" + this.atributoLoco );
    }
    public static void holaMundo(){
        System.out.println("Hola soy un metodo de clase de la clase Estudiante" + cantEstudiantes );
    }

    // Esto no es un metodo abstracto es necesario usar el abstract para explicitarlo pero lo veremos mas adelante
    public void estudiar(){

    }

}
