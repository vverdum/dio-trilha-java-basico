import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();
        // Verifica se as notas estão dentro do intervalo permitido
        if (A < 0 || A > 10 || B < 0 || B > 10 || (A*10) %1==0|| (B*10) %1==0) {
            System.out.println("As notas devem estar entre 0 e 10.0");
        } else {
          double pesoA = 3.5;
          double pesoB = 7.5;
          double somaPesos = pesoA + pesoB;
            media = ((A*pesoA)+(B*pesoB))/(somaPesos); 
            System.out.printf("MEDIA = %.5f\n", media);
            
        }

        

            //Complete os espaços em branco 
        

       
        sc.close();
        
    }
}