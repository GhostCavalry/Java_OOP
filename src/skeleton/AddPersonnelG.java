package skeleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class AddPersonnelG { // AddPersonnel classı ile aynı yorum satırlarını içerir
	
	String ad,soyad,mail; 
	String fortab = "\t";
	String dosyaadi = "Genel.txt";

	public void Genel() throws IOException {
		
			try {
			
				BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaadi,true));
				System.out.println("Ad: ");
				Scanner scan3 = new Scanner(System.in);
				ad = scan3.nextLine();
				System.out.println("Soyad: ");
				Scanner scan4 = new Scanner(System.in);
				soyad = scan4.nextLine();
				System.out.println("Mail: ");
				Scanner scan5 = new Scanner(System.in);
				mail = scan5.nextLine();
				writer.write(ad + fortab + soyad + fortab + mail); 
				writer.newLine();
				writer.close();
		
			}catch (IOException e) {
				e.printStackTrace();
			}
		
			Call basarilikayit = new Call(); 
			basarilikayit.kayitbasarili();
			
			MainAccess accessable = new MainAccess();
			accessable.Welcome();;
			
		}
		
	
	}
