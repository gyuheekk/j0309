package t4_0309;

public abstract class Bonsa {
	
	public abstract void menuPrice(); //메뉴가격
	private String franchise;
	private String kimchistew;
	private String sausagestew;
	private String bibimbap;
	private String sundaesoup;
	private String steamedrice;
	
	public String getKimchistew() {
		return kimchistew;
	}
	public void setKimchistew(String kimchistew) {
		this.kimchistew = kimchistew;
	}
	public String getSausagestew() {
		return sausagestew;
	}
	public void setSausagestew(String sausagestew) {
		this.sausagestew = sausagestew;
	}
	public String getBibimbap() {
		return bibimbap;
	}
	public void setBibimbap(String bibimbap) {
		this.bibimbap = bibimbap;
	}
	public String getSundaesoup() {
		return sundaesoup;
	}
	public void setSundaesoup(String sundaesoup) {
		this.sundaesoup = sundaesoup;
	}
	public String getSteamedrice() {
		return steamedrice;
	}
	public void setSteamedrice(String steamedrice) {
		this.steamedrice = steamedrice;
	}
	public String getFranchise() {
		return franchise;
	}
	public void setFranchise(String franchise) {
		this.franchise = franchise;
	}
}