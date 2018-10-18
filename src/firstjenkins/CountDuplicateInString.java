package firstjenkins;

import java.util.HashMap;
import java.util.Set;


public class CountDuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="gyana ranjan moharana";
		String s=str.replaceAll(" ", "");
		char [] ch=s.toCharArray();
		HashMap<Character, Integer> tiger= new HashMap<Character, Integer>();
		for(Character c: ch)
		{
			if(tiger.containsKey(c))
			{
				tiger.put(c, tiger.get(c)+1);
			}
			else
			{
				tiger.put(c, 1);
			}
		}
		Set<Character> set=tiger.keySet();
		for(Character c:set)
		{
			if(tiger.get(c)>1)
			{
				System.out.println(c+" "+tiger.get(c));
			}
				
		}
	}

}
