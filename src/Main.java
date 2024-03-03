public class Main {
    public static void main(String[] args) {
        Estudiante ricardo = new Estudiante("Ricardo Ayala", 20, 1);
        ricardo.printCantEstudiantes();
        Estudiante juan = new Estudiante("Juan Rivas", 30, 0);
        juan.printCantEstudiantes();
        // definiendo un objeto
        Estudiante.holaMundo(); // metodo de clase. aplicas el metodo a la clase.
        double valor =  Math.pow(3, 2); // 3²
        System.out.println(valor);
        ricardo.atributoLoco = 100;
        ricardo.saludar("Alonso Rosendo");
    }
}