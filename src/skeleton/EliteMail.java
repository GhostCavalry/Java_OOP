package skeleton;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EliteMail {
	
	public void MailElit() throws IOException  { /*Dipnot : Mail gönderimleri doğru bir şekilde çalışıyor, sadece txt dosyalarındaki 'Üyeler' 
												kısmını da TAB split'inden dolayı mail adresi olarak varsaydığı için konsolda 
												'Invalid Adresses' olarak bi uyarı çıkıyor. Bu uyarı programın çalışmasına herhangi bir 
												engel oluşturmamaktadır*/
		
		String path = "Elit.txt"; // Hangi dosyadan işlem yapılacağı
		String satir = ""; // String değeri atanarak okuma sonrası yönlendirmesi yapılacaktır
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path)); // Hangi dosyanın okunacağı bilgisi girilir
			
			while((satir = br.readLine()) != null) { // İçerik -değer yok- döndürmediği sürece; ([null 0'a eşit değildir])
				
				String[] degerler = satir.split("\\t"); // Sütunlarımızı TAB ile ayırdığımız için bunu split ile bu şekilde parçalıyoruz
				System.out.println(degerler[2]); // Mail gönderileceği sırada önce hangi mail adresi olduğu buradan basılıyor
				
				String to = degerler[2]; // Bize mail adresi gerektiği için 2.index'i alıyoruz (3.sütun)
				String from = "Mail adresiniz"; // Mailin çıkış yapacağı adres (bizim mailimiz)
				
				Properties properties = new Properties(); // Yapılandırılabilir parametreler için kullandığımız özelliktir
				
				properties.put("mail.smtp.auth", "true");	// Bu proje için kullandığımız, mail gönderme kısmı için tanımlanan nitelikler
				properties.put("mail.smtp.starttls.enable", "true"); 
				properties.put("mail.smtp.host", "smtp.gmail.com");
				properties.put("mail.smtp.port", "587");
				
				Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() // Kullanıcı bilgilerinin tutumu
						{																				// için session kullanılıyor.
							protected PasswordAuthentication getPasswordAuthentication() {				// İstenilen değer tutulabilir, 
																										// biz de ayarladığımız propertiesleri
								return new PasswordAuthentication("Mail adresiniz","Uygulama şifreniz"); // ve auth package'ını tanımladık
																										// Hesap bilgileri buraya girilir
							}
						});
						try {
							MimeMessage message = new MimeMessage(session);
							message.setFrom(new InternetAddress(from)); // Mailin kimden geldiğine dair bilgi
							message.addRecipient(Message.RecipientType.TO, new InternetAddress(to)); // Mailin nereye gideceği bilgisi
							message.setSubject("Nesne Yönelimli Programlama"); // Mail konusu
							message.setText("Vize Projesi"); // Mail içeriği
							Transport.send(message); // Alınan özelliklerin maile gönderilmesi -transport edilmesi-
							System.out.println("Mail başarıyla gönderilmiştir..."); // Mail başarıyla gönderilince konsolda çıkan ifade
							
						}catch (MessagingException mex) { // Mesaj yoluyla alınan hataya göre bir exception ifadesi
							mex.printStackTrace();
						}
				
			}
			
		}catch (FileNotFoundException e) { // Belirtilen dosya yolunun doğru olmaması durumunda yakalanan hatalar için
			e.printStackTrace();
		}catch (IOException e) { // Akışlar, dosyalar, izinler vs için hata yakalayan özel sınıf
			e.printStackTrace();
		}
		
		
		Call ending = new Call(); // Gerekli metodun çağrılması
		ending.ugurlama();

		
			
	}
	
}
