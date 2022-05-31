import java.util.Scanner;

    public class ex4{

        public static void main(String[] args){
            System.out.print("Informe o numero: ");
            Scanner in = new Scanner(System.in);
            int nome1 = in.nextInt();
            System.out.print("Informe outro: ");
            int nome2 = in.nextInt();
            System.out.print("Informe outro: ");
            int nome3 = in.nextInt();
           
            if( nome1 > nome2 && nome1 > nome3 ){
                //Numero1 é o maior
                System.out.println("O maior numero eh" + nome1);
                if(nome2 > nome3){

                    //Numero2 é o maior
                    System.out.println("A soma dos maiores numeros" + (nome2 + nome1));

                }

                if(nome3 > nome2){
                    //Numero3 é o maior
                    System.out.println("A soma dos maiores numeros" + (nome3 + nome1));
                }
            }
        
    
            if( nome2 > nome3 && nome2 > nome1 ){
                //Numero2 é o maior
                if(nome1 > nome3){
                    //Numero1 é o maior
                    System.out.println("A soma dos maiores numeros" + (nome1 + nome2));
                }

                if(nome3 > nome1){
                    //Numero3 é o maior
                    System.out.println("A soma dos maiores numeros" + (nome3 + nome2));
                }
                System.out.println("O maior numero eh" + nome2);
    
            }

            if( nome3 > nome1 && nome3 > nome2 ){
                //Numero3 é o maior
                if(nome2 > nome1){
                    //Numero2 é o maior
                    System.out.println("A soma dos maiores numeros" + (nome2 + nome3));
                }

                if(nome1 > nome2){
                    //Numero1 é o maior
                    System.out.println("A soma dos maiores numeros" + (nome1 + nome3));
                }
                System.out.println("O maior numero eh" + nome3);
            }
            
            in.close();
        }
    }