package exceptionHandling;

public class Register {
	public static void checkEligiblity(int age) throws UnderAgeException{
		if (age > 18) {
			System.out.println("Congrat's You Are Eligible For Registration !!");
		}else {
			throw new UnderAgeException("You are only "+age+" So, You are Not Eligible !");
		}
	}

	public static void checkEligiblity1(int age) {
		// TODO Auto-generated method stub
		
	}
}
