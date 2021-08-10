//Name: Divya Kaur
//Date: October 19, 2017
//Purpose:
import java.applet.*;
import java.awt.*;
import javax.swing.*;
public class RPG
{
    public static void main (String args[])
    {
	new RPG ();
    }


    public RPG ()
    {


	{

	    introduction ();

	}

    }


    public void introduction ()
    {
	//Title
	System.out.println ("-__ /\\                        |\\         ,,       ");
	System.out.println ("  || \\,   ' ;                  \\\\    _   ||       ");
	System.out.println (" /|| /   \\\\ \\\\/\\  _-_  ,._-_  / \\\\  < \\, ||  _-_  ");
	System.out.println (" \\||/-   || || | || \\\\  ||   || ||  /-|| || || \\\\ ");
	System.out.println ("  ||  \\  || || | ||/    ||   || || (( || || ||/   ");
	System.out.println ("_---_-|, \\\\ \\\\/  \\\\,/   \\\\,   \\\\/   \\/\\\\ \\\\ \\\\,/  ");
	System.out.println ("                                              ");
	System.out.println ("                                              ");
	System.out.println ("    __                            ");
	System.out.println ("  ,-||-,                       ,  ");
	System.out.println (" ('|||  )                     ||  ");
	System.out.println ("(( |||--)) \\\\ \\\\  _-_   _-_, =||= ");
	System.out.println ("(( |||--)) || || || \\\\ ||_.   ||  ");
	System.out.println (" ( / |  )  || || ||/    ~ ||  ||  ");
	System.out.println ("  -____-\\\\ \\\\/\\\\ \\\\,/  ,-_-   \\\\, ");
	System.out.println (" ");
	System.out.println ("    _,..._  ,d$$ccc_ ");
	System.out.println ("      d$$$$$$hc$$$$$$$$h. ");
	System.out.println ("    ,d$$$$$$$$$$$$$$$O$$$. ");
	System.out.println ("   ,$$$$h$$$$$FF$$$$$$$$$| ");
	System.out.println ("  ,d$$$$$h$$F;' `F$$;':?$' ");
	System.out.println ("  d$$F?$$$F'      ',c. +' ");
	System.out.println (" d$$h     c$$h    $$$$'| ");
	System.out.println ("d$$$h    $$F'     `' ' | ");
	System.out.println ("$$$$$L   `',-.    ,`.  | ");
	System.out.println ("$$$$$$h   .'  `      | | ");
	System.out.println ("d$$$$$$   |        O ' `. ");
	System.out.println (" $$$$$F   | O  , __. , | | ");
	System.out.println ("  Y$FF'      ,' '  )\"  |_| ");
	System.out.println ("  ;\"'      \"'   __/    |' ");
	System.out.println (" |,`.        /      ,  | ");
	System.out.println (" |  |      .'`--..-'   | ");
	System.out.println (" `. `       (.___,/    | ");
	System.out.println ("   `._,.     \\   .'   | ");
	System.out.println ("    \\     \\_,'    | ");
	System.out.println ("   -hrr- \\           / ");
	System.out.println ("      `.        / ");
	System.out.println ("        `-....-' ");
	System.out.println ("        ");
	System.out.println ("        ");
	System.out.println ("        ");
	System.out.println ("         )\\       _");
	System.out.println ("     .--._  ,' `\\_.-~~/'");
	System.out.println ("     `\\    \\'_    __ ( _ _ ");
	System.out.println ("       `\\   (_)  |__|/~ ~~=~\\");
	System.out.println ("     )_____.---~~ \\>\\~-./'");
	System.out.println ("    /'    //===  /==( ");
	System.out.println ("       (     /' __\\ ( __\\) ");
	System.out.println ("       ( /~\\(   o   |_o_( ");
	System.out.println ("       (( (         _____)");
	System.out.println ("    \\\\_/     ,      )");
	System.out.println ("     \\ `\\   ~-.._  /");
	System.out.println ("    ._)/ \\        /");
	System.out.println ("     `/   \\     ./");
	System.out.println ("     /     `~/~' ");
	System.out.println ("    /       /");
	System.out.println ("       '~~-.__./                     ");
	System.out.println ("");
	// Calls the charcter customizing method
	character ();
	// Introduction: Explains back story of the game
	System.out.println (" ---- Welcome to the Andrew Residence ---- ");
	System.out.println (" Hey Archie. Your Dad was just shot, and you can't remember anything that happened.");
	System.out.println (" Now that he's home safe and alive, it's time to find out who did it.");
	System.out.println (" All you remember laying in bed, is that the shooter was a man.");
	IO.printSlow (" KNOCK, KNOCK, KNOCK");
	System.out.println (" You jump, you're scared that the shooter is outside. You slowly walk down the stairs and walk towards the door...");
	System.out.println (" You look out the door and it's the...");
	IO.printSlow (" THE SHERIFF");
	System.out.println (" Sheriff: Hey Archie. Sorry to disturb you, I need you to come down to the station.");
	System.out.println (" Archie: Why?");
	System.out.println (" Sheriff: We've brought some drawings of suspects into the station and we need you to identify them. Is that okay with you?");
	System.out.println (" ");
	char start = IO.inputChar (" It's up to you Archie. Do you want to know who did it, or live in fear for the rest of your life. Are you ready? (y/n)");
	if (start == 'y')
	{
	    System.out.println (" You will have to complete the following tasks\n If you complete the tasks succesfully, you will get a letter from the name of the shooter\n make sure you remember the letters, they'll be helpful in the end.");
	    criminaltask ();
	}
	else
	    IO.printSlow (" Okay, but be careful...");
    }


