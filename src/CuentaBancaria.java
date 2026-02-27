public class CuentaBancaria {
    private String numeroCuenta;
    private String PIN;
    private String propietario;
    private float saldo;

    public CuentaBancaria(){
        numeroCuenta = "";
        PIN = "";
        propietario = "";
        saldo = 0;
    }

    public CuentaBancaria(String numeroCuenta, String PIN, String propietario, float saldo) {
        this.numeroCuenta = numeroCuenta;
        this.PIN = PIN;
        this.propietario = propietario;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getPropietario() {
        return propietario;
    }
    
    public float getSaldo() {
        return saldo;
    }

    public String getPIN() {
        return PIN;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setPIN(String pIN) {
        PIN = pIN;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void depositarSaldo(float saldo) {
        this.saldo += saldo;
    }

    public void retirarSaldo(float retiro){
        if(saldo > 0 && saldo > retiro){
            saldo -= retiro;
        }else {
            System.out.println("saldo insuficiente");
        }
    }

    @Override
    public String toString() {
        return numeroCuenta + "\n" + PIN + "\n" +  propietario + "\n"+ saldo;
    }
}
