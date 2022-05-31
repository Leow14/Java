import java.util.Scanner;

    public class ex1{
        public static void main(String[] args){
            System.out.print("Informe o numero: ");
            Scanner in = new Scanner(System.in);
            
            int nome = in.nextInt();
            System.out.print("Informe outro: ");
            int numero = in.nextInt();
           
            if(nome > numero){
                System.out.println("O maior numero eh" + nome);
            }
    
    
            if(nome < numero){
                System.out.println("O maior numero eh" + numero);
    
            }
            
            
        }
    }