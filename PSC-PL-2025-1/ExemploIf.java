import javax.swing.JOptionPane;


public class ExemploIf {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
        if (numero > 0){
       JOptionPane.showMessageDialog(null," O numero " + numero + " é positivo " );

        }else{
            JOptionPane.showMessageDialog(null, " o numero " + numero + " é negativo ", null, numero);
            


       
        }
        
    }
    
}
