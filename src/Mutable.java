
public class Mutable {
public static void main(String[] args) {
	System.out.println("Mutable");
	StringBuffer a = new StringBuffer("Hello");
	StringBuffer b = new StringBuffer("Hello");
	System.out.println(a);
	System.out.println(System.identityHashCode(a));
	System.out.println(b);
	System.out.println(System.identityHashCode(b));
    StringBuffer append = a.append(b);
	System.out.println(append);
	System.out.println(System.identityHashCode(append));
}
}

