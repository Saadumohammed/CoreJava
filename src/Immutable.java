
public class Immutable {
	public static void main(String[] args) {
		System.out.println("IMMUTABLE");
		String A = "HELLO";
		String B = "HELLO";
		System.out.println(A);
		System.out.println(System.identityHashCode(A));
		System.out.println(B);
		System.out.println(System.identityHashCode(B));	 
		String concat = A.concat(B);
		System.out.println(concat);
		System.out.println(System.identityHashCode(concat));
			}
		}

