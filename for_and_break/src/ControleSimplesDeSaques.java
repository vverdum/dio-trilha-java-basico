import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    double limiteDiario = scanner.nextDouble();
    
        for (int i = 1; i <= 10;) {
        
        double saque = scanner.nextDouble();
             
                     
        if (saque == 0) {
            break;
        } else if (saque > limiteDiario) {
            System.out.print("Limite diario de saque atingido. ");
            break;
                       
        } else {
         
            limiteDiario -= saque;
            System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            
        }
    }
    System.out.println("Transacoes encerradas."); 

    

    
    scanner.close(); 
    
    }

}