import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        X x = new X();
        x.x();
    }

    public static class X {
        private int x;

        public X() {
            System.out.println("Enter a number.");
            Scanner x = new Scanner(System.in);
            this.x = x.nextInt();
        }

        public void x() {
            for (int x = 0; x < 10; x++) {
                System.out.println(this.x + " times " + x + " equals " + (this.x * x));
            }
        }
    }
}
