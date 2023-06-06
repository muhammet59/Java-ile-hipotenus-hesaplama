import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double birinciKenar;
        double ikinciKenar;
        double hipotenus;

        Scanner s = new Scanner(System.in);

        System.out.println("Birinci kenari giriniz: ");
        birinciKenar = s.nextDouble();
        System.out.println("Ikinci kenari giriniz: ");
        ikinciKenar = s.nextDouble();
        hipotenus = (birinciKenar*birinciKenar)+(ikinciKenar*ikinciKenar);
        System.out.println("Hipotenüs= "+Math.sqrt(hipotenus));
    }
}