public class EssaiEasyDate {
	
	public static void main(String[] args) {
		EasyDate date = new EasyDate("11/11/1996");
		EasyDate date2 = new EasyDate("11/11/1996");
		System.out.println(date);
		System.out.println(date.compareTo(date2));
		System.out.println(date.equals(date2));
	}
}
