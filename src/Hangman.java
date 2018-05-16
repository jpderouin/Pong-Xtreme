//My Plus 1 is the story mode







import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;




public class Hangman {//Used to keep track of everything


	String name;//Name of player
	int score;//Score
	int tempscore;//Used for temp situations
	public String word;//The word that is being used.  From a dictionary in classic mode and predeturmined in story mode
	String progress;//Not used
	int misses;//Counts how many times an incorrect letter is guessed
	String guess;//The guess of the player
boolean willloselife;//Whether or not the player will lose a life
	int difficulty;//1 is easy 2 is medium and 3 is hard
	int wordlength;//The length of the selected word
	boolean storymode;//Filters out certain methods that are for the storymode only
	int storylocation;//Used for retrys 
	String storyhint;//The clue given in story mode
	String boss;//The name of the current boss in story mode
	int retrys;//An item that can be purchased in the in game store
	int cheatletters;//An item that can be purchased in the in game store
	int previousscore;//Used to reset score if a retry is used
	ArrayList<String> alreadyguessed;//Used to print already guessed letters
	boolean didwin;//Whetheer or not the player beat the boss
	boolean[] hasguessedcorrectly;//used for deturmining whether or not the player guessed correctly
	Dictionary d;//The dictionary
	
	
	/*
	 * Constructor
	 * this is a more complicated constructor than usual.
	 * use getWord from Dictionary to help create word, 
	 * write another method to make progress, call it in the constructor
	 */
	public Hangman(String name, int difficulty,boolean storymode) throws FileNotFoundException{
	
		d = new Dictionary();
		this.word = d.getRandomWord();
		this.storymode=storymode;//Whether or not story mode is active
		this.alreadyguessed = new ArrayList<String>();
		this.name=name;
		this.difficulty=difficulty;
		this.misses=0;
		if(storymode==true) {
			startstory();
		}else {
		
			wordassign();//Assigns a word
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
	startgame();
	}}
	
