import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double kdvOran1 = 0.18; // miktar 0-1000 arasında ise kullanılan KDV oranı
		double kdvOran2 = 0.08; // miktar >1000 ise kullanılan KDV oranı

		System.out.print("Lütfen miktar girin: ");
		double para = scanner.nextDouble();
		scanner.close();

		double kdvNe = (para < 1000) ? kdvOran1 : kdvOran2; // Girilen paraya göre hangi kdv kullanılacak.

		double kdvTutar = para * kdvNe; // Girilen paranın Kdv Tutarı nekadar olduğu belirleniyor.
		double toplamTutar = para + kdvTutar;

		System.out.println("Uygulanan KDV Oranı: " + kdvNe);
		System.out.println("KDV Tutarı: " + kdvTutar);
		System.out.println("Toplam KDV'li Tutar: " + toplamTutar);

	}

}
