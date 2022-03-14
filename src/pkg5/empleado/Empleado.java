package pkg5.empleado;

import java.util.Scanner;

/*Hacer una solución que calcule las deducciones, el auxilio de transporte y el 
salario neto a pagar a un empleado si el dato de entrada es el salario básico. 
(hacer una función para cada acción)
Nota: Recordar que las deducciones legales vigentes son las siguientes:
Si gana hasta 4 mínimos se le deduce el 8% del salario básico.
Si gana más de 4 mínimos se le deduce el 9% del salario básico.
Solo se le da auxilio de transporte a los que ganan más de dos mínimos. (
suponer el salario mínimo y el valor del auxilio de transporte)
 */
public class Empleado {

    public static void main(String[] args) {
        int SalarioMinimo = 1000000;
        System.out.println("Cual es su salario basico?");
        int SalarioBase = new Scanner(System.in).nextInt();
        Operaciones objOperaciones = new Operaciones(SalarioBase, SalarioMinimo);
        objOperaciones.Deducciones();
        objOperaciones.AuxilioTransporte();
        System.out.println("Tu salario total es: " + objOperaciones.SalarioNeto());
    }

}
