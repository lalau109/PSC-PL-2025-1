import java.util.Scanner;

public class Entrada {

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in); // É necessário que o scanner fique dentro do escopo

            System.out.println("Digite sua idade");
            int idade = sc.nextInt();// o nextInt é limitado.
            sc.nextLine(); // Portanto use um nextLine logo em seguida.

            System.out.println("Digite seu nome");
            String nome = sc.nextLine();
            sc.close();

        }
        
    }

