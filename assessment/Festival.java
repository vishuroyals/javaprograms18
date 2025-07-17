package assessment;

public class Festival {
	String FestivalName;
	String Country;
	String MonthCelebrated;

	public static void main(String[] args) {
		Festival obj = new Festival();
		obj.FestivalName = "Holi";
		obj.Country = "Udipi";
		obj.MonthCelebrated = "March";
		System.out.println("Festival Details");
		System.out.println("Festival Name:" + obj.FestivalName);
		System.out.println("Country:" + obj.Country);
		System.out.println("Celebrated Month:" + obj.MonthCelebrated);

	}
}
