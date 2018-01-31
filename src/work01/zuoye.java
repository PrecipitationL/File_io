package work01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class zuoye {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file=new File("D:/I/a.txt");
		Reader reader=new FileReader(file);
	    char[] c=new char[(int)file.length()];
		reader.read(c);
		String str=new String(c);
		File file1=new File("D:/O/a.txt");
		file1.createNewFile();
		Writer writer=new FileWriter(file1);
	    writer.write(str);
	    writer.flush();
	    writer.close();
		System.out.println("–¥ÕÍ¡À");

	}

}
