import javax.swing.JOptionPane;

public class Entrada_Joption {
    public static void main(String[] args){
String nome = JOptionPane.showInputDialog("Digite seu nome");
String idade = JOptionPane.showInputDialog("Digite a sua idade");
int idadeStr = Integer.parseInt(idade);
double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
JOptionPane.showMessageDialog(null, nome +  idadeStr + altura);



    }



    
}
