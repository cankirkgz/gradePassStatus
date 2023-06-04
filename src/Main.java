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
        // Prompt the user to enter the grades for each subject
        // Her bir derse ait notları kullanıcıdan isteyin
        matematik = scanner.nextInt();
        fizik = scanner.nextInt();
        turkce = scanner.nextInt();
        kimya = scanner.nextInt();
        muzik = scanner.nextInt();

        if (!((matematik >= 0) && (matematik <= 100)) || !((fizik >= 0) && (fizik <= 100))
                || !((turkce >= 0) && (turkce <= 100)) || !((kimya >= 0) && (kimya <= 100))
                || !((muzik >= 0) && (muzik <= 100))) {
            // Print an error message if any grade is out of range
            // Eğer herhangi bir not geçerli aralığın dışında ise hata mesajı yazdırılır
            System.out.println("Notlar 0 ile 100 aralığında olmalı");
        } else {
            // Calculate the average grade
            // Ortalama not hesaplanır
            ort = ((double) (matematik + fizik + turkce + kimya + muzik)) / 5;

            // Check if the average grade is greater than or equal to 55
            // Ortalama not 55'ten büyük veya eşitse kontrol edilir
            if (ort >= 55) {
                // Print a success message if the average grade is greater than or equal to 55
                // Eğer ortalama not 55'ten büyük veya eşitse başarı mesajı yazdırılır
                System.out.println("Tebrikler! Sınıfı geçtiniz. Ortalamanız: " + ort);
            } else {
                // Print a failure message if the average grade is less than 55
                // Eğer ortalama not 55'ten küçükse başarısızlık mesajı yazdırılır
                System.out.println("Malesef sınıfı geçemediniz. Ortalamanız: " + ort);
            }
        }
    }
}