package javaprojects;

 abstract class AbstractExample1 {
	abstract void ATM();
 }	
	class Bank extends AbstractExample1{
		void ATM() {
			System.out.println("ATM MACHINE USING JAVA");
		}
	}
	public class AbstractExample {
		

	public static void main(String[] args) {
		Bank b =new Bank();
		b.ATM();
		
		

	}

}
