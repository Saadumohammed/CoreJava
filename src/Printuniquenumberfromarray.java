import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Printuniquenumberfromarray {
	public static void main(String[] args) {
		List <Integer> a = Arrays.asList(1,3,3,5,9,4,5);{
			List <Integer> bo = a.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println(bo.get(1));
		
	}
	
	
	}
}