	public void startstory() throws FileNotFoundException {//The story
		// TODO Auto-generated method stub
		this.misses=0;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("???: .................");
	press();
	System.out.println("???: ............huh?");
	press();
		System.out.println("???: Oh hi I overslept....");
press();
		System.out.println("???: Welcome to the world of spellview a perfect society where everything is just perfect.");
	press();
		System.out.println("???: Or I mean where everything WAS perfect.");
		press();
		System.out.println("Prof. Spoder: My name is Professor Spoder and I am working on restoring my world to its once utopic state.");
		press();
		System.out.println("Prof. Spoder: Now before we go any further why dont you tell me your name.");
		press();
		System.out.println("Type your name then press ENTER to continue");
		this.name=keyboard.nextLine();
		System.out.println("Prof. Spoder: "+this.name+"... I have brought you here using the Z-warper I fixed up after it crashed into my house and I hope you can help our planet");
		press();
		System.out.println("Prof. Spoder: You see, one day a swarm of bees appeared in front of the nations capital and took President Webster hostage");
		press();
		System.out.println("Prof. Spoder: These werent just any bees however they were the genectially modified spelling bees that some kid created for their junior science fair project");
	press();
	System.out.println("Prof. Spoder: These bees HATE people mispelling for whatever reason and will hang anyone who mispells a word.");
	press();
	System.out.println("Prof. Spoder: I know I know bees hanging people its the most random thing in the world but its true.");
	press();
	System.out.println("Prof. Spoder: Anyway I am one of the last members of the spellbels a group of rebels fighting to overthrow the evil spelling bees and restore peace to spellview.");
	press();
	System.out.println("Prof. Spoder: However, I am to old to save the world so I am entrusting you to do it for me.");
	press();
	System.out.println("Prof. Spoder: Our intelligence group has recovered a classified encyclepedia that fell to Earth on the day of the Great Correction when the spelling Bees took over");
	press();
	System.out.println("Prof. Spoder: It is called the Beedex and it contains information on the whereabouts of important systems to the spelling bees control.");
	press();
	System.out.println("Prof. Spoder: On your quest you will encounter highly trained guards that the Spelling Bees have created/hired to protect their leaders and their control structure.");
	press();
	System.out.println("Prof. Spoder: They will attempt to hang you by challenging you to a spelling dual.");
	press();
	System.out.println("Prof. Spoder: In a spelling dual you have to guess the word the enemy is thinking of and spell it correctly to defeat your opponent");
	press();
	System.out.println("Prof. Spoder: Guess wrong too many times however.....you will die.  So no pressure.");
	press();
	System.out.println("Prof. Spoder: Before each spelling dual you will have the chance to buy helpful items from the shop using your money (score) that may possibly change the fate of your quest.");
press();
System.out.println("Prof. Spoder: "+this.name+"... you are our last hope.  Please set off and defeat the bee's leader to restore peace to our planet.");
press();
System.out.println("You struggled to sleep that night planning your quest in your mind.");
press();
location1();
	}
	public void location1() throws FileNotFoundException {//Chapter 1
		this.misses=0;
		this.storylocation=1;
		System.out.println("???: Good morning "+this.name+"!");
		press();
		System.out.println("Ben: My name is Ben I am Professor Spoder\'s escort");
		press();
		System.out.println("Ben: I am going to take you too the Tollbooth of Phantoms");
		press();
		System.out.println("You and Ben begin to drive but suddenly run into an area covered by a dense fog");
		press();
		System.out.println("Ben: Here it is, good luck!");
		press();
		System.out.println("You hear Ben drive off");
		press();
		System.out.println("You begin to walk into the deep fog covering the area around the tollbooth then suddenly...");
		press();
		System.out.println("???: MAHAHAHAHA WHO DARES STEP FOOT ON MY TOLLBOOTH");
		press();
		System.out.println("Whetherman: I am The Whetherman and the Bees have told me not to let intruders like you any further.");
		press();
		System.out.println("Whetherman: I CHALLENGE YOU TO A SPELLING DUAL!");
		press();
		
		this.boss="Whetherman";
		this.word="the odyssey";
		this.storyhint="One of the most well known pieces of greek literature written by Homer";
		dualprep();
		setupdual();
		if(this.didwin==true);
		System.out.println("Whetherman: Ah you think your sooo smart... TAKE THIS!");
		press();
		this.word="the hunger games";
		this.storyhint="A book staring Katniss Everdeen from District 12";
		setupdual();
		if(this.didwin==true);
		System.out.println("Whetherman: I am not done yet!");
		press();
		this.word="animal farm";
		this.storyhint="Orwell's allegory of the Russian Revolution";
		setupdual();
		if(this.didwin==true);
		System.out.println("Whetherman: NOOOOO!  YOU MAY HAVE BEATEN ME BUT YOU WILL NEVER OVERTHROW THE BEES!");
		press();
		location2();
		
		
		
	
	}
public void location2() throws FileNotFoundException {
		// TODO Auto-generated method stub
	this.misses=0;
	this.storylocation=2;
	Scanner keyboard=new Scanner(System.in);
	System.out.println("The Whetherman suddenly vanishes");
	press();
	System.out.println("As you continue past the tollbooth you notice that the enviroment arround you has turned to forest.");
	press();
	System.out.println("Suddenly you hear the Beedex make an announcment");
	press();
	System.out.println("Bedex: Error 666 BPS signal lost... Unable to navigate!");
	press();
	System.out.println("You notice that two paths diverge in the forest.");
	press();
	System.out.println("One of the paths seems to be bright and sunny and you can hear songbirds in that direction.");
	press();
	System.out.println("On the other hand the other path seems dark and you hear what sounds like snakes in the distance");
	press();
	System.out.println("WHich path do you take?");
	press();
	System.out.println("Enter either \"light\" or \"dark\" to choose a path then press ENTER to continue.");
	if(keyboard.nextLine().toLowerCase().equals("light")) {
	location3();
}else {
	location4();
}}

public void location4() throws FileNotFoundException {
	// TODO Auto-generated method stub
	this.misses=0;
	this.storylocation=4;
	System.out.println("You head down the dark path.");
	press();
	System.out.println("You notice that the path begins to brighten up and look less scary than it did.");
	press();
	System.out.println("You suddenly trip over what looks to be a bowl of pasta");
	press();
	System.out.println("You notice that you spilled the pasta from tripping" );
	press();
	System.out.println("???: WHAT IN REINCARNATION?");
	press();
	System.out.println("???: WHO JUST DARED TOUCHA MY SPAGET.");
	press();
	System.out.println("You can feel the presense of something behind you....something overbearingly large.");
	press();
	System.out.println("You spin around to see what looks like a ghost of a 100 foot tall gorilla");
	press();
	System.out.println("Beedex: Connection restored.... You are approaching the dining place of the gorilla Harambee...Be careful!");
	press();
	System.out.println("Harambee: So it is you who has toucha my spaget...YOUR GONNA PAY FOR THAT!");
	press();
	this.boss="Harambee";
	this.word="sanic";
	this.storyhint="This popular meme consists of a poorly drawn version of a blue hedgehog";
	dualprep();
	setupdual();
	if(this.didwin==true);
	System.out.println("Harambee: I AM HARAMBEE AND YOU WILL NOT GET AWAY WITH THIS!");
	press();
	this.word="spodermen";
	this.storyhint="This meme consists of a poorly drawn version of a spider superhero who cannot spell.";
	setupdual();
	if(this.didwin==true);
	System.out.println("Harambee: YOU DO NOT KNOW DA WAE!");
	press();
	this.word="the fitnessgram pacer test";
	this.storyhint="Is a multistage aerobic capacity test that progressivly gets more difficult as you continue.....";
	setupdual();
	if(this.didwin==true);
	System.out.println("Harambee: YOUUUUU SHALL NOT PASSSSSS.");
	press();
	this.word="no this is patrick";
	this.storyhint="Is this the Krusty Krab?";
	setupdual();
	if(this.didwin==true);
	System.out.println("Harambee: YOU TOCHA MY SPEGET AND YOUR NOT GONNA SPAGET AWAY WITH IT");
	press();
	this.word="captain falcon";
	this.storyhint="This character is known for saying his name before throwing a PUNCHHHHHH";
	setupdual();
	if(this.didwin==true);
	System.out.println("Harambee: YOU STUPID SPAGET TOUCHER");
	press();
	this.word="twenty-one";
	this.storyhint="What's nine plus ten?";
	setupdual();
	if(this.didwin==true);
	System.out.println("Harabee: MY POWER IS OVER 9000!");
	press();
	this.word="the illuminati";
	this.storyhint="What has three sides and is real.";
	setupdual();
	if(this.didwin==true);
	System.out.println("Harambee: NOOOOOOOOOOOOOOOOO!!!!");
	press();
	System.out.println("You see as the gorilla ghost fades into thin air.");
	press();
	location5();
	
	
	
}

public void location3() throws FileNotFoundException {
	// TODO Auto-generated method stub
	this.misses=0;
	this.storylocation=3;
	System.out.println("As you begin walking down the light path you notice that it has become dark and scary.");
	press();
	System.out.println("You feel a chill run down your spine and feel as if your being watched");
	press();
	System.out.println("???: BEERAINSSSSSS");
	press();
	System.out.println("You jump backwards only to find that you jumped back into slimy hands that grab your shirt");
	press();
	System.out.println("You manuver your way out of the slimy hands and begin to run");
	press();
	System.out.println("Beedex: Zombees, the once human victims of the spelling bees mass hangings and cruel experiments");
	press();
	System.out.println("You continue to run but hear the sounds of the zombees getting closer.");
	press();
	System.out.println("Suddenly, a group of zombees appear in front of you.");
	press();
	System.out.println("You realize that you are surrounded and must fight them.");
	press();
	System.out.println("Zombee: BEERAINSSSSSSSS");
	press();
	this.boss="Zombees";
	this.word="plants vs zombies";
	this.storyhint="This popular mobile game has the player trying to defend their garden from an army of the undead.";
	dualprep();
	setupdual();
	if(this.didwin==true);
	System.out.println("There are 4 zombees remaining");
	press();
	this.word="halloweentown";
	this.storyhint="A Disney Channel Origional Movie about a teenaged witch and her adventures in a monster filled world";
	setupdual();
	if(this.didwin==true);
	System.out.println("There are 3 zombees remaining");
	press();
	
	this.word="treehouse of horror";
	this.storyhint="The name of the halloween themed episode of the long running series The Simpsons";
	System.out.println("There are 4 zombies remaining");
	setupdual();
	if(this.didwin==true);
	System.out.println("There are 2 zombees remaining");
	press();
	this.word="jack-o-lanturn";
	this.storyhint="Another name for a pumpkin with a face carved in it";
	setupdual();
	if(this.didwin==true);
	System.out.println("There is 1 zombee remaining");
	press();
	this.word="frankensteins monster";
	this.storyhint="This undead character was broght back to life by a scientist in a well known classic novel";
	setupdual();
	if(this.didwin==true);
	System.out.println("All of the zombees that surrounded you are now seemingly dead.");
	press();
	location5();
}

public void location5() throws FileNotFoundException {
	// TODO Auto-generated method stub
this.storylocation=5;
	this.misses=0;
System.out.println("You continue your journey through the forest.");
	press();
	System.out.println("Beedex: You are now approaching the ventilation duct in the Spelling Bee's goverment facility.");
	press();
	System.out.println("Beedex: This facility contains systems that help our word and savior Beeyonce keep his control over the planet.");
	press();
	System.out.println("You open the small door and crawl through.");
	press();
	System.out.println("As you crawl through the air duct you see some of the mutant spelling bees grading peoples essays and determining wether or not to have them arrested for spelling errors.");
	press();
	System.out.println("Suddenly, you fall through the vent.");
	press();
	System.out.println("You quickly get up to a person dressed in armor standing in front of you.");
	press();
	System.out.println("???: Ahh looks like we got an intruder.");
	press();
	System.out.println("???: This gonna be a blast.... not for you but for me!");
	press();
	System.out.println("Darth Grader: Haha my name is Darth Grader and I have realized my true potential on the dark side of the grading force.");
	press();
	System.out.println("Darth Grader: Prepare to meet your doom");
	press();
	this.boss="Darth Grader";
	this.word="anakin skywalker";
	this.storyhint="Darth Vader's real name.";
	dualprep();
	setupdual();
	if(this.didwin==true);
	System.out.println("Darth Grader: Ahh "+this.name+" you are strong indeed.");
	press();
	this.word="the phantom menance";
	this.storyhint="Star Wars Episode 1.....";
	setupdual();
	if(this.didwin==true);
	System.out.println("Darth Grader: Join me and we can rule Spellview together.");
	press();
	this.word="the millennium falcon";
	this.storyhint="The name of the ship commanded by Han Solo";
	setupdual();
	if(this.didwin==true);
	System.out.println("Don't underestimate the power of the dark side "+this.name+"!");
	press();
	this.word="ben solo";
	this.storyhint="What is Kylo Ren's real name?";
	setupdual();
	if(this.didwin==true);
	System.out.println("Darth Grader: You are too strong... I have lost.");
	press();
	System.out.println("You see Darth Grader fall to the ground in exhaustion.");
	press();
	location6();
}

public void location6() throws FileNotFoundException {
	// TODO Auto-generated method stub
	this.misses=0;
	this.storylocation=6;
	System.out.println("You walk through the door behind Darth Grader in what looks to be a throne room.");
	press();
	System.out.println("You can see someone sitting in the throne facing the window overlooking the facility.");
	press();
	System.out.println("???: So you are gonna try to end my rule over Spellview eh?");
	press();
	System.out.println("Lord Beeyonce: Well I Lord Beeyonce the supreme ruler of Spellview is not gonna let that happen!");
	press();
	System.out.println("Lord Beeyonce: I've watched you "+this.name+" battle my minions on your quest and I would like to say I am quite impressed.");
	press();
	System.out.println("Lord Beeyonce: But all heros will eventually meet their doom.");
	press();
	System.out.println("Lord Beeyonce: Choosing the way to defeat you is the hardest part however....");
	press();
	System.out.println("Lord Beeyonce: I know!  I'll use my spelling monsters to DESTORY YOU HERE AND NOW!");
	press();
	System.out.println("Lord Beeyonce: "+this.name+"!  Your quest ends now!");
	press();
	this.boss="Lord Beeyonce";
	this.word="bulbasaur";
	this.storyhint="This grass Pokemon is one of the 3 Pokemon a new trainer can pick in the Kanto region";
	dualprep();
	setupdual();
	if(this.didwin==true);
	System.out.println("Lord Beeyonce: I'm just warming up!");
	press();
	this.word="puck-man";
	this.storyhint="Namco's classic yellow hero's ORIGINAL name";
	setupdual();
	if(this.didwin==true);
	System.out.println("Lord Beeyonce: Mahahahahahaha");
	press();
	this.word="donkey kong";
	this.storyhint="Nintendo's red suited mustached plumber's first game appearence.";
	setupdual();
	if(this.didwin==true);
	System.out.println("Lord Beeyonce: You will never defeat me.");
	press();
	this.word="ash ketchum";
	this.storyhint="The main character from the TV series about \"Being the very best like no one ever was\"";
	setupdual();
	if(this.didwin==true);
	System.out.println("Lord Beeyonce: You Won......NOTHING!");
	press();
	this.word="sonic the hedgehog";
	this.storyhint="Sega's fastest thing alive";
	setupdual();
	if(this.didwin==true);
	System.out.println("Lord Beeyonce: BRING IT!");
	press();
	this.word="windows vista";
	this.storyhint="Microsoft's project longhorn released in 2007";
	setupdual();
	if(this.didwin==true);
	System.out.println("Lord Beeyonce: IS THAT ALL YOU GOT");
	press();
	this.word="el captain";
	this.storyhint="Apple's version of macOS (then OSX) released in 2015.";
	setupdual();
	if(this.didwin=true);
	System.out.println("Lord Beeyonce: Ugh.... You may have defeated me....");
	press();
	System.out.println("Lord Beeyonce: But there is still one more person you must overcome to defeat us spelling bees.");
	press();
	System.out.println("Lord Beeyonce: Walk into the wall on your left, its a synthowall and you will find the true king of Spellview");
	press();
	locationfinal();
}

public void locationfinal() throws FileNotFoundException {
	// TODO Auto-generated method stub
	this.misses=0;
	this.storylocation=7;
	System.out.println("You walk throught the synthowall and find yourself in a dark room.");
	press();
	System.out.println("???: Congratualtions on making it this far "+this.name+"!");
	press();
	System.out.println("You notice that something about the voice that sounds oddly familiar.");
	press();
	System.out.println("???: You have overcame all of the obstacles that the spelling bees have put in your way.");
	press();
	System.out.println("???: ..Or should I say ALMOST all of them.");
	press();
	System.out.println("Prof. Spoder: Yes what Lord Beeyonce said is correct... I am the true king of Spellview.");
	press(); 
	System.out.println("Prof. Spoder: Beeyonce is only my puppet for my control.");
	press();
	System.out.println("Prof. Spoder: You see "+this.name+", I sent you on this quest knowing that in the entire multiverse you were the only one smart enough to possibly overthrow me.");
	press();
	System.out.println("Prof. Spoder: So of course I had to eliminate you and what better way to do so by testing my security systems on you as well");
	press();
	System.out.println("Prof. Spoder: Unfortunatly for me, I underestimated your power and you beat all of my forces.");
	press();
	System.out.println("Prof. Spoder: When I saw you were getting this far I captured all of the spellbels and locked them in the dugeon downstairs.");
	press();
	System.out.println("Prof. Spoder: If you don't want them to be hung your gonna have to beat me... SPODERMEN THE MASTER OF SPELLING!!!");
	this.boss="Prof. Spoder";
	this.word="kim possible";
	this.storyhint="This Disney show ran from 2002 to 2007 featuring a teenaged girl hero and her bestfriend/sidekick.";
	dualprep();
	setupdual();
	if(this.didwin==true);
	System.out.println("Prof. Spoder: I see interesting move.");
	press();
	this.word="captain america the first avenger";
	this.storyhint="The live action marvel movie featuring the orgin story of a genetically enhanced super soldier";
	setupdual();
	if(this.didwin==true);
	System.out.println("Prof. Spoder: I will never lose to you.");
	press();
	this.word="bedknobs and broomsticks";
	this.storyhint="A 1971 disney film abut a witch and 3 orphans";
	setupdual();
	if(this.didwin==true);
	System.out.println("Prof. Spoder: ..........");
	press();
	System.out.println("Prof. Spoder: Sigh. I guess my rule wasn't meant to be.");
	press();
	System.out.println("Prof. Spoder: Heres the key to go unlock the true king of spellview along with the other rebels.");
	press();
	System.out.println("You go and free everyone who was locked but by Professor Spoder.");
	press();
	System.out.println("Lord Frank: Thank you so much for saving Spellview "+this.name+"!");
	press();
	System.out.println("Lord Frank: You have truly proven yourself as a hero to be remembered for centuries to come!");
	press();
	System.out.println("Lord Frank: Because of that I will add your name and your score to the book of legends (leaderboard)");
	press(); 
	System.out.println("Lord Frank: Hmmm.. sorry "+this.name+", I can't seem to find the Book of Legends right now I'll put you in when I find it");//I need help with the leaderboard
	press();
	System.out.println("Lord Frank: Here is the Z-Warper that Professor Spoder used to bring you to our dimension.");
	press();
	System.out.println("Lord Frank: Use it to travel back home, and feel free to visit anytime!");
	press();
	System.out.println("You wave goodbye to everyone and type the code of your dimension into the Z-warper and begin your journey back home");
	press();
	System.out.println("THE END "+this.name+" Your final score was "+this.score);
	System.out.println("\n\nHangman Story Mode was Written and Programmed by Jake Derouin All Rights Reserved");
}

public void setupdual() throws FileNotFoundException {//Places spaces and dashes if the word includes them
this.didwin=false;
	this.alreadyguessed = new ArrayList<String>();

	this.wordlength=word.length();
	this.hasguessedcorrectly=new boolean[this.word.length()];
	for(int i=0; i<word.length(); i++) {
		if(word.charAt(i)==' '||word.charAt(i)=='-') {
		this.hasguessedcorrectly[i]=true;
		}
	}
	startgame();
}
	public void dualprep() {//GIves the battle prep menu
		// TODO Auto-generated method stub
	System.out.println("\n\n\n\n\nPre Battle Menu:\n");
		this.previousscore=this.score;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("You are about to fight "+this.boss+" Type shop then press ENTER to buy items or press ENTER to fight");
		System.out.println("Points: "+this.score);
		if(keyboard.nextLine().equals("shop")) {
		shop();
			
			

		}
		
	}

