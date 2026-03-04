public class Cajero {
    private String cajeroId;

    Cajero(){
        cajeroId = "";
    }

    Cajero(String cajeroId){
        this.cajeroId = cajeroId;
    }

    public String getCajeroId() {
        return cajeroId;
    }

    public void setCajeroId(String cajeroId) {
        this.cajeroId = cajeroId;
    }

    public boolean validarNip(String NIP, String getNip){
        if(NIP == getNip){
            return true;
        }else{
            return false;
        }
    }

    public boolean retirarSaldo(int retiro){
        if(retiro < 200 && retiro % 100 == 0){
            System.out.println("solo puedes retirar un monto minimo de 200 y multiplo de 100");
            return false;
        }else{
            return true;
        }
    }

<<<<<<< HEAD
    public boolean pagoServicios(float monto, float saldoDisponible){
        if (monto <= 0) {
            System.out.println("Error: El monto debe ser mayor a cero");
=======
    public boolean pagoServicios(){
        if(true){
            return true;
        }else{
>>>>>>> 4bc13dec75b0990b21ca4bf7447c19e736422a8a
            return false;
        }else if (monto > saldoDisponible) {
            System.out.println("Error: Saldo insuficiente para realizar el pago");
        return false;
        }else { 
            return true;
        }

    }
}
