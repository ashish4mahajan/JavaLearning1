package am;

public class VariableAssignment {

	public static void main(String[] args) {
		int catty=10;
		int dog=15;
		System.out.println("1. Number of cats are= "+catty);
		System.out.println("1. Number of Dogs are= "+dog);
		//Assignemnet Operator "="
		catty=dog;
		System.out.println("2. Number of cats are= "+catty);
		System.out.println("2. Number of Dogs are= "+dog);
		
		catty=dog;
		dog=20;
		System.out.println("3. Number of cats are= "+catty);
		System.out.println("3. Number of Dogs are= "+dog);

	}

}
