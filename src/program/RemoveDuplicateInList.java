package program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Hello");
		list.add("hello");
		list.add("Hello");
		list.add("Hello");
		list.add("india");
		list.add("india");
		HashMap<String, Integer> map =new HashMap<String,Integer>();
		for(String c :list)
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
		Set<String> set=map.keySet();
		for(String s:set)
		{
			if(map.get(s)>1)
			{
				System.out.println(s+" is "+map.get(s));
			}
			else
			{
				System.out.println(s+" is "+map.get(s));
			}
		}
		

	}

}
