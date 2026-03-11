import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<Contacto>();
    }

    public Agenda(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public boolean setContactos(Contacto nuevoContacto) {
        if(contactos.add(nuevoContacto)){
            return true;
        }else{
            return false;
        }
    }

    public boolean eliminarContacto(String celular ){
        if(contactos.removeIf(contactos -> contactos.getCelular().equals(celular))){
            return true;
        }else {
            return false;
        }
    }

}
