import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
        System.out.println("Student Marks");
        System.out.println("");
		System.out.println("Maths");
		int mat = get.nextInt();
		System.out.println("Tamil");
		int tam= get.nextInt();
		System.out.println("English");
		int eng=get.nextInt();
		System.out.println("social");
		int soc= get.nextInt();
		System.out.println("science");
		int sci=get.nextInt();
		
		int sum = mat+tam+eng+soc+sci;
		System.out.println("TOTAL MARKS" + sum);
		
		if (sum>450) {
			System.out.println("Grade A");
			
		}else if ((sum>400) && (sum<=450)) {
		 System.out.println("Grade B");
		}else if ((sum>=300) && (sum<400)){
			System.out.println("Grade C");
		}else {
			System.out.println("Fail");
		}
	}
	
		
	}


