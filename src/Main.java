import persona.Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcion;
        double saldo_inicail = 1200;
        double saldo_actual = 0;
        boolean inicio_sesion = true;
        Cuenta cuenta = new Cuenta();

        while (inicio_sesion){
            System.out.println("****** Cajero automatico ******");
            System.out.println("Seleccione la accion a realizar");
            System.out.println("1-Depositar \n2-Retirar \n3-Consultar Saldo \n4-Salir");
            System.out.print("Digite la opcion a realizar : ");
            opcion = input.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ha seleccionado la opcion para Depositar : ");
                    System.out.print("Ingrese la cantidad a Depositar : ");
                    double deposito = input.nextDouble();
                    saldo_inicail = cuenta.Depositar(deposito,saldo_inicail);
                    System.out.println("Se deposito " + deposito + " soles.");
                    System.out.println("Se saldo actual es : " + saldo_inicail + " soles.");
                    break;
                case 2:
                    System.out.println("Ha seleccionado la opcion para Retirar : ");
                    System.out.print("Ingrese la cantidad a Retirar : ");
                    double retiro = input.nextDouble();
                    saldo_inicail = cuenta.Retirar(retiro,saldo_inicail);
                    System.out.println("Se retiro la cantidad de :" +retiro + " soles de su cuenta.");
                    break;
                case 3:
                    System.out.println("Ha seleccionado la opcion para Consultar Saldo :");
                    System.out.println("Su saldo actual es : " +saldo_inicail);
                    break;
                case 4:
                    System.out.println("Ha Salir");
                    inicio_sesion = false;
                default:
                    System.out.println("Opcion incorrecta digite un numero valido. ");
            }
        }
    }
}