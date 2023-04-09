package skeleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class AddPersonnel {
	
	String ad,soyad,mail; //Bazı tanımlamaların yapılması
	String fortab = "\t";
	String dosyaismi = "Elit.txt";
	
	public void Elit() throws IOException{
		
			try {
				
				BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaismi,true)); // Yazımın hangi dosyaya olacağını gösterir, 
				System.out.println("Ad: ");													// true değeri atanarak da kalıcı olması sağlanır
				Scanner scan = new Scanner(System.in);
				ad = scan.nextLine();
				System.out.println("Soyad: ");
				Scanner scan1 = new Scanner(System.in);	// Yazılacak bilgilerin alınması ve tutulması
				soyad = scan1.nextLine();
				System.out.println("Mail: ");
				Scanner scan2 = new Scanner(System.in);
				mail = scan2.nextLine();
				writer.write("#" + fortab + "Elit" + fortab + "Üyeler");
				writer.newLine();
				writer.write(ad + fortab + soyad + fortab + mail); // Bilgilerin yazılması ve hangi sırayla yazılacağı gösterilir
				writer.newLine(); // Bilgiler yazıldıktan sonra yazılan satırın atlanması (Sonraki işlemde bunu görürüz)
				writer.close(); // Dosyanın kaydolup kapanması
				
			} catch (IOException e) { // Hangi kodda ya da hangi satırda sorun olduğunun debug kısmında yakalanması ve bunun gösterilmesi 
				e.printStackTrace();
			}
				
				Call basarilikayit = new Call(); // Başarılı olan kaydın söylenmesi,çağrılması
				basarilikayit.kayitbasarili();
				
				MainAccess accessable = new MainAccess(); // Kayıt sonrası ana menüye geri dönüşün çağrılması
				accessable.Welcome();
				
				
				
			}
			
	
	
	
		
			
	
}

/*try {
BufferedReader reader = new BufferedReader(new FileReader("Elit.txt"));
String line;
while((line = reader.readLine()) != null) {
	System.out.println(line);
}
for(String needed: parameters) {
	reader.read();
}
reader.close();

} catch(IOException e) {
	e.printStackTrace();
}*/





	
