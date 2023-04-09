package skeleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Topicss {

String fortab = "\t";
	
	public void ElitUye() throws IOException {
		
		String dosyaismi = "Elit.txt";
		
		try {
		BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaismi,false));
		writer.write("#" + fortab + "Elit" + fortab + "Üyeler");
		writer.newLine();
		writer.close();
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void GenelUye() throws IOException {
		
		String dosyaadi = "Genel.txt";

		BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaadi,false));
		writer.write("#" + fortab + "Genel" + fortab + "Üyeler");
		writer.newLine();
		writer.close();
		
	}
	
}
