package collectionconcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Count_Duplicate_CharecterIn_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaaabbbccccdddd";
		char [] ch=str.toCharArray();
		HashMap<Character, Integer> map=new HashMap<Character,Integer>();
		for(char c:ch)
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
		Set<Character> set=map.keySet();
		for(char s:set)
		{
			
			System.out.println(s+"------"+map.get(s));
		}

	}

}
