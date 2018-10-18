package collectionconcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar= new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		ar.add("gyan");
		ar.add("ranjan");
		ar.add("ranjan");//allow duplicate
		System.out.println(ar.size());//size() define the size of ArrayList
		System.out.println(ar.get(3));//get() fetch the value by index of ArrayList 
		//print all the value present in ArrayList by using for loop
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		//generic ArrayList
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		ar1.add(10);
		ar1.add(20);
		ArrayList<String> ar2= new ArrayList<String>();
		ar2.add("gyan");
		ar2.add("ranjan");
		//if you want to add any type of data
		//ArrayList<E> ar3= new ArrayList<E>();
		Employee e1= new Employee("gyan", 22, "QA");
		Employee e2=new Employee("ranjan", 20, "QA");
		Employee e3=new Employee("tom", 30, "QA");
		ArrayList<Employee> ar4= new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		//iterator use for travers
		Iterator<Employee> it=ar4.iterator();
		while(it.hasNext())
		{
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		//addAll()
		ArrayList<String> ar5= new ArrayList<String>();
		ar5.add("test");
		ar5.add("selenium");
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("dev");
		ar6.add("java");
		ar6.add("test");
		ar5.addAll(ar6);
		for(int i=0;i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
		}
		//retainAll()
		ar5.retainAll(ar6);
		for(int i=0;i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
		}
		ArrayList<String> ar7= new ArrayList<String>();
		ar7.add("test");
		ar7.add("selenium");
		ArrayList<String> ar8=new ArrayList<String>();
		ar8.add("dev");
		ar8.add("java");
		ar8.add("test");
		ar7.removeAll(ar8);
		for(int i=0;i<ar7.size();i++)
		{
			System.out.println(ar7.get(i));
		}
		
	}

}
