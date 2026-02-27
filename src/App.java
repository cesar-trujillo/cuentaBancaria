//desarrollar un programa que permita hacer depositos, retiros y consultas en una cuenta bancaria
//agregar nip, para hacer retiros en cajero validar nip, monto minimo de 200, multiplo de 100, permitir 
// hacer pago de servicios, para hacerlo tiene que recibir la cantidad en billetes de cualquier denominacion 
// y puede dar cambio en monedas y billetes de cualquier denominacion, agregar registro de movimientos de la cuenta
public class App {
    public static void main(String[] args) throws Exception {
        CuentaBancaria cuenta1 = new CuentaBancaria("123456789", "123465", "propietario1", 0);

        System.out.println("saldo");
        System.out.println(cuenta1.getSaldo());

        cuenta1.depositarSaldo(500);
        System.out.println("deposito");
        System.out.println(cuenta1.getSaldo());

        System.out.println("retiro");
        cuenta1.retirarSaldo(200);
        System.out.println(cuenta1.getSaldo());

        System.out.println("informacion de la cuenta");
        System.out.println(cuenta1.toString());

        Cajero cajero = new Cajero("255");

        cajero.validarNip(cuenta1.getPIN(), "255");

        if(cajero.retirarSaldo(100)){
            cuenta1.retirarSaldo(100);
        }
    }
}