import java.util.Scanner;

public class WeightConvertor {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		double weight;
		double newWeight;
		int choice;
		
		
		System.out.println("Weight Conversion Program");
		System.out.println("1: Convert lbs to kgs");
		System.out.println("2: Convert kgs to lbs");
		
		System.out.print("Choose an option: ");
		choice = scanner.nextInt();
		
		if (choice == 1) {
			System.out.print("Enter weight in lbgs: ");
			weight = scanner.nextDouble();
			newWeight = weight * 0.453592;
			System.out.printf("The new weight in kgs is: %.2f", newWeight);
		}
		else if (choice == 2) {
			System.out.print("Enter weight in kgs: ");
			weight = scanner.nextDouble();
			newWeight = weight * 2.20462;
			System.out.printf("The new weight in lbs is: %.2f", newWeight);
		}
		else {
			System.out.println("That was not an option");
		}
		
		scanner.close();
		}
}
