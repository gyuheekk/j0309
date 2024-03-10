package t4_0309;

public class BunsikService {
	public void Price(Bonsa menuPrice) {
		System.out.println("------------------"+menuPrice.getFranchise()+"메뉴판------------------------");
		System.out.println("=====================================================");
		System.out.println("김치찌개\t\t\t"+menuPrice.getKimchistew());
		System.out.println("부대찌개\t\t\t"+menuPrice.getSausagestew());
		System.out.println("비빔밥\t\t\t"+menuPrice.getBibimbap());
		System.out.println("순대국\t\t\t"+menuPrice.getSundaesoup());
		System.out.println("공기밥\t\t\t"+menuPrice.getSteamedrice());
		System.out.println("=====================================================");
	}
}
