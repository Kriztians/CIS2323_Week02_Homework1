import java.util.Scanner;
public class CIS2323_Week02_Homework1 {
	public static void main(String[] args){ 
	
		String verb;
		String adj;
		int age;
		String verb2;
		String adj2;
		String noun;
		String bodypart;
		int number = 4;
		int usernumber;
		String noun2;
		String adverb;
		float temperature = 103.6F;
		String noun3;
		String verb3;
		String noun4;
		String verb4;
		String blank;
	
		Scanner inputDevice = new Scanner(System.in);
		
	
		System.out.println("Give a verb");
		verb = inputDevice.nextLine();
		System.out.println("Give an age");
		age = inputDevice.nextInt();
		System.out.println();
		blank = inputDevice.nextLine();
		System.out.println("Give a adjective");
		adj = inputDevice.nextLine();
		System.out.println("Give another verb");
		verb2 = inputDevice.nextLine();
		System.out.println("Give a adjective");
		adj2 = inputDevice.nextLine();
		System.out.println("Give a noun");
		noun = inputDevice.nextLine();
		System.out.println("name a bodypart");
		bodypart = inputDevice.nextLine();
		System.out.println("Give a number");
		usernumber = inputDevice.nextInt();
		System.out.println();
		blank = inputDevice.nextLine();
		System.out.println("Give another noun");
		noun2 = inputDevice.nextLine();
		System.out.println("Give adverb that ends in 'ly'");
		adverb = inputDevice.nextLine();
		System.out.println("Give another noun");
		noun3 = inputDevice.nextLine();
		System.out.println("Give another verb");
		verb3 = inputDevice.nextLine();
		System.out.println("Give the last noun");
		noun4 = inputDevice.nextLine();
		System.out.println("Give the final verb");
		verb4 = inputDevice.nextLine();
		
		System.out.println("I found a book on how to " + verb + " a baby ages " + age + " and up.");
		System.out.println("There are " + adj + " ways to make it stop crying. If you pick it"); 
		System.out.println("up and " + verb2 + " it, it will stop.");
		System.out.println("One reason why it might be crying is");
		System.out.println("it wants its " + adj2 + noun + " give it to the baby.");
		System.out.println("When you pick up an infant remember to hold");
		System.out.println("it by the " + bodypart + " gently swing it.");
		System.out.println("If you flip the chapter to 'good parenting'");
		System.out.println("on page " + number + usernumber + ". You will fine an illustration");
		System.out.println("of a parent holding their " + noun2 + " with a pacifier.");
		System.out.println("It dipicts how to hold a baby. Also it mentions the don't let the baby reach");
		System.out.println(","+ temperature + " degre fahrenheit that is a high fever. As it gets");
		System.out.println("tired " + adverb + " place it in its " + noun3 + " and begin to " + verb3 + " it. As you can");
		System.out.println("see it's easy to take care of an infant. The book was written");
		System.out.println("by a " + noun4 + " with a PhD. Anyone who reads this book has more");
		System.out.println("knowledge on how to " + verb4 + " a baby.");
		
	}
}