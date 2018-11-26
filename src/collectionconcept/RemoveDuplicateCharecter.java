package collectionconcept;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="gyana ranjan";
		char [] ch=str.toCharArray();
		List<Character> list= new ArrayList<Character>();
		for (char c:ch)
		{
			list.add(c);
		}
		Set<Character> set=new LinkedHashSet<Character>(list);
		String s="";
		for(char a:set)
		{
			s=s+a;
		}
		System.out.println(s);

	}

}
