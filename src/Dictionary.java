

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dictionary {
	
private ArrayList<String> words;
private String fileName;

	
	public Dictionary() throws FileNotFoundException {
		this.fileName = "words.txt"; //change this to use a different file of words.
		// read in the file
				Scanner input = new Scanner(new File(fileName));
				//Creates lives left count
				
				words = createArrayList(fileName);	
				// read in the file, one line at a time
				while (input.hasNextLine()) {
					String line = input.nextLine();
					// make everything lower case
					line = line.toLowerCase();
				}
			words = eightLetterWords(words);	
}
	 
	
	public void printTry(){
		int theSize = this.words.size();
		System.out.println("The array list size: " + theSize);
	}

	private ArrayList<String> createArrayList(String theFileName) throws FileNotFoundException{
		// read in the file
		Scanner input = new Scanner(new File(theFileName));
		// create an array list, to put the words into
		ArrayList<String> words = new ArrayList<String>();
		
		// read in the file, one line at a time
		while (input.hasNextLine()) {
			String line = input.nextLine();
			// make everything lower case
			line = line.toLowerCase();
			words.add(line);
		}
		// Display the size of the array list
		return words;
	}
	
	public String getRandomWord() {
		Random r = new Random();
		int random = r.nextInt(this.words.size() - 1);
		return this.words.get(random);
	}
	
	
	
	public int loseLife(int lives) {
		lives--;
		return lives;
	}
	
	
	
	public ArrayList<String> getWords() {
		return this.words;
	}
	
	public static ArrayList<String> eightLetterWords(ArrayList<String> words){
		ArrayList<String> eights = new ArrayList<String>();
		for (int i = 0; i < words.size(); i++){
			if (words.get(i).length() == 8){
				eights.add(words.get(i));
			}
		}
		return eights;
	}

	
}


