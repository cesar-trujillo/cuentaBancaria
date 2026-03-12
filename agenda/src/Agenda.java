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

    public boolean agregarContactos(Contacto nuevoContacto) {
        for (Contacto contacto : contactos) {
            if (contacto.getCelular().equals(nuevoContacto.getCelular())) {
                return false;  // evalua que el numero de telefono no exista
            }
        }

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

    public boolean editarContacto(String celular, String nuevoParametro, int opcion) {
    for (Contacto contacto : contactos) {
        if (contacto.getCelular().equals(celular)) {
            switch (opcion) {
                case 1:
                    contacto.setNombre(nuevoParametro);
                    break;
                case 2:
                    contacto.setCelular(nuevoParametro);
                    break;
                case 3: 
                    contacto.setCorreo(nuevoParametro);
                    break;
                case 4: 
                    contacto.setDireccion(nuevoParametro);
                default:
                    break;
            }
            return true;  
        }
    }
    return false;  
}

}
