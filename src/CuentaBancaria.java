public class CuentaBancaria {
    private String numeroCuenta;
    private String propietario;
    private float saldo;

    public CuentaBancaria(){
        numeroCuenta = "";
        propietario = "";
        saldo = 0;
    }

    public CuentaBancaria(String numeroCuenta, String propietario, float saldo) {
        this.numeroCuenta = numeroCuenta;
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

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void depositarSaldo(float saldo) {
        this.saldo += saldo;
    }

    public void retirarSaldo(float saldo){
        if(this.saldo > 0){
            this.saldo -= saldo;
        }
        
        System.out.println("saldo insuficiente");
    }

    @Override
    public String toString() {
        return numeroCuenta + "\n" +  propietario + "\n"+ saldo;
    }
}
