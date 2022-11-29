
public class fullyabstractionclass implements Fullabstraction {

	@Override
	public void Savingsaccount() {
		System.out.println("Bank Name : Punjab National Bank");
		
	}

	@Override
	public void currentaccount() {
		System.out.println("Bank Name : Digital Bank");
		
	}
    public static void main(String[] args) {
		fullyabstractionclass toget = new fullyabstractionclass();
		toget.Savingsaccount();
		toget.currentaccount();
	}
}
