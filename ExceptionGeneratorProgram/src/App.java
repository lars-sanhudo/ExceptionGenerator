import java.util.Scanner;
import ExceptionGenerator.*;

public class App{
    public static void main(String[] args) throws Exception {
        try{
                System.out.println("EXCEPTION GENERATOR");
                System.out.println("What expection do you want to generate ?");
                Scanner fin = new Scanner(System.in);
                int i = 0;
                ExceptionGenerator exc;

                do{
                    System.out.print("ArithmeticException - Digite 1 \n");
                    System.out.print("ArrayIndexOutOfBoundsException - Digite 2 \n: ");
                    i = fin.nextInt();
                    switch(i){
                        case 1:
                            exc = new ArithmeticExceptionGenerator();
                            exc.Generator();
                            break;
                        case 2:
                            exc = new ArrayIndexOutOfBoundsExceptionGenerator();
                            exc.Generator();
                            break;
                        default:
                            System.out.println("Opção Inválida.");
                            System.out.println("Digite uma das Opções Válidas.");
                            break;
                        }
                }while(i != 1 || i !=2);
                fin.close();

                
            }
            catch(ArithmeticException exc){
                System.out.println("ArithmeticException Catch.");
            }
            catch(ArrayIndexOutOfBoundsException exc){
                System.out.println("ArrayIndexOutOfBoundsException Catch.");
            }
    }
    
}