    //Task #1
    public void criminaltask ()
    {
	System.out.println ("");
	// Task 1 title
	System.out.println ("  _ __, __, _, _ ___ _ __, , _   ___ _,_ __,    _, __, _ _, _ _ _, _  _, _, ");
	System.out.println (" | | \\ |_  |\\ |  |  | |_  \\ |    |  |_| |_    / ` |_) | |\\/| | |\\ | /_\\ |  ");
	System.out.println (" | |_/ |   | \\|  |  | |    \\|    |  | | |     \\ , | \\ | |  | | | \\| | | | ,");
	System.out.println (" ~ ~   ~~~ ~  ~  ~  ~ ~     )    ~  ~ ~ ~~~    ~  ~ ~ ~ ~  ~ ~ ~  ~ ~ ~ ~~~");
	System.out.println (" You will be presented with three criminals");
	System.out.println (" You must decide who the criminal is");
	System.out.println (" ");
	System.out.println (" Criminal #1");
	System.out.println (" ");
	System.out.println ("       /   \\");
	System.out.println ("      /1997 \\");
	System.out.println ("     @@@@@@@@@");
	System.out.println ("    /  6 6    \\");
	System.out.println ("   (    ^     ,)");
	System.out.println ("    \\   __,   /-._");
	System.out.println ("     `._____.'\\   `--.__");
	System.out.println ("        \\\\/         `/``\"\"\"'-.");
	System.out.println ("         /    )     /         :");
	System.out.println ("         |   /\\    |  .--.     :");
	System.out.println ("         /  /\\1`\\   \\/    `.__.:.____.-.");
	System.out.println ("        /  / /`\\9`\\`/    .-\"..____.-.   \\");
	System.out.println ("    _.-'  /_/   `\\9`\\                \\-. \\");
	System.out.println ("       `=----'        `\\7`\\--------'\"\"`-. \\ `\"");
	System.out.println ("                    `-./             `\"");
	System.out.println ("");
	System.out.println (" Criminal #2");
	System.out.println (" ");
	System.out.println ("                              ,--.");
	System.out.println ("     /  . `----...__ ");
	System.out.println ("       ,'  (            `.");
	System.out.println ("       ;    `-            \\");
	System.out.println ("       |   ___..----.._____:-\"\"-,");
	System.out.println ("      ,+-\"\"             .-\"     |");
	System.out.println ("      ;           _..--\"  _.+\"  |");
	System.out.println ("      |     _..--\".-\" _.-\"  |_.-'");
	System.out.println ("      L..--\"   .-\"_.-\"      |");
	System.out.println ("     /      .-\"\"\"\"-.  ,--,  :");
	System.out.println ("    /    .-\"-.      l ;  | .'");
	System.out.println ("   /  .-\" `--'  /    \"   |'|");
	System.out.println ("  /.-\":        :       _.' :");
	System.out.println ("      ; ,--,    \\      ;    \\__");
	System.out.println ("      :  .-'`.   `.    |     \\ \"-.");
	System.out.println ("      '-';    \\        :      )   \\");
	System.out.println ("     )_.-, ,  /   .'     /     \\");
	System.out.println ("     `,         .'      /       \\");
	System.out.println ("      :-._.'  .'   :   /         \\");
	System.out.println ("      ;    .-'\\    |  /           `.");
	System.out.println ("      '---\"    )   ; /              `.");
	System.out.println ("               \\  / /            .-\"  `.");
	System.out.println ("               /`. /           .'       \\");
	System.out.println ("              /  :/           /          \\");
	System.out.println ("              ");
	System.out.println ("              ");
	System.out.println (" Criminal #3");
	System.out.println (" ");
	System.out.println ("                             ");
	System.out.println ("      .gd$$$$$SSSS$$$$$$$bg._");
	System.out.println ("    .dSSSS$$$$$$$SSS$$$$$$SSS$bg.");
	System.out.println ("       d$$$$$$SSSS$$$$$SSSS$$$$$SS$$$bg.");
	System.out.println ("      :SSS$$$$$$$$SSS$$$$$SSSS$$$SS$$SS$b.");
	System.out.println ("      $$$$SS$$$$$$$$$SSS$$$$$SSS$$S$$$S$$$b");
	System.out.println ("     :$$$$$$SS$$$$$$$$$$SSSS$$$SS$S$$SS$$$S;");
	System.out.println ("     $$$$$$$$$SSP^**\"\"**^T$SS$$$SS$$SS$$$S$$");
	System.out.println ("     SSSSS$$$$$;            `\"*^S^*\"   \"*^TP");
	System.out.println ("    :$$$$$SS$$;                            ;");
	System.out.println ("    :$$$$$$$SS                             |");
	System.out.println ("    SSS$$$$$$;                             :");
	System.out.println ("    $$$SS$$$$                              ;");
	System.out.println ("    SS$$$SS^'");
	System.out.println ("    :$S$$$;      _                        :");
	System.out.println ("   :'\"*T$$     ,d$$s+._               _.g$P");
	System.out.println ("   |,'; T;    *'    `*Tbs+,  ,     .sP*\"  ;");
	System.out.println ("   :  :          +g+=+._ `*^'    :'  _.++g");
	System.out.println ("    ;  \\         `T. $$$\\        ; .' $$$|");
	System.out.println ("    : `.           ` `\"'         |    `\"'|");
	System.out.println ("     \\  ;                        :       ;");
	System.out.println ("     dbg$");
	System.out.println ("    :$$$$ \\                             :");
	System.out.println ("    :S$$$  \\                            ;");
	System.out.println ("     TS$$   `.                 ,  ;");
	System.out.println ("    .dSS$                   ;     :    :");
	System.out.println ("   d$$$SS`                  '--._.'    ;");
	System.out.println ("  :$$$$$; \\");
	System.out.println ("  :S$$$$;  \\            .__.--._.-._  '");
	System.out.println ("   TS$$$    `.          \\-._.-._.-.: .");
	System.out.println ("  .dSS$$   :  `.         `._      .'");
	System.out.println (" d$$$SS;    \\   `.          `\"\"\"\"'  '");
	System.out.println (":$$$$$S;     \\    `-.          \"   /");
	System.out.println (":$$$$$$       `.     `-._         /");
	System.out.println (" ");
	System.out.println (" Ok Archie its your turn to decide who did it?");
	System.out.println (" ");
	int criminal = IO.inputInt (" ok Archie, who do you think shot your dad? (1/2/3)");
	// Determines if the player guesses the right criminal
	while (criminal != 2)
	{
	    System.out.println (" That's not quite right, try again.");
	    criminal = IO.inputInt (" ok Archie, which picture looks the most like the criminal? (1/2/3)");
	}
	// storyline continues
	System.out.println (" ");
	IO.printSlow (" Here are the first letters: N O");
	System.out.println (" ");
	System.out.println (" You've identified the man, but no one has seen this person before.");
	System.out.println (" You have to find out the name of this man so the police can track him down.");
	System.out.println (" While on the way out of the station, you see that someone left you a note.");
	System.out.println (" It reads: Hey Archie, I know you want to find out who I am.\n But it won't be as easy as you think\n Good luck! you'll never find me.");
	System.out.println (" When you turn the page around, you notice that it is a sheet of math homework.");
	System.out.println (" You decide to pay the math classroom at Riverdale high a visit.");





	char challenge = IO.inputChar (" Are you ready for the challenge? (y/n) ");
	if (challenge == 'y')
	{

	    mathfrenz ();
	}
	else
	{
	    System.out.println (" Okay, I guess you'll never find out.");

	}
    }


