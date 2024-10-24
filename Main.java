import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        //Crear una instancia con datos quemados
        //Empleado 1
        Empleado empleado1 = new Empleado("Danna", 26, 6750.75);

        //Pedir que el usuario ingrese datos por teclado con Scanner
        Scanner ingreso = new Scanner(System.in);

        //Solicitar al usuario el ingreso de datos
        //Empleado 2
        System.out.println("Ingrese el nombre del 2do empleado: ");
        String nombre = ingreso.nextLine();

        System.out.println("Ingrese la edad del 2do empleado: ");
        int edad = ingreso.nextInt();

        System.out.println("Ingrese el salario del empleado: ");
        double salario = ingreso.nextDouble();

        //Crear la segunda instancia con datos ingresados por el usuario
        Empleado empleado2 = new Empleado(nombre, edad, salario);

        // Imprimir los datos del primer empleado
        System.out.println("Empleado 1:");
        System.out.println("Nombre: " + empleado1.getNombre());   //llamar al metodo getter para obtener el nombre del empleado
        System.out.println("Edad: " + empleado1.getEdad());      //llamar al metodo getter para obtener la edad del empleado 1
        //Cambiar el salario del empleado usando setter
        empleado1.setSalario(1800.75);
        System.out.println("Salario: " + empleado1.getSalario());  //llamar al metodo getter para obtener el salario del empleado 1
        System.out.println();

        // Imprimir los datos del segundo empleado
        System.out.println();
        System.out.println("Empleado 2:");
        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("Edad: " + empleado2.getEdad());
        System.out.println("Salario: " + empleado2.getSalario());
    }
}
