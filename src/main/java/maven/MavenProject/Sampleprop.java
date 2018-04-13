package maven.MavenProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Sampleprop
{

	public static void main(String[] args) throws IOException
	{
		String path="./sampleconfig.properties";
		FileInputStream input=new FileInputStream(path);
		//FileOutputStream output=new FileOutputStream(path);
		
		//1)craete an object for property file
		Properties prop=new Properties();
		
		//2)load the file
		prop.load(input);
		
		//3)perform the operation(here im getting  the value from the property file)
		Object data = prop.getProperty("URL");
		System.out.println(data);
		
	
		//to set and then updatethe value
		/*prop.setProperty("TIMEOUTS","20" );
		
		System.out.println(prop.getProperty("TIMEOUTS"));
		prop.store(output, path);
		*/
	}
}