	public void shop() {//In game shop
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Welcome to the shop!  What would you like to buy?\nItems:");
		System.out.println("1-Retry 300000 points");
		System.out.println("2-Letter Reveal 30000 points");
		System.out.println("\n\nInventory:\n"+this.retrys+" Retrys\n"+this.cheatletters+" Cheatletters");
		System.out.println("Points: "+this.score);
		System.out.println("\nTo buy an item type the ID of the item (the number on the left)\nThen press Enter to Purchase");
		System.out.println("\nTo quit press ENTER.");
	String input=keyboard.nextLine();
		if(input.equals("")){
			dualprep();
		}else if(input.charAt(0)=='1') {
			if(this.score>=300000) {
				this.score=this.score-300000;
				this.retrys++;
				System.out.println("You bought a retry.");
				this.previousscore=this.score;
				System.out.println("Press ENTER to continue");
				if(keyboard.nextLine().equals(""));
					shop();
			}else {
				System.out.println("You do not not have enough points");
				System.out.println("Press ENTER to continue");
				if(keyboard.nextLine().equals(""));
					shop();
			}
		}else if(input.charAt(0)=='2') {
			if(this.score>=30000) {
				this.score=this.score-30000;
				this.cheatletters++;
				System.out.println("You bought a cheat letter.");
				this.previousscore=this.score;
				System.out.println("Press ENTER to continue");
				if(keyboard.nextLine().equals(""));
					shop();
			}else {
				System.out.println("You do not not have enough points");
				System.out.println("Press ENTER to continue");
				if(keyboard.nextLine().equals(""));
					shop();
			}
		}
	}