    //Task 2
    public void mathfrenz ()
    {
	System.out.println (" ");
	System.out.println (" When you walk into the classroom wou see math questions on the board along with a little note.");
	System.out.println (" The note says:");
	System.out.println (" If you can get enough of these questions right, you will get the next letters.");
	// Task 2 title
	System.out.println (" ___ ___   ____  ______  __ __      _____  ____     ___  ____   _____  __ __ ");
	System.out.println (" |   |   | /    ||      ||  |  |    |     ||    \\   /  _]|    \\ |   | |  |  |");
	System.out.println (" | _   _ ||  o  ||      ||  |  |    |   __||  D  ) /  [_ |  _  ||__/  | |  | |");
	System.out.println (" | \\_/  ||     ||_|  |_||  _  |    |  |_  |    / |    _]|  |  ||   __| |  ~  |");
	System.out.println (" |   |   ||  _  |  |  |  |  |  |    |   _] |    \\ |   [_ |  |  ||  /  ||___, |");
	System.out.println (" |   |   ||  |  |  |  |  |  |  |    |  |   |  .  \\|     ||  |  ||     ||     |");
	System.out.println (" |___|___||__|__|  |__|  |__|__|    |__|   |__|\\_||_____||__|__||_____||____/ ");
	System.out.println ("                                                                         ");
	System.out.println ("          o   O ");
	System.out.println ("           OoO  ");
	System.out.println ("           o o  ");
	System.out.println ("          O   O ");
	System.out.println (" ");
	System.out.println (" ");
	System.out.println ("Let's Start");
	System.out.println (" ");
	int total = 0;
	//Loop for the math questions
	for (int i = 1 ; i <= 10 ; i++)
	{
	    int num = (int) (Math.random () * 10) + 1;
	    int mathans = i * num;
	    int ans = IO.inputInt (" What is " + i + " * " + num + "? ");
	    // Sums up the total
	    if (ans == mathans)
	    {
		total++;
	    }
	    else
	    {
		total--;
	    }
	}
	// If the player gets to pass or not
	if (total >= 7)
	{
	    System.out.println ("Good job.You have enough points.Your total is " + total + ".");
	    IO.printSlow (" Here are the letters: J S ");
	    decode ();
	}
	else
	{
	    System.out.println ("You don't have enough points.Your total is " + total + ".");
	    char playag2 = IO.inputChar (" Do you want to try again? y/n ");
	    if (playag2 == 'y')
	    {
		total = 0;
		mathfrenz ();
	    }
	    else
	    {
		System.out.println (" Okay, I guess you'll never find out.");
	    }
	}

    }


