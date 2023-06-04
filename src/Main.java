import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        int i = 0;
        double ort;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sırasıyla; Matematik, Fizik, Türkçe, Kimya, Müzik ders notlarınızı giriniz.");
        matematik = scanner.nextInt();
        fizik = scanner.nextInt();
        turkce = scanner.nextInt();
        kimya = scanner.nextInt();
        muzik = scanner.nextInt();

        if (!((matematik >= 0) && (matematik <= 100)) || !((fizik >= 0) && (fizik <= 100))
        || !((turkce >= 0) && (turkce <= 100)) || !((kimya >= 0) && (kimya <= 100))
        || !((muzik >= 0) && (muzik <= 100)))
            System.out.println("Notlar 0 ile 100 aralığında olmalı");
        else {
            ort = ((double) (matematik + fizik + turkce + kimya + muzik)) / 5;
            if (ort >= 55)
                System.out.println("Tebrikler! Sınıfı geçtiniz. Ortalamanız: " + ort);
            else
                System.out.println("Malesef sınıfı geçemediniz. Ortalamanız: " + ort);
        }
    }
}
