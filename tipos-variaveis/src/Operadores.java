public class Operadores {
    public static void main(String[] args) {
        
        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        int numero =5;
        System.out.println(numero ++); // incremento unário após impressão
        System.out.println(numero);
        System.out.println( --numero); //decremento unário antes da impressão

        boolean variavel = true;
        System.out.println(!variavel); //inverte a variavel booleana
        variavel= !variavel;
        System.out.println(variavel);
        System.out.println(!variavel);

        int a, b;
         a = 5;
         b = 6;
         //String resultado = " ";
         //if (a==b)
          //  resultado = "Verdadeiro";
        //else
           // resultado = "Falso";
           String resultado = (a==b)? "Verdadeiro": "Falso";

            System.out.println(resultado);








    }
}
