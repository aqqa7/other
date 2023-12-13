import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        String name = System.getenv("NAME");
        String number = System.getenv("NUMBER");

        printExercise(name, number);

    }


    public static void printExercise(String name, String number) {
        if (name == null) {
            System.out.println("Please set the NAME environment variable.");
            return;
        }

        int repeatCount = 15;
        if (number != null) {
            try {
                repeatCount = Integer.parseInt(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid value for NUMBER environment variable. Using the default value of 15.");
            }
        }

        for (int i = 0; i < 15; i++) {
            int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
            System.out.println("Hello, I am " + name + " and I am printing the number " + i);
            try {
                Thread.sleep(randomNumber * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


}