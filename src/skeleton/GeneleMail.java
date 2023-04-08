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

public class GeneleMail {
	
	public void MailGenel() throws IOException { // EliteMail classında bütün açıklamalar yapılmıştır
		
		String path = "Genel.txt";
		String satir = "";
			
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while((satir = br.readLine()) != null) {
				
				String[] degerler = satir.split("\\t");
				System.out.println(degerler[2]);
				
				String to = degerler[2];
				String from = "Mail adresiniz";
				
				Properties properties = new Properties();
				
				properties.put("mail.smtp.auth", "true");
				properties.put("mail.smtp.starttls.enable", "true");
				properties.put("mail.smtp.host", "smtp.gmail.com");
				properties.put("mail.smtp.port", "587");
				
				Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator()
						{
							protected PasswordAuthentication getPasswordAuthentication() {
								
								return new PasswordAuthentication("Mail adresiniz","Uygulama şifreniz");
							
							}
						});
						try {
							MimeMessage message = new MimeMessage(session);
							message.setFrom(new InternetAddress(from));
							message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
							message.setSubject("Nesne Yönelimli Programlama");
							message.setText("Vize Projesi");
							Transport.send(message);
							System.out.println("Mail başarıyla gönderilmiştir...");
						}catch (MessagingException mex) {
							mex.printStackTrace();
						}
				
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		Call ending = new Call(); // Gerekli metodun çağrılması
		ending.ugurlama();
		
		
		
		
		
	}

}
