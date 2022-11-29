
public class variable {
	 static int a = 55, b = 99;
		public static void TC_101() {
			System.out.println(a);
		}
	public static void TC_102() {
			System.out.println(b);
		}
	public static void TC_103() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		testing a = new testing();
		TC_101();
		TC_102();
		TC_103();
}
}