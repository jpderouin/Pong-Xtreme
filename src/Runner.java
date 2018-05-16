import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner {
/*
 * This is the simplest part to write.
 */
	public static void main(String[] args) throws FileNotFoundException {

		boot();
	}
	public static void boot() throws FileNotFoundException {//Start
		System.out.println("Copyright 2018 Jake Derouin\n\nFor the best experience, please make the console window fullscreen.\n");
		System.out.println("Welcome to Hangman where the \ndeath penalty for incorrect guesses is still legal.");
	System.out.println("To enter story mode, type story then press ENTER to continue or press ENTER to enter classic mode");
	Scanner keyboard=new Scanner(System.in);
	if(keyboard.nextLine().equals("story")){
		boolean storymode=true;
		System.out.println("Loading... Please Wait");
		Hangman hangman=new Hangman(null, 0, storymode);
	}else {
	
	System.out.println("To view the rules, type rules or if you\'re the know it all type, type play to play the game");
	
	if(keyboard.nextLine().equals("rules")){
	rules();
	}else {
		System.out.println("Enter the name of the hangee (your name)");

		String name=keyboard.nextLine();
	System.out.println("Choose a difficulty between 1 and 3 (1 is the easist and 3 is the hardest)\n the harder the mode, the more your score will multiply.");
		int level=keyboard.nextInt();
		System.out.println("Loading... Please Wait");
	Hangman hangman=new Hangman(name, level, false);
	}}
		

	}
public static void rules() throws FileNotFoundException {//Rules of classic mode
	System.out.println("In Hangman you are the unfortunate citizen of Hangville where the preferred penalty for\n bad spelling guesses isn\'t a bad grade, but death by hanging");
	System.out.println("Press ENTER to continue");
	Scanner keyboard=new Scanner(System.in);
	if(keyboard.nextLine().equals(""));
	System.out.println("In this world, you are \"Spell\"-bounded to a magical stone that prevents you from dying until every limb of you is hung\n(yes, they hang you limb, by limb... it really does suck)");
			System.out.println("Press ENTER to continue");
			if(keyboard.nextLine().equals(""));
			System.out.println("How this game works, is you will try to guess one letter at a time.  If you guess correctly, letters are revealed.\nin the particular word you are trying to guess.  \nThis should make it easier for the next guess.\nGuess a letter wrong; however, one of your limbs gets hung.");
			System.out.println("Press ENTER to continue");
			if(keyboard.nextLine().equals(""));
			System.out.println("If all of your limbs get hung.... lets just say your teacher will be marking you absent for a very long time (you dead my man)");
			System.out.println("Press ENTER to continue");
			if(keyboard.nextLine().equals(""));
			System.out.println("SCORING:");
			System.out.println("As you play the game, you will not only be competing for your life, but your score as well.\nFor every letter you guess correctly you will be awarded points based on the letter you chose.\nLetters are given values based on their frequency of use in the English language (vowels are worth less than other letters)");
			System.out.println("Press ENTER to continue");
			if(keyboard.nextLine().equals(""));
			System.out.println("There are also multiplyers involved.\n The more lives you have remaining, the higher your score multiplyer will be.\n In addition, after multiplying your score by the amount of lives you had remaining.\n Your final score will be multiplied by the difficulty you choose. \n So have fun and try not to die");
			System.out.println("Press ENTER to reset");
			if(keyboard.nextLine().equals(""));
			boot();
}
}
