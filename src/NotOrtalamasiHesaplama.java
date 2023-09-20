import java.util.Scanner;

public class NotOrtalamasiHesaplama {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Matematik notunuzu girin: ");
		double matematik = scanner.nextDouble();

		System.out.print("Fizik notunuzu girin: ");
		double fizik = scanner.nextDouble();

		System.out.print("Kimya notunuzu girin: ");
		double kimya = scanner.nextDouble();

		System.out.print("Türkçe notunuzu girin: ");
		double turkce = scanner.nextDouble();

		System.out.print("Tarih notunuzu girin: ");
		double tarih = scanner.nextDouble();

		System.out.print("Müzik notunuzu girin: ");
		double muzik = scanner.nextDouble();

		scanner.close();

		double toplam = matematik + fizik + kimya + turkce + tarih + muzik;
		double ortalama = toplam / 6;

		System.out.println("Derslerin Ortalaması: " + ortalama);

		String sonuc = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
		System.out.println(sonuc);
	}
}
