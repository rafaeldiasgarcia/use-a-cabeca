package AppImportanteDeNegocios;

public class BottleSong {
    public static void main(String[] args) {
        int bottlesNum = 99;
        String word = "bottles";

        while (bottlesNum > 0) {
            
            if (bottlesNum == 1) {
                word = "bottle";
            }

            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println("And if on green bottle should accidentally fall, ");
            bottlesNum = bottlesNum - 1;

            if (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum + " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottle, hanging on the wall");
            }

        }
    }
}
