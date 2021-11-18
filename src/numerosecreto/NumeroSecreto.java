
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
        System.out.println(numeroAleatorio);
        JOptionPane.showMessageDialog(null, "Bienvenido al Número secreto. Tienes 3 intentos"
                + " para adivinar el número, "
                + "Para salir pulsa cero", "El número secreto", JOptionPane.INFORMATION_MESSAGE);
        while(numeroIntentos<3){
            String numeroIngresado = JOptionPane.showInputDialog("Digite un número: ");
            int numUsuario = Integer.parseInt(numeroIngresado);
            if (numUsuario==numeroAleatorio){
                JOptionPane.showMessageDialog(null, "Felicidades, has adivinado el número", "El número secreto", JOptionPane.INFORMATION_MESSAGE);
                break;
            }else if (numUsuario==0){
                 break;
            }else if(numUsuario<numeroAleatorio){
                JOptionPane.showMessageDialog(null, "El número ingresado es menor al número secreto", "El número secreto", JOptionPane.ERROR_MESSAGE);
                numeroIntentos++;
            }else if (numUsuario>numeroAleatorio){
                JOptionPane.showMessageDialog(null, "El número ingresado es mayor al número secreto", "El número secreto", JOptionPane.ERROR_MESSAGE);
                numeroIntentos++;
            }
        }
    } 
}
