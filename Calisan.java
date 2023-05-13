public class Calisan {
	// özellik alanları
	private String ad;
	private String soyad;
	private String id;

	// Yapıcı Metod: nesne üretirken değer atamasına
	public Calisan(String ad, String soyad, String id) {
		this.ad = ad;
		this.soyad = soyad;
		this.id = id;
	}

	public void BilgileriGöster() {
		System.out.println("Calisan Adi:" + getAd());
		System.out.println("Calisan Soyadi:" + getSoyad());
		System.out.println("Calisan ID:" + getId());

	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
