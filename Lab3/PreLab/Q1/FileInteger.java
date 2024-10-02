package FileQstn;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class FileInteger 
	{
		public static void main(String[] args) 
			{
				try 
				{
					File file = new File("file.txt");
					if(!file.exists())
						{
							file.createNewFile();
						}
					PrintWriter pw = new PrintWriter(file);
					int a =10;
					int b = 20;
					int c = a+b;
					pw.write(a+" "+b+" ");
					pw.write(" this is the sum : "+c);
					pw.close();
					System.out.println("Done");
				 }
			catch (IOException e)
			{
				e.printStackTrace();

			}
		}
	}


