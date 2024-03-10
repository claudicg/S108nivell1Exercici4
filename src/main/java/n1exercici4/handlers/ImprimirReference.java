package n1exercici4.handlers;

import java.util.Arrays;
import java.util.List;

public class ImprimirReference {

public void imprimir() {
		
		List<String> months = Arrays.asList("January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November", "December");
		
		months.forEach(System.out :: println);
	}
}
