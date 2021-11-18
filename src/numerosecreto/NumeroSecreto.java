package numerosecreto;

import javax.swing.*;

/**
 * @author Yerlis Tatiana González García & Daniel Santamaría Tavera
 */
public class NumeroSecreto {

    public static void main(String[] args) {

        int numeroMinimo = 1;
        int numeroMaximo = 100;
        int numeroIntentos = 0;
        int numeroAleatorio = (int)(Math.random()*(numeroMaximo-numeroMinimo)+numeroMinimo);

        String opcionJuego = JOptionPane.showInputDialog("Bienvenido al Número secreto.\n" +
                "Digita 1 nivel fácil(sin limite de intentos)\n" +
                "Digita 2 nivel difícil(Tienes 3 intentos)");

        while(numeroIntentos < 3 || opcionJuego.equals("1")){
            boolean numeroValidado = false;
            int numUsuario = 1;

            while (numeroValidado == false){
                try{
                    String numeroIngresado = JOptionPane.showInputDialog("Digite un número:\n"+"Para salir pulsa cero");
                    numUsuario = Integer.parseInt(numeroIngresado);
                    numeroValidado = true;
                }catch (Exception e){JOptionPane.showMessageDialog(null, "Ingrese una opción válida",
                        "El número secreto", JOptionPane.ERROR_MESSAGE); numeroValidado = false;}
            }
            if (numUsuario == 0){
                break;
            } else if(numUsuario < numeroAleatorio){
                JOptionPane.showMessageDialog(null, "El número ingresado es menor al número secreto",
                        "El número secreto", JOptionPane.ERROR_MESSAGE);
                numeroIntentos++;
            } else if (numUsuario > numeroAleatorio){
                JOptionPane.showMessageDialog(null, "El número ingresado es mayor al número secreto",
                        "El número secreto", JOptionPane.ERROR_MESSAGE);
                numeroIntentos++;
            } else {
                JOptionPane.showMessageDialog(null, "Felicidades, adivinaste el número",
                        "El número secreto", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "¡Gracias por jugar!",
                "El número secreto", JOptionPane.INFORMATION_MESSAGE);
    }
}
