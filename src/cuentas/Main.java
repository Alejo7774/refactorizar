package cuentas;
/**
 * Clase principal que ejecuta el programa de gestión de cuentas bancarias.
 * @author  Mosquera Astudillo Javier Alejandro
 * @version 1.0
 */
public class Main {
	/**
     * Método principal que inicia la aplicación.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        operativa_cuenta(500f);
    }
    /**
     * Método que realiza operaciones de ingreso y retiro sobre una cuenta.
     * @param cuenta1 Cuenta sobre la que se realizan operaciones.
     * @param cantidad Cantidad a ingresar y retirar.
     */
	private static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual );
        System.out.println("Este es un cambio para el ejercicio, del punto 2 de GIT" ); 

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
