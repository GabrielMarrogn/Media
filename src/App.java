import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble() * 3.5;
        double b = sc.nextDouble() * 7.5;
        double media = (a+b)/11;
        sc.close();
        DecimalFormat decimal = new DecimalFormat("0.00000");
     
        System.out.println("MEDIA = " +decimal.format(media));
    }
}
