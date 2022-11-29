
public class vari {
public vari() {
	this("test");
	System.out.println("AM DEFAULT CONSTRUCTOR");
	
}
public vari(int a) {
	this("");
	System.out.println("AM INT CONSTRUCTOR");
}
public vari(boolean b) {
	this(true);
	System.out.println("AM CHAR CONSTRUCTOR");
}
public vari (String a) {
	System.out.println("AM STRING CONSTRUCTOR");
	
}
public static void main(String[] args) {
	vari a = new vari();
}
	
}
