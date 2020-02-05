import java.util.*;

public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("choose your bank \n 1. ICIC\n 2. HDFC\n 3. SC\n 4. SBI");
		int choose;
		Scanner s = new Scanner(System.in);
		choose = s.nextInt();
		if(choose==1 | choose==2|choose==3|choose==4 ) {
			Bank bank = new Bank("ICICI");
			Customer customer = new Customer("ravi", bank, 12344);
			customer.addBalance(1000);
			customer.withdrawBalance(500);
			customer.checkBalance();
		}
	}

}
