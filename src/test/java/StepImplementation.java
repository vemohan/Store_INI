import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import com.thoughtworks.gauge.*;

import com.thoughtworks.gauge.Step;


@SuppressWarnings("unused")
public class StepImplementation {

	@Step("Read STORE.INI file")
	public void WebPOS() throws IOException {
   		 @SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader("STORE.txt"));
		String line = null;
		
		 while ((line = br.readLine()) != null) {
		   System.out.println(line);
		 }
		}
	
	@Step("WebPOS section in STOREINI")

	public void webpos_section() throws IOException {
		try {
	       @SuppressWarnings("resource")
			Scanner scanner = new Scanner(new FileInputStream("STORE.txt"));

	        boolean tokenFound = false;
	        while (scanner.hasNextLine()) {
	           String line = scanner.nextLine();

	            if (line.equals("[WEBPOS]")) 
	            {
	                tokenFound = true;
	            } else if (line.equals("[chain]")) {
	                tokenFound = false;
	            }

	            if ((tokenFound) && (!line.equals("[GS1]"))) {
	                System.out.println(line);
		            }
	        }
	    } catch (Exception e) {
	      System.out.println("STORE.INI file is not found");
	    }
	}
	
	@Step("Interface_enabled Keys are removed")
	public void Interface_Key() {
		
		try {
			       @SuppressWarnings("resource")
					Scanner scanner = new Scanner(new FileInputStream("STORE.txt"));

			        while (scanner.hasNextLine()) {
			           String line = scanner.nextLine();

			            if (line.equals("Interface_Enabled")) 
			            {
			            	System.out.println("Scenario failed :- Interface_Enabled Key is present in STORE.INI");
			            } 
			            
			    }
			      
		            	System.out.println("Interface_Enabled Key is not found in STORE.INI");
		            	         
		}
		catch (Exception e) {
			      System.out.println("STORE.INI file is not found");
			    }
	}

	@Step("Translator_enabled Keys are removed")
	public void Translator_Key() {
		try {
		       @SuppressWarnings("resource")
				Scanner scanner = new Scanner(new FileInputStream("STORE.txt"));

		        while (scanner.hasNextLine()) {
		           String line = scanner.nextLine();

		            if (line.equals("Translator_enabled")) 
		            {
		            	System.out.println("Scenario failed :- Translator_enabled Key is present in STORE.INI");
		            } 
		            
		    }
		      
	            	System.out.println("Translator_enabled Key is not found in STORE.INI");
	            	         
	}
	catch (Exception e) {
		      System.out.println("STORE.INI file is not found");
		    }
}
	}
	




 

 

	

	
	

