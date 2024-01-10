package persona;

public class Cuenta {

    public double Depositar(double deposito,double dineroActual){
        return dineroActual = dineroActual + deposito;
    }
    public double Retirar(double cantidadRetirar, double dineroActual){
        if (dineroActual < cantidadRetirar){
            System.out.println("Cantidad insuficiente para retiro.");
            return dineroActual;
        }else {
            return dineroActual = dineroActual - cantidadRetirar;
        }

    }
    public void ConsultarSaldo(double dineroActual){
        System.out.println("El saldo actual es : " +dineroActual);
    }

}