    // Task 3
    public void decode ()
    {
	System.out.println (" When you walk out of the classroom, you notice a note left by shooter.");
	System.out.println (" The only problem is that you don't know what is says becasue it is a bunch of pictures and random letters.");
	System.out.println (" You have to decode it.");
	System.out.println (" Hint: Use the pictures to get letters");
	System.out.println ("  ");
	// Title of task three
	System.out.println (",'|\"\\   ,---.   ,--,  .---.  ,'|\"\\   ,-..-. .-.  ,--,     .-. .-. .---.  _______ ,---.     .---. ");
	System.out.println (" | |\\ \\  | .-' .' .') / .-. ) | |\\ \\  |(||  \\| |.' .'      |  \\| |/ .-. )|__   __|| .-'    ( .-._)");
	System.out.println (" | | \\ \\ | `-. |  |(_)| | |(_)| | \\ \\ (_)|   | ||  |  __   |   | || | |(_) )| |   | `-.   (_) \\   ");
	System.out.println (" | |  \\ \\| .-' \\  \\   | | | | | |  \\ \\| || |\\  |\\  \\ ( _)  | |\\  || | | | (_) |   | .-'   _  \\ \\  ");
	System.out.println (" /(|`-' /|  `--.\\  `-.\\ `-' / /(|`-' /| || | |)| \\  `-) )  | | |)|\\ `-' /   | |   |  `--.( `-'  ) ");
	System.out.println ("(__)`--' /( __.' \\____\\)---' (__)`--' `-'/(  (_) )\\____/   /(  (_) )---'    `-'   /( __.' `----'  ");
	System.out.println ("    (__)          (_)               (__)    (__)      (__)    (_)            (__)             ");
	System.out.println ("    ");
	// clues
	System.out.println (" Here is the note:");
	System.out.println (" ");
	System.out.println ("          __/ \\--\\");
	System.out.println ("            |_|__|");
	System.out.println ("               ||");
	System.out.println ("               ||");
	System.out.println ("   ,   ,   ,   ,   ,|  ,   ,   ,   ,   ,");
	System.out.println ("  ||  ||  ||  ||  ||| ||  ||  ||  ||  ||");
	System.out.println ("  ||__||__||__||__|||_||__||__||__||__||");
	System.out.println ("  |.--..--..--..--..--..--..--..--..--.| ");
	System.out.println ("  ||__||__||__||__|||_||__||__||__||__||          ");
	System.out.println ("  |.--..--..--..--..--..--..--..--..--.|  ");
	System.out.println ("  ||  ||  ||  ||  ||| ||  ||  ||  ||  ||");
	System.out.println ("\\\\//|\\//gnv/\\||/|\\/\\||\\\\|//\\|\\|//\\|//\\\\///");
	System.out.println (" ");
	System.out.println ("             _   ");
	System.out.println ("           _| |_ ");
	System.out.println ("          |_   _|");
	System.out.println ("            |_| ");
	System.out.println (" ");
	System.out.println ("");
	System.out.println ("m   \" m\" \" m  m");
	System.out.println ("   \" m \" \"m   \" \" \"m m m");
	System.out.println (" \"  m  \" \"  \" \"m\" \" \" \"m m");
	System.out.println ("m  m m \"  \" \" \" \" \"m\"m\"m\"m\"m\"m");
	System.out.println ("  \" m \" \" \"m\"m\" \"m\"m\"m\"m\"m\"m\"m\"m");
	System.out.println ("\"m\"m m\"m\" \"m m\"m\"m\"m\"m\"m\"m\"m\"m\"m$\"m");
	System.out.println ("     $  \" \"m\"m\"m\"m\"m\"m\"m\"m\"m\"m$\"  $m");
	System.out.println ("     \"          \"m\"m\"m\"m\"m\"m$\"  m\"m\"m");
	System.out.println ("     $           $\"m\"m\"m\"m$\"  m\"m\"  \"m");
	System.out.println ("    m\"m          m  \"m\"m$\"  m\"m\"     \"m");
	System.out.println ("    $ $          $    $\"  m\"m\"        \"m");
	System.out.println ("     \"           m    \"$m\"m\"          m\"m");
	System.out.println ("            m\"m     $\"          m\"  $");
	System.out.println ("            $ $      $        m\"  m\"");
	System.out.println ("            \"m\"       $     m\"  m$$");
	System.out.println ("                       $  m\"  m$\"  $");
	System.out.println ("                        $\"  m\"\"$    $");
	System.out.println ("                         \"\"\"    $    $");
	System.out.println ("                                 $    $");
	System.out.println ("                                  $    $");
	System.out.println ("                                   $    $");
	System.out.println ("                                   ");
	System.out.println ("  ");
	System.out.println ("            ______ ");
	System.out.println ("           |______|");
	System.out.println ("    ");
	System.out.println ("  .----------------.   .----------------.   .-----------------.  .----------------.   .----------------.   .-----------------.  .----------------.   .----------------. ");
	System.out.println ("| .--------------. | | .--------------. | | .--------------. | | .--------------. | | .--------------. | | .--------------. | | .--------------. | | .--------------. |");
	System.out.println ("| |      __      | | | |     _____    | | | | ____  _____  | | | |  _________   | | | |  _________   | | | | ____  _____  | | | |     ______   | | | |  _________   | |");
	System.out.println ("| |     /  \\     | | | |    |_   _|   | | | ||_   \\|_   _| | | | | |  _   _  |  | | | | |_   ___  |  | | | ||_   \\|_   _| | | | |   .' ___  |  | | | | |_   ___  |  | |");
	System.out.println ("| |    / /\\ \\    | | | |      | |     | | | |  |   \\ | |   | | | | |_/ | | \\_|  | | | |   | |_  \\_|  | | | |  |   \\ | |   | | | |  / .'   \\_|  | | | |   | |_  \\_|  | |");
	System.out.println ("| |   / ____ \\   | | | |      | |     | | | |  | |\\ \\| |   | | | |     | |      | | | |   |  _|  _   | | | |  | |\\ \\| |   | | | |  | |         | | | |   |  _|  _   | |");
	System.out.println ("| | _/ /    \\ \\_ | | | |     _| |_    | | | | _| |_\\   |_  | | | |    _| |_     | | | |  _| |___/ |  | | | | _| |_\\   |_  | | | |  \\ `.___.'\\  | | | |  _| |___/ |  | |");
	System.out.println ("| ||____|  |____|| | | |    |_____|   | | | ||_____|\\____| | | | |   |_____|    | | | | |_________|  | | | ||_____|\\____| | | | |   `._____.'  | | | | |_________|  | |");
	System.out.println ("| |              | | | |              | | | |              | | | |              | | | |              | | | |              | | | |              | | | |              | |");
	System.out.println ("| '--------------' | | '--------------' | | '--------------' | | '--------------' | | '--------------' | | '--------------' | | '--------------' | | '--------------' |");
	System.out.println (" '----------------'   '----------------'   '----------------'   '----------------'   '----------------'   '----------------'   '----------------'   '----------------' ");
	System.out.println (" ");


	// the answer

	// asks user what thier answer is
	String ans3 = IO.inputString (" What does the note say? ");
	//Check if the answer is correct
	if (ans3.equalsIgnoreCase ("FP"))
	{
	    System.out.println (" Good job, you decoded the message.");
	    System.out.println (" The message says: FP");
	    System.out.println (" These are the other letters.");
	    System.out.println (" Your are just missing one lettter.");
	    System.out.println (" Complete the next task succssfully, and you can figure out who shot your dad.");
	    nim ();
	}


	// If the answer is not correct it asks the user the following
	else
	{
	    char playag3 = IO.inputChar (" Do you want to try again? y/n ");
	    if (playag3 == 'y')
	    {
		decode ();
	    }
	    else
	    {


	    }

	}
    }


