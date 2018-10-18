package javaprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTextFile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		File file= new File("C:\\Users\\maverick\\Desktop\\xxx.txt");
		FileReader fr= new FileReader(file);
		BufferedReader br= new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
				{
			System.out.println(line);
			
				}
		br.close();

	}

}
