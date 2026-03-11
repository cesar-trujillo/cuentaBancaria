//programar agenda de contacto
//nombre celular correo_electronico dirección
//agregar, consultar, eliminar
public class App {
    public static void main(String[] args) throws Exception {

        Agenda agenda = new Agenda();

        Contacto contacto1 = new Contacto("contacto1", "123456789" , "hola@gmail.com", "pajapan");
        Contacto contacto2 = new Contacto("contacto2", "987654321" , "adios@gmail.com", "japon");


        agenda.setContactos(contacto1);
        agenda.setContactos(contacto2);

        for (Contacto c : agenda.getContactos()) {
            System.out.println(c);
        }

        agenda.eliminarContacto("12345678");

        for (Contacto c : agenda.getContactos()) {
            System.out.println(c);
        }
    }
    
}