    // Task 4
    public void nim ()
    {
	// storyline continues
	System.out.println (" Once you decode the note, you look up and see the shooter standing right infront of you.");
	System.out.println (" Your heart starts to race and you don't know what to do.");
	System.out.println (" The shooter starts to walk towards you, and all you can think of is to defend yourself.");
	System.out.println (" ");
	// Objective, and rules of the game is explained
	System.out.println (" Objective: Between the two of you, there is a total of 20 lives.");
	System.out.println (" You and your opponent, will take turns choosing how many lives you want.");
	System.out.println (" At each time, you have the option of taking one or two lives.");
	System.out.println (" Whoever takes the last life, wins.");
	System.out.println (" Let's begin!");
	int left = 20;
	int player = 2;
	String name1 = "Archie";
	String name2 = " the Shooter";
	System.out.println (" ");
	System.out.println (" Player 1 is Archie.");
	System.out.println (" Player 2 is the Shooter.");

	while (left > 0)
	{
	    if (player == 1)
		player = 2;
	    else
		player = 1;
	    drawLeft (left);
	    whoseturn (player, name1, name2);
	    left = turn (left, player);
	}
	whosewon (player, name1, name2);
    }


    // Determines how many lives are remaining
    public void drawLeft (int left)
    {
	System.out.println (" ");
	System.out.println ("Lives remaining: " + left);
	for (int i = 0 ; i < left ; i++)
	    System.out.println ("<3");
	System.out.println (" ");


    }


