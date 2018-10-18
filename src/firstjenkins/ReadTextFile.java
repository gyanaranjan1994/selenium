package firstjenkins;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.io.FileUtils;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fis=new FileReader("C:\\Users\\maverick\\Desktop\\gyan.txt");
		BufferedReader br= new BufferedReader(fis);
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		/*while( true ) {
		    String line = br.readLine();
		    System.out.println(line);
		    if ( line == null ) break;
		    // do stuff to file here
		}*/

	}

}
