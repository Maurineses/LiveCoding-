import java.util.Scanner;

public class FrutasCaja {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Escribe el numero del mes (1-12): ");
        int month= in.nextInt();
        String monthString;
        switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        	System.out.println("El mes tiene 31 días");
        	break;
        case 4:
        case 6:
        case 9:
        case 11:
        	System.out.println("El mes tiene 30 días");
        	break;
        	default: 
        		System.out.println("El mes tiene 28/29 días");
        		break;
        } //switch 
        in.close();
		
	}
	
}