    // Determines if it is the user or computer's turn.
    public void whoseturn (int player, String name1, String name2)
    { //if player is 1, it prints that it is name1's turn
	if (player == 1)
	    System.out.println ("It is " + name1 + "'s turn.");
	else
	    System.out.println ("It is " + name2 + "'s turn.");

    }


    // Determines if number inputted is valid or not.
    public boolean isValid (int num, int left)
    { //returns false if num is greater than left
	if (num > left)
	    return false;
	else if (num == 1 || num == 2)
	    return true;
	else
	    return false;

	//returns true if num is 1 or 2

	//returns false otherwise

    }


    // Determines how many lives will be taken away
    public int turn (int left, int player)
    {
	// Determines how many lives computer takes away
	int amt = 0;
	if (player == 2)
	{
	    amt = (int) (Math.random () * 2) + 1;
	}
	else if (player == 1)
	{
	    // Asks the user how many lives they want to remove
	    amt = IO.inputInt ("How many lives do you want to remove? ");
	    while (!isValid (amt, left))
	    {
		System.out.println ("That amount is invalid. Try a smaller number.");
		amt = IO.inputInt ("How many lives do you want to remove? ");
	    }
	}
	return (left - amt);

    }


    public void whosewon (int player, String name1, String name2)
    { //if player is 1, then print name1 has lost. name2 forced them to take the last stone.
	if (player == 1)
	{
	    // Archie loses
	    System.out.println (name1 + " has lost. " + name2 + " forced them to take the last stone.");
	    System.out.println (" You have died.");
	    // Asks if the user wants to play again, starts from the beginning
	    char again = IO.inputChar ("Do you want to play again? (y/n) ");
	    if (again == 'y')
		introduction ();
	    else
		System.exit (0);


	}
	else
	{
	    // If user wins, they get the last letter
	    System.out.println (name2 + " has lost. " + name1 + " forced them to take the last stone.");
	    System.out.println (" You've beat the shooter and scared him away.");
	    run ();
	    System.out.println (" You tried to chase after him, but he was too fast.");
	    System.out.println (" ");

	    IO.printSlow (" You have the last letter : E");
	    System.out.println (" ");
	    System.out.println (" Now that you have it's up to you to unscramble the game.");
	    System.out.println (" You can pick one person to help you.");
	    System.out.println (" Make sure you pick carefully, you can't trust anyone .");
	    System.out.println (" ");
	    char whereto = IO.inputChar (" You can pick out of Jughead Jones or Betty Cooper. (j/b)");
	    // If user picks 'j'
	    if (whereto == 'j')
	    {
		System.out.println (" ");
		jughead ();
		System.out.println (" I told you to pick carefully.");
		System.out.println (" I guess you didn't listen to me.");
		System.out.println (" Jughead could not be trusted.");
		System.out.println (" You have died.");
		System.out.println (" ");
		char again = IO.inputChar ("Do you want to play again? (y/n) ");
		if (again == 'y')
		    introduction ();
		else
		    System.exit (0);


	    }
	    else
		// if user picks 'b'
		{
		    System.out.println (" ");
		    betty ();
		    System.out.println (" You have picked Betty Cooper. Good choice.");
		    System.out.println (" Now it is time to unscramble.");
		    System.out.println (" ");
		    unscramble ();
		}

	}
    }


