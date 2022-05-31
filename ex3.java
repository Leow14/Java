import java.util.Scanner;

    public class ex3{

        public static void main(String[] args){
            System.out.print("Informe o numero: ");
            Scanner in = new Scanner(System.in);
            int nome1 = in.nextInt();
            System.out.print("Informe outro: ");
            int nome2 = in.nextInt();
            System.out.print("Informe outro: ");
            int nome3 = in.nextInt();
           
            if( nome1 > nome2 && nome1 > nome3 ){
                System.out.println("O maior numero eh" + nome1);
            }
        
    
            if( nome2 > nome3 && nome2 > nome1 ){
                System.out.println("O maior numero eh" + nome2);
    
            }

            if( nome3 > nome1 && nome3 > nome2 ){
                System.out.println("O maior numero eh" + nome3);
            }
            
            
        }
    }