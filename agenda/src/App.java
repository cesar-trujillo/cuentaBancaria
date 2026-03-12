//programar agenda de contacto
//nombre celular correo_electronico dirección
//agregar, consultar, eliminar
public class App {
    public static void main(String[] args) throws Exception {

        Agenda agenda = new Agenda();

        Contacto contacto1 = new Contacto("contacto1", "123456789" , "hola@gmail.com", "pajapan");
        Contacto contacto2 = new Contacto("contacto2", "987654321" , "adios@gmail.com", "japon");
        Contacto contacto3 = new Contacto("contacto3", "987654321" , "adios@gmail.com", "japon");


        agenda.agregarContactos(contacto1);
        agenda.agregarContactos(contacto2);
        
        if(agenda.agregarContactos(contacto3)){
            System.out.println("se agrego el contacto");
        }else {
            System.out.println("el numero de telefono ya existe");
        }

        for (Contacto c : agenda.getContactos()) {
            System.out.println(c);
        }

        agenda.editarContacto("987654321", "987654312", 2);

        for (Contacto c : agenda.getContactos()) {
            System.out.println(c);
        }
    }
    
}
