class Input {
    public String entrada(String[] args){

        if (args.length != 3) {
            throw new IllegalArgumentException("Error: Ingresa el primer digito, el operador y el segundo digito");
        }else{
            try {
                Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Entrada Incorrecta: " + args[0]);
            }

            try {
                Integer.parseInt(args[2]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Entrada Incorrecta: " + args[2]);
            }
        }
        
        int resultado = 0;

        switch (args[1].charAt(0)) {
            case '+':
                resultado = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-':
                resultado = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '*':
                resultado = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/':
                resultado = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;
        }

        return ((args[0] + ' ' + args[1] + ' ' + args[2] + " = " + resultado));

    }
}

public class Calculadora {
    public static void main(String[] args) { 

        try {
            Input entrada = new Input();
            System.out.println(entrada.entrada(args));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}