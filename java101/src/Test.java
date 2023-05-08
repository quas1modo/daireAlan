import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        int r, a;

        System.out.println("Yarıçap giriniz: ");
        r = input.nextInt();
        System.out.println("Açı giriniz: ");
        a = input.nextInt();

        double sonuc = (pi * (r*r) * a) / 360;
        System.out.printf("Alan: " + sonuc);

    }
}
