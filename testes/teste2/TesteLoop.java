package teste2;

public class TesteLoop {
    public static void main(String[] args) {
        
        int x = 1;

        System.out.println("Antes do loop.");

        while (x < 5) {
            System.out.println("Estamos no loop.");
            System.out.println("O valor de x é " + x);
            x = x + 1;
        }

        System.out.println("Depois do loop.");

    }

}
