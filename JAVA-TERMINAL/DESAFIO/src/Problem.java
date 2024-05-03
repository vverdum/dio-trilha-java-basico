import java.util.Locale;
import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		
		System.out.println("Digite o primeiro numero");
        int A = sc.nextInt();
		
		System.out.println("Digite o segundo numero");
		int B = sc.nextInt();
		

		 //Complete os espaços em branco  
		int PROD =  A*B;  

		System.out.println("PROD = " +  PROD   );
		sc.close();
	}

}