    // Task 5
    public void unscramble ()
    {
	System.out.println (" It is up to you to unscramble the letters.");
	System.out.println (" The letters are : N O J S F P E");
	System.out.println (" Time is ruuning out, the shooter has tracked you down.");
	System.out.println (" You only have one chance to get this right.");
	System.out.println (" ");
	System.out.println (" --- UNSCRAMBLE ---");
	System.out.println (" ");
	System.out.println (" Keep in mind that the name is 2 words.");
	System.out.println (" Hint: The first name in only two letters, the last name ahs been encountered during the game.");
	System.out.println (" ");
	String shootname = IO.inputString (" What is your guess?");
	// If user unscrambles correctly, they win the game and go to conclusion
	int count = 0;
	if (shootname.equalsIgnoreCase ("FP JONES"))
	{
	    System.out.println (" ");
	    System.out.println (" Congratulations, you have figured out the identity of the shooter.");
	    System.out.println (" ");
	    conclusion ();
	}
	else
	{
	    // If user does not guess correctly, they have the option of starting again
	    char again = IO.inputChar ("Do you want to play again? (y/n) ");
	    if (again == 'y')
		introduction ();
	    else
		System.exit (0);
	}
    }


    // Conclusion begins if player wins
    public void conclusion ()
    {
	System.out.println (" You have figured out who the shooter is.");
	System.out.println (" You are safe now.");
	System.out.println (" Thanks to your intelligence, the town of RIVERDALE has been saved.");
	System.out.println (" You can go back to living the happy life eith your friends and fsmily in RIVERDALE.");
	init ();
	System.out.println (" ");
	char again = IO.inputChar ("Do you want to play again? (y/n) ");
	if (again == 'y')
	    introduction ();
	else
	    System.exit (0);
    }


