package springmvc.model;

public class kullanici {
	private String isim;
	private String soyisim;
	private String adres;
	private String telefon;
	private String eposta;
	private String dogumTarihi;
	private String ticaretleUgrastinizMi;
	private String tercihSebebi;
	private String neredeDukkanAcmakIstersiniz;
	private int yatirimMiktari;
	private String eklenecekler;
	
	public kullanici(){
		super();
	}
	
	

	public kullanici(String isim,String soyisim,String adres,String telefon,String eposta,
			String dogumTarihi,String ticaretleUgrastinizMi,String tercihSebebi,
			String neredeDukkanAcmakIstersiniz,int yatirimMiktari,String eklenecekler){
		super();
		this.isim=isim;
		this.soyisim=soyisim;
		this.adres=adres;
		this.telefon=telefon;
		this.eposta=eposta;
		this.dogumTarihi=dogumTarihi;
		this.ticaretleUgrastinizMi=ticaretleUgrastinizMi;
		this.tercihSebebi=tercihSebebi;
		this.neredeDukkanAcmakIstersiniz=neredeDukkanAcmakIstersiniz;
		this.yatirimMiktari=yatirimMiktari;
		this.eklenecekler=eklenecekler;
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getEposta() {
		return eposta;
	}
	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	public String getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	public String getTicaretleUgrastinizMi() {
		return ticaretleUgrastinizMi;
	}
	public void setTicaretleUgrastinizMi(String ticaretleUgrastinizMi) {
		this.ticaretleUgrastinizMi = ticaretleUgrastinizMi;
	}
	public String getTercihSebebi() {
		return tercihSebebi;
	}
	public void setTercihSebebi(String tercihSebebi) {
		this.tercihSebebi = tercihSebebi;
	}
	public String getNeredeDukkanAcmakIstersiniz() {
		return neredeDukkanAcmakIstersiniz;
	}
	public void setNeredeDukkanAcmakIstersiniz(String neredeDukkanAcmakIstersiniz) {
		this.neredeDukkanAcmakIstersiniz = neredeDukkanAcmakIstersiniz;
	}
	public int getYatirimMiktari() {
		return yatirimMiktari;
	}
	public void setYatirimMiktari(int yatirimMiktari) {
		this.yatirimMiktari = yatirimMiktari;
	}
	public String getEklenecekler() {
		return eklenecekler;
	}
	public void setEklenecekler(String eklenecekler) {
		this.eklenecekler = eklenecekler;
	}
	
	
	
}
