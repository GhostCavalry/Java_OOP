package skeleton;

import java.io.IOException;
import java.util.Scanner;

public class MainAccess {

	public void Welcome() throws IOException {
		
		
		Call menu = new Call();  // Ana sayfa ve seçeneklerin çağırılması
		menu.anamenu();
		
		Scanner scan = new Scanner(System.in); // Girilen sayının tutulması için Scanner sınıfının kullanımı
		
		while (!scan.hasNextInt()) { // Sayı yerine karakter girilmesi durumunda uyarı verilip seçeneklerin tekrar sunulması, karakter kontrolü
		      System.out.println("Lütfen bir sayı girin");
		      scan.nextLine();
		    }
		
		int choice = scan.nextInt(); // Switch case için girilen sayının tutulması
	
		
		if (choice == 1 || choice == 2 || choice == 3) { // Ana menü seçeneklerimiz 1, 2 ve 3'ten ibaret olduğu için bu şekilde kontrolü yapılır
			
			switch(choice) { // Yapılan tercihe göre gerekli classa gerekli yönlendirmenin yapılması
			
			case 1 :
				AddPersonnel personnelinfo = new AddPersonnel(); // Elit üye ekleme kısmının çağrılması
				personnelinfo.Elit();
				break;
			case 2 : 
				AddPersonnelG personnelinfotwo = new AddPersonnelG(); // Genel üye ekleme kısmının çağrılması
				personnelinfotwo.Genel();
				break;
			case 3 :
				FileCombine filecombine = new FileCombine(); // İlk başta ayrı şekilde açılan txt'ler burada ortak bir txt'te birleştirilir.
				filecombine.Merge();						// Bunun ve 2.menü kısmının açılması için çağrılır
				MailMenu mailsection = new MailMenu(); 		
				mailsection.Mail();							// Mail işlemleri için alt menüye geçilmesi
				break;
				
			}
		}
		else { 
			
			Call sayiharici = new Call(); // Gerekli metodun çağrılması
			sayiharici.gecerlisayi();

		}
		
		
	}
}