    // Shows a picture of Riverdale at the end of the game.
    public void init ()
    {
	JOptionPane.showMessageDialog (null, createImageIcon ("riverdale.jpg"), "Riverdale", JOptionPane.INFORMATION_MESSAGE);
    }


    // Shows a picture of Jughead.
    public void jughead ()
    {
	JOptionPane.showMessageDialog (null, createImageIcon ("jughead.gif"), "Riverdale", JOptionPane.INFORMATION_MESSAGE);
    }


    // Shows a picture of Betty.
    public void run ()
    {
	JOptionPane.showMessageDialog (null, createImageIcon ("run.gif"), "Riverdale", JOptionPane.INFORMATION_MESSAGE);
    }


    // Shows a picture of Betty.
    public void betty ()
    {
	JOptionPane.showMessageDialog (null, createImageIcon ("betty.gif"), "Riverdale", JOptionPane.INFORMATION_MESSAGE);
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = RPG.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}
	else
	{
	    // The file cannot be found
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}

    }


    public void curly ()
    {

	{
	    System.out.println ("  @@@@@@@@@@@");
	}

    }


    public void straight ()
    {

	System.out.println ("  |||||||||||");
    }


    public void round ()
    {
	System.out.println ("  ********** ");
	System.out.println (" *          *");
	System.out.println ("*  __    __  *");
	System.out.println ("       L     ");
	System.out.println ("*     ---    *");
	System.out.println (" *          * ");
	System.out.println ("  **********   ");
    }


    public void square ()
    {
	System.out.println ("  -----------");
	System.out.println ("  | ()   () |");
	System.out.println ("  |    L    |");
	System.out.println ("  |  -----  |");
	System.out.println ("  |         |");
	System.out.println ("  -----------");
    }


    // Allows the user to customize their player
    public void character ()
    {
	System.out.println (" Before you start, you must choose what you want to look like.\n It is time to choose how you would like your character to look.");
	System.out.println (" Pick the hair for your player.");
	System.out.println (" a) curly");
	System.out.println (" b) straight");
	char hair = IO.inputChar (" What hair would you like for your character? ");
	System.out.println (" ");
	System.out.println (" Pick the face shape for your player.");
	System.out.println (" a) round");
	System.out.println (" b) square");
	char face = IO.inputChar (" What face shape would you like? ");

	if (hair == 'a')
	{
	    curly ();
	}
	else
	{
	    straight ();
	}
	if (face == 'a')
	{
	    round ();
	}
	else
	{
	    square ();
	}
	System.out.println (" ");
	System.out.println (" This is what you have chosen to look like.");
	System.out.println (" ");

    }
}


