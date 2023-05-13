
public class Yönetici  extends Calisan {

	private int sorumlu_kisisayisi;
	
	public Yönetici(String ad, String soyad, String id, int sorumlu_kisisayisi) {
		super(ad, soyad, id);
	    this.sorumlu_kisisayisi=sorumlu_kisisayisi;
	}
	
	@Override
	public void BilgileriGöster() {
		super.BilgileriGöster();
		System.out.println("Yöneticiden sorumlu olduğu kişi sayısı: " +sorumlu_kisisayisi);
	}
	
	public void zamyap(int zam_miktari) {
		System.out.println(getAd()+ zam_miktari+" TL zam yapıyor...");
	}

	
}
