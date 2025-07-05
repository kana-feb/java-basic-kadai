package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		
		Jyanken_Chapter28 myJanken = new Jyanken_Chapter28();
		
		String myChoice = myJanken.getMyChoice();		
		String enemyChoice = myJanken.getRandom();
		myJanken.playGame(myChoice,enemyChoice);
		
	}
}

