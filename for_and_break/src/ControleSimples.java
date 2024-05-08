
    import java.util.Scanner;


public class ControleSimples {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 


        double limiteDiario = scanner.nextDouble();
        
        for(double valorPrimeiroSaque = 0; valorPrimeiroSaque < limiteDiario; valorPrimeiroSaque++) {
          
          valorPrimeiroSaque = scanner.nextDouble();
          
          if(valorPrimeiroSaque == 0) {
            break;
          }
          else if(valorPrimeiroSaque <= limiteDiario) {
            limiteDiario -= valorPrimeiroSaque;
            System.out.println("Saque realizado. Limite restante: " + String.format("%.1f",limiteDiario));
          }
          else  {
              System.out.print("Limite diario de saque atingido. ");
          }   
              
        }

        System.out.println("Transacoes encerradas."); 
        scanner.close(); 
    }
}
    