	public void press() {//Happens before each text section
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Press ENTER to continue");
		if(keyboard.nextLine().equals(""));
	}

	public void startgame() throws FileNotFoundException {//Starts the game
		
	setupgamescreen();//Sets up the game screen after each guess
	Scanner keyboard=new Scanner(System.in);
	if(this.misses==5) {
		
		if(this.storymode==true) {
			if(this.retrys>0) {
				System.out.println("You have "+this.retrys+" Retry(s) remaining.\nPress ENTER to restart the battle");
				if(keyboard.nextLine().equals(""));
				this.retrys--;
				this.score=this.previousscore;
				if(this.storylocation==1) {
					location1();
				}else	if(this.storylocation==2) {
					location2();
				}else if	(this.storylocation==3) {
					location3();
				}	else if	(this.storylocation==4) {
					location4();
				}	else if	(this.storylocation==5) {
					location5();
				}else if	(this.storylocation==6) {
					location6();
				}else if	(this.storylocation==7) {
					locationfinal();
				}
						
						
						
			}else {
			System.out.println("You died!  Your final score was "+this.score);
			this.didwin=false;
			System.exit(-1);
			}
		}else {
		calculatescore();
		}
	}else {
	boolean willend=true;
	for(boolean item:this.hasguessedcorrectly) {
		if(item==false) {
			willend=false;
			
		}
		
	}
	if(willend==true) {
		if(this.storymode==true) {
			this.didwin=true;
		}else {
		calculatescore();
		}
	}else {
	System.out.println("\nEnter a letter to guess then press ENTER");
	if(this.storymode==true) {
		System.out.println("Or type inventory and press ENTER to access your items.");
	}


	this.guess=keyboard.nextLine().toLowerCase();
	if(this.storymode==true&&this.guess.equals("inventory")) {
		inventory();
	}else {
	boolean issame=false;
	for(int i=0; i<this.word.length(); i++) {
		if(this.word.charAt(i)==guess.charAt(0)&&this.hasguessedcorrectly[i]==true) {
			System.out.println("You have already found this letter.");
			issame=true;
			startgame();
		}
		}
	
	if(issame==false) {
guess();
	}
	
	}
		}}}
	public void inventory() throws FileNotFoundException {//Inventory menu for in battle
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Inventory: ");
		System.out.println("Will be used upon death- "+this.retrys+"x"+" Retrys");
		System.out.println("1- "+this.cheatletters+"x"+" Cheat Letters");
		System.out.println("Type the ID of the item you want then press ENTER to use it\nYou can also press ENTER to exit the inventory.");
		if(keyboard.nextLine().equals("1")) {
			if(this.cheatletters<1) {
				System.out.println("You do not have any cheat letters remaining");
				System.out.println("Press ENTER to continue");
				if(keyboard.nextLine().equals("")) {
					inventory();
				}
			}else {
			usecheatletter();
			}
		}else {
		setupgamescreen();
	}}
	public void usecheatletter() throws FileNotFoundException {//Use the cheat letter item
		int randomnum=(int) (Math.random() * this.word.length()-1) + 0;
	this.cheatletters--;
		if(word.charAt(randomnum)==' '||word.charAt(randomnum)=='-') {
			usecheatletter();
		}else {
			
			this.guess=this.word.charAt(randomnum)+"";
		
			guess();
		}
	}

