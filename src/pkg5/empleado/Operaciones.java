package pkg5.empleado;

/*Hacer una solución que calcule las deducciones, el auxilio de transporte y el 
salario neto a pagar a un empleado si el dato de entrada es el salario básico. 
(hacer una función para cada acción)
Nota: Recordar que las deducciones legales vigentes son las siguientes:
Si gana hasta 4 mínimos se le deduce el 8% del salario básico.
Si gana más de 4 mínimos se le deduce el 9% del salario básico.
Solo se le da auxilio de transporte a los que ganan más de dos mínimos. (
suponer el salario mínimo y el valor del auxilio de transporte)
 */
public class Operaciones {

    int SalarioBase;
    int SalarioMinimo;

    public Operaciones(int SalarioBase, int SalarioMinimo) {
        this.SalarioBase = SalarioBase;
        this.SalarioMinimo = SalarioMinimo;
    }

    public int Deducciones() {
        int deducciones = 0;
        if (SalarioBase <= SalarioMinimo * 4) {
            deducciones = (SalarioBase * 8) / 100;
        } else {
            deducciones = (SalarioBase * 9) / 100;
        }
        return deducciones;
    }

    public int AuxilioTransporte() {
        int auxilioTransporte = 0;
        if (SalarioBase > SalarioMinimo * 2) {
            auxilioTransporte = 117172;
        } else {
            auxilioTransporte = 0;
        }
        return auxilioTransporte;
    }

    public int SalarioNeto() {
        int salarioNeto = SalarioBase + AuxilioTransporte() - Deducciones();
        return salarioNeto;
    }
}
