import java.util.Scanner;

    public class ex2{
        public static void main(String[] args){
            System.out.print("Informe o numero: ");
            Scanner abacate = new Scanner(System.in);
            
            int numero = abacate.nextInt();
           
            if(0 > numero){
                System.out.println("O numero eh negativo");
            }
    
    
            if(0 < numero){
                System.out.println("O numero eh positivo");
    
            }

            if(0 == numero){
                System.out.println("O numero eh zero");
    
            }
            
            
        }
    }