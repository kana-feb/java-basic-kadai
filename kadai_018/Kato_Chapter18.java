package kadai_018;

abstract public class Kato_Chapter18 {
	
	public String familyName = "加藤";
	public String givenName = "";
	public String address = "東京都中野区〇×";

	public void commonIntroduce(String name)	{
		System.out.println("名前は"+ familyName + givenName +"です");
		System.out.println("住所は"+ address + "です");
	}
	

	public abstract void eachIntroduce();
	
	
	
	
	
}
