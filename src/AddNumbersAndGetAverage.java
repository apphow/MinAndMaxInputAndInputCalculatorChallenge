import java.util.Scanner;

public class AddNumbersAndGetAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        long average = 0;
        
while(true) {
    boolean isAnInt = scanner.hasNextLong();

    if (isAnInt) {
        double number = scanner.nextInt();
        sum += number;
        count++;
        average = (long) Math.round(sum / count);

    } else {
        break;
    }

    scanner.nextLine();
}

        System.out.println("SUM = " + Math.round(sum) + " AVG = " + average);

        scanner.close();

    }
}


