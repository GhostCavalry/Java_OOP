package skeleton;

import java.io.IOException;
import java.util.Scanner;

public class MailMenu {

	
	public void Mail() throws IOException { // MainAccess classı (ana menü) ile benzer yapıdadır, daha fazla yorum satırı orada mevcuttur
		Call menua = new Call();
		menua.altmenu();
		
		Scanner scan = new Scanner(System.in);
		while (!scan.hasNextInt()) {
		      System.out.println("Lütfen bir sayı girin");
		      scan.nextLine();
		    }
		
		int choice = scan.nextInt();
	
		
		if (choice == 1 || choice == 2 || choice == 3) {
			
			switch(choice) {
			
			case 1:
				EliteMail eliteMail = new EliteMail(); // Elit üyelere mail gönderimi
				eliteMail.MailElit();
				break;
				
			case 2:
				GeneleMail geneleMail = new GeneleMail(); // Genel üyelere mail gönderimi
				geneleMail.MailGenel();
				break;
			
			
			case 3 :
				HerkeseMail herkeseMail = new HerkeseMail(); // Bütün üyelere mail gönderimi
				herkeseMail.MailHerkes();
				break;
				
			}
		}
		else {
			
			Call sayiharici = new Call();
			sayiharici.gecerlisayialt();

		}
		
		
	}

		
	}
	
	
	

