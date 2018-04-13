package maven.MavenProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop
{
	

		public static void main(String[] args) throws IOException
		{
			String path="./config.properties";
			FileInputStream input=new FileInputStream(path);
			//FileOutputStream output=new FileOutputStream(path);
			
			//1)craete an object for property file
			Properties prop=new Properties();
			
			//2)load the file
			prop.load(input);
			
			//3)perform the operation(here im getting  the value from the property file)
			Object data = prop.getProperty("VDI");
			System.out.println(data);
			
		
			Object data1 = prop.getProperty("ALM");
			System.out.println(data1);
			
			Object data2= prop.getProperty("SNOWApplication");
			System.out.println(data2);
			//to set and then updatethe value
			/*prop.setProperty("TIMEOUTS","20" );
			
			System.out.println(prop.getProperty("TIMEOUTS"));
			prop.store(output, path);
			*/
		}
	
}