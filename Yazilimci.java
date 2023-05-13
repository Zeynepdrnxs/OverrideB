
public class Yazilimci extends Calisan {
	//extends Calisan //counstructur olmadığı için hata verirdi
	
	private String bildigiDiller;

	
	
	public Yazilimci(String ad, String soyad, String id, String bildigiDilleri) {
		super(ad, soyad, id);
		this.bildigiDiller=bildigiDilleri;
	}



	public void FormatAt(String isletimsistemi) {
		
		System.out.println(getAd()+ isletimsistemi + " 'ni yüklüyor. " );
		
		
	}
	
	
}
