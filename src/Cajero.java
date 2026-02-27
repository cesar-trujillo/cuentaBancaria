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

    public boolean pagoServicios(){//no terminamos 
        if(true){
            return true;
        }else{
            return false;
        }
    }
}