	public void calculatescore() throws FileNotFoundException {//Calculates the score
	if(this.misses<5) {
		this.score=this.score*this.difficulty;
		System.out.println(this.name+"..."+"Your score is: "+this.score);
		System.out.println("Continue?\n\nPress ENTER to continue.");
		press();
		System.out.println("Loading... Please Wait");
		wordassign();
		System.out.println("\n\n\n\n\n\n\n");
		startgame();
	}else {
		this.score=this.score*this.difficulty;
		System.out.println(this.name+"..."+"Your final score is: "+this.score);
		
	}
		
		
		
	}

	public void setupgamescreen() {//Reprints the game screen each time something is guessed
if(this.storymode==true) {
	System.out.println("Score: "+this.score+"                                                          "+this.name+" Vs. "+this.boss+"\n\n\n");
}else {
		System.out.println("Score: "+this.score+"                                                          "+"Difficulty:"+this.difficulty+"\n\n\n");
	}
int index=0;
for(boolean item: hasguessedcorrectly) {
	if (item==false) {
		System.out.print("-");
	}else {
		System.out.print(this.word.charAt(index));
	}
	index++;
}
System.out.println("\nGuesses: ");
for(int i=0; i<alreadyguessed.size(); i++) {
	System.out.print(alreadyguessed.get(i)+" ");
}
if(storymode==true) {
System.out.println("\nHint: "+this.storyhint);
}
System.out.println();
if(this.misses>=1) {
	System.out.println("HEAD");
	
}
if(this.misses>=2) {
	System.out.println("NECK");
}
if(this.misses>=3) {
	System.out.println("TORSO");
}
if(this.misses>=4) {
	System.out.println("LEGS");
}	
if(this.misses>=5) {
	System.out.println("FEET");
}

}
	public void wordassign() throws FileNotFoundException {//Assigns a word (in classic mode only)
		
		if(this.difficulty==1) {
			this.word=this.d.getRandomWord();
			String[] vowels= {"a","e","i","o","u"};
		int counter=0;
			for(String item: vowels) {
			for(int i=0; i<this.word.length();i++) {
				if(item.charAt(0)==this.word.charAt(i)) {
					counter++;
				}
			}
		}
			if(counter<3) {
				wordassign();
			}
		}
		
		if(this.difficulty==2) {
			this.word=this.d.getRandomWord();
			String[] vowels= {"a","e","i","o","u"};
		int counter=0;
			for(String item: vowels) {
			for(int i=0; i<this.word.length();i++) {
				if(item.charAt(0)==this.word.charAt(i)) {
					counter++;
				}
			}
		}
			if(counter>3) {
				wordassign();
			}
		}if(this.difficulty==3) {
			this.word=this.d.getRandomWord();
			String[] vowels= {"a","e","i","o","u"};
		int counter=0;
			for(String item: vowels) {
			for(int i=0; i<this.word.length();i++) {
				if(item.charAt(0)==this.word.charAt(i)) {
					counter++;
				}
			}
		}
			if(counter>2) {
				wordassign();
			}
		}
		
		this.word=this.d.getRandomWord();
		this.wordlength=this.word.length();
		
		this.hasguessedcorrectly=new boolean[this.word.length()];
	}
public void guess() throws FileNotFoundException {//After the user makes a guess
	int timesoccured=0;
	this.willloselife=true;
	
	for(int i=0; i<this.word.length(); i++) {
		if(this.word.charAt(i)==guess.charAt(0)) {
			willloselife=false;
			this.hasguessedcorrectly[i]=true;
			timesoccured++;
		}
		}
		if(this.willloselife==false) {
			String[] vowels= {"a","e","i","o","u"};
			boolean hasbeenscored=false;
			for(String item: vowels) {
				if(guess.equals(item)) {
					this.score=timesoccured*(this.score+25);
					this.tempscore=timesoccured*(this.score+25);
					hasbeenscored=true;
				}
			}
			if(hasbeenscored==false&&this.willloselife==false) {
				this.score=timesoccured*(this.score+100);
				this.tempscore=timesoccured*(this.score+100);
			}
		}
		if(this.willloselife==true) {
			this.misses++;
		}
	alreadyguessed.add(this.guess);
	startgame();
	}
		

public String getWord() {//For getting a word
	return this.word;
}


}