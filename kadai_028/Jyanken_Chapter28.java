package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");
            
            String myChoice = scanner.next();  // ← ここで毎回入力！

            if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
                return myChoice;
            } else {
                System.out.println("error：r / s / p のいずれかを入力してください");
            }
        }
    }
    
    public String getRandom() {
    	String [] enemyChoiceArray = {"r","s","p"};
    	int randNum = (int)Math.floor(Math.random()*3);
    	
    	return enemyChoiceArray[randNum];    
    }
    
    public void playGame(String myChoice,String enemyChoice) {
    	HashMap<String,String> jankenMap = new HashMap<>();
    	jankenMap.put("r", "グー");
    	jankenMap.put("s","チョキ");
    	jankenMap.put("p", "パ－");
    	
    	System.out.println("あなたの手は"+ jankenMap.get(myChoice)+",対戦相手の手は"+ jankenMap.get(enemyChoice));
    	
    	if(myChoice.equals(enemyChoice)) {
    		System.out.println("あいこです");
    	}
    	else if(myChoice.equals("r") && enemyChoice.equals("s")||
    			myChoice.equals("s") && enemyChoice.equals("p")||	
    			myChoice.equals("p") && enemyChoice.equals("r")) {
    		System.out.println("自分の勝ちです");    		
    	}
    	else {
    		System.out.println("自分の負けです");
    	}
    
    }
        
    
}

	
	