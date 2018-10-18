package opps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Removeduplicate {

	public static void main(String[] args) {
		String str="gyana ranjan moharana";
		str=str.replaceAll(" ", "");
		char [] ch=str.toCharArray();
		HashMap<Character, Integer> map= new HashMap<Character,Integer>();
		for(Character c: ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println("Duplicate characters are: "+str);
		Set<Character> set=map.keySet();
		for(Character s:set)
		{
			if(map.get(s)>1)
			{
				System.out.println(s+" "+map.get(s));
				
			}
		}
	}

}
