import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Yazilimci yazilimci = new Yazilimci("Zeynep", "DURNA", "1", "JAVA");
		Yönetici yonetici = new Yönetici("Mehmet", "Aydin", "2", 3);

		System.out.println("Calisanlar programina Hosgeldiniz");
		String islemler = "islemler...\n" + "1. Yazilimci islemleri\n" + "2. Yonetici islemleri\n"
				+ "Cikis icin q'ya basin";
		System.out.println("***************************");
		System.out.println(islemler);
		System.out.println("***************************");

		while (true) {
			System.out.println("Yapmak isteginiz islemi seciniz");
			String islem = scanner.next();
			if (islem.equals("1")) {
				System.out.println("Yazilimci islerine Hosgeldiniz");
				System.out.println("1. Format At");
				System.out.println("2. Bilgileri Goster");
				System.out.println("cikis yapmak q'ya basiniz");

				while (true) {
					System.out.println("Yapmak isteginiz islemi seciniz");
					String yazilimciislemi = scanner.next();

					if (yazilimciislemi.equals("1")) {
						yazilimci.FormatAt("Windows");
					} else if (yazilimciislemi.equals("2")) {
						yazilimci.BilgileriGöster();
					} else if (yazilimciislemi.equals("q")) {
						System.out.println("Yazilimci islemlerinden cikiliyor...");
						break;
					} else {
						System.out.println("Yanlis giris yaptiniz. Tekrar deneyiniz! ");
					}
				}
			} else if (islem.equals("2")) {
				System.out.println("Yonetici islemlerine Hosgeldiniz");
				System.out.println("1. Zam Yap");
				System.out.println("2. Bilgileri Goster");
				System.out.println("cikis yapmak q'ya basiniz");
				while (true) {
					System.out.println("Yapmak isteginiz islemi seciniz");
					String yoneticiislemi = scanner.next();
					if (yoneticiislemi.equals("1")) {
						System.out.println("Lütfen zam miktarini belirtiniz:");
						int zam = scanner.nextInt();
						yonetici.zamyap(zam);
					} else if (yoneticiislemi.equals("2")) {
						yonetici.BilgileriGöster();
					} else if (yoneticiislemi.equals("q")) {
						System.out.println("Yonetici islemlerinden cikiliyor...");
						break;
					} else {
						System.out.println("Yanlis giris yaptiniz. Tekrar deneyiniz! ");
					}
				}

			} else if (islem.equals("q")) {
				System.out.println("calisan programindan cikiliyor...");
				break;
			} else {
				System.out.println("Yanlis giris yaptiniz. Tekrar deneyiniz! ");
			}

		}

	}

}
