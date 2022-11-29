
public class Partialabstraction1 extends Partialabstraction{

	
	@Override
	public void Punjabnationalbank() {
		System.out.println("Punjab national Bank : Savings Account Number : ");
		System.out.println("76453786");
		
	}

	@Override
	public void DIGIBANK() {
		System.out.println(" Digi Bank : Savings Account no");
		System.out.println("12332232");
		
		
	}
	

	@Override
	public void Kotakmahindrabank() {
		System.out.println("Kotak Mahindra Bank : Current Account");
		System.out.println("983776262");
		
	}
	
	public static void main(String[] args) {
		Partialabstraction1 P= new Partialabstraction1();
		P.DIGIBANK();
		P.Punjabnationalbank();
		P.Kotakmahindrabank();

}
}