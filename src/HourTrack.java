import java.util.Scanner;

public class HourTrack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Часы, минуты, секунды: ");
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        System.out.printf("%.2f ", (double) ((hour * 3600) + (minute * 60) + scan.nextInt()) / 3600);

    }
}
