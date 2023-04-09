package skeleton;

import java.io.IOException;
import java.util.Scanner;

public class Call {

	public void cikis(){
		
		System.out.println("--------------");
		System.out.println("Cikis yapilmistir, saglikli gunler..");
		
	}
	
	public void baskasayi() {
		
		System.out.println("Lutfen gecerli bir sayi secin");
		
	}
	
	public void islembitti() {
		
		System.out.println("Islemler sona erdi. Ana menu icin 1'e, cikis icin 0'a basiniz");
		
	}
	
	public void anamenu() {
		
		System.out.println("-----------------"); //Ana sayfa ve seçenekler
		System.out.println("1-Elit uye ekleme");
		System.out.println("2-Genel uye ekleme");
		System.out.println("3-Mail gonderme");
		
	}
	
	public void kayitbasarili() {
		
		System.out.println("Kayit basariyla alindi");
		
		
	}
	
	public void altmenu() {
		
		System.out.println("1-Elit uyelere mail");
		System.out.println("2-Genel uyelere mail");
		System.out.println("3-Tum uyelere mail");
		
	}
	
	public void gecerlisayi() throws IOException {
		
		System.out.println("Lutfen gecerli bir sayi secin"); // Seçenek haricinde sayı girişi yapılması durumunda verilen uyarı, yeniden menü yönlendirmesi
		MainAccess accessable = new MainAccess(); 
		accessable.Welcome();
		
	}
	
	public void gecerlisayialt() throws IOException {
		
		System.out.println("Lutfen gecerli bir sayi seçin"); 
		MailMenu accessablea = new MailMenu();
		accessablea.Mail();
		
	}
	
	public void ugurlama() throws IOException { // İslemler sona erdiğinde karakter kontrolü ve numara sorgulama yapıldıktan sonra çıkışa yönlendirilir..
		
		Call secenek = new Call();
		secenek.islembitti();
		
		Scanner tara = new Scanner(System.in);

		while (!tara.hasNextInt()) {
		      System.out.println("Lutfen bir sayi girin");
		      tara.nextLine();
		    }

		int secim = tara.nextInt();
		
		if (secim == 1 || secim == 0 ) {

		switch(secim) {

		case 1:
			MainAccess accessable = new MainAccess();
			accessable.Welcome();
			break;
		case 0:
			Call bitir = new Call();
			bitir.cikis();
			break;
			}
		}
		else {
			Call degisiklik = new Call();
			degisiklik.baskasayi();
			
			Call seceneka = new Call();
			seceneka.ugurlama();
		}
	}
}
