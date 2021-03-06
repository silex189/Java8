package chapter05_Other_Data_Types_And_Operators;

public class PhoneContactsFinder {
	public static void main(String[] args) {
		
		String numbers[][] = { 
			{ "Tom", "555-3322" },
			{ "Mary", "555-8976" },
			{ "Jon", "555-1037" },
			{ "Rachel", "555-1400" },
		};

		int i;

		if(args.length != 1)
			System.out.println("Usage: Java Phone <name>");
		else {
			for(i = 0; i < numbers.length; i++) {
				if(numbers[i][0].equals(args[0])){
					System.out.println(numbers[i][0] + ": " + numbers[i][1]);
					break;
				}
			}
			
			if(i == numbers.length)
				System.out.println("Name not found.");
		}

	}
}
