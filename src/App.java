//desarrollar un programa que permita hacer depositos, retiros y consultas en una cuenta bancaria
public class App {
    public static void main(String[] args) throws Exception {
        CuentaBancaria cuenta1 = new CuentaBancaria("123456789", "propietario1", 0);

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
    }
}