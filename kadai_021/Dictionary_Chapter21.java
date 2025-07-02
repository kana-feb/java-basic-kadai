package kadai_021;

import java.util.HashMap;

	public class Dictionary_Chapter21 {
		//ハッシュマップ宣言
		private HashMap<String, String> word;
		
			// コンストラクタで辞書を初期化
			public Dictionary_Chapter21() {
				word = new HashMap<String,String>();

				
				word.put("apple", "りんご");
				word.put("peach", "桃");
				word.put("banana", "バナナ");
				word.put("lemon", "レモン");
				word.put("pear", "梨");
				word.put("kiwi", "キウィ");
				word.put("strawberry", "いちご");
				word.put("grape", "ぶどう");
				word.put("muscat", "マスカット");
				word.put("cherry", "さくらんぼ");
				
			 }
		    
			// 検索メソッド
			public void search(String[] Questions) {
				for(int i = 0;i < Questions.length;i++) {
					String q = Questions[i];
					if(word.get(q) == null || word.isEmpty()) {
						System.out.println(q + "は辞書に存在しません");				
					}
					else {
						System.out.println(q +"の意味は"+ word.get(q));
					}
				}			
			}
	}
