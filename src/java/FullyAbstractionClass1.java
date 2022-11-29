package java;

public class FullyAbstractionClass1 implements FullyAbstraction {

	public static void main(String[] args) {
		FullyAbstractionClass1 af = new FullyAbstractionClass1();
		af.nextPage();
		af.loginDetails();

	}

	@Override
	public void loginDetails() {
    System.out.println("Login Details");		
	}

	@Override
	public void nextPage() {
System.out.println("Next Page");		
	}

}
