import java.io.FileNotFoundException;

public class teste1 {
    public static void main(String[] args) {
        int size = 27;
        String name = "Fido";
        Dog myDog = new Dog(name, size);
        int x = size - 5;
        if (x < 5) {
            myDog.bark(0);
        }

        while (x > 3) {
            myDog.play();
            x--; // Corrigido para evitar loop infinito
        }

        int[] munList = {2, 4, 6, 8};
        System.out.println("Hello");
        System.out.println("Dog: " + name);
        String num = "0";
        int z = Integer.parseInt(num); // Corrigido

        try {
            readTheFile("MyFile.txt");
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
    }

    // Exemplo de método readTheFile
    public static void readTheFile(String fileName) throws FileNotFoundException {
        // implementação fictícia
        throw new FileNotFoundException();
    }
}

// Exemplo de classe Dog
class Dog {
    String name;
    int size;

    Dog(String name, int size) {
        this.name = name;
        this.size = size;
    }

    void bark(int times) {
        System.out.println(name + " is barking " + times + " times!");
    }

    void play() {
        System.out.println(name + " is playing!");
    }
}
