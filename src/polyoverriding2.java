
public class polyoverriding2 extends polyoverriding1 {
public void Boy() {
	System.out.println("Mohammed Sadiq");
}
public static void main(String[] args) {
	polyoverriding1 r=new polyoverriding2();
	r.Girl();
}
}

