package principalpc22;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PrincipalPC22 {

    public static void main(String[] args) {
    Scanner i = new Scanner (System.in);    
    
    int N1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el 1° numero: "));
    int N2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el 2° numero: "));
    
    Resta R = new Resta();
    
    JOptionPane.showMessageDialog(null,"Resultado: "+ R.Restar(N1, N2)+".");     
    }
    
}
