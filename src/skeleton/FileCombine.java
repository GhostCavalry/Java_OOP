package skeleton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCombine {
	
	public void Merge() throws IOException { // Burasıyla birlikte öncelikle txt dosyaları birleştirilir daha sonra mail menüsü açılır
		
        PrintWriter pw = new PrintWriter("Kullanicilar.txt"); // Txt dosyalarının hangi adrese 'print' edileceği girilir
          
        BufferedReader br = new BufferedReader(new FileReader("Elit.txt")); // İlk olarak alınacak olan txt dosyası adresi
          
        String dize = br.readLine(); // Okunan içeriğin line String'ine yazılması
          
        while (dize != null) // Line değeri bir değer içeriyorken;
        {
            pw.println(dize); 	// hedef dosyaya basılması
            dize = br.readLine(); // satırların okunması ve döngüyle başa sarıp rutine getirmesi
        }
          
        br = new BufferedReader(new FileReader("Genel.txt")); // Aynı işlemlerin 2.txt dosyası için tekrarlanması
          
        dize = br.readLine();
          
        while(dize != null)
        {
            pw.println(dize);
            dize = br.readLine();
        }
          
        pw.flush(); // Buffer'a veri gönderimi sonlandı, önbellek temizlendi
          
        br.close(); // dosyalar kaydolup kapandı
        pw.close();
          
        // System.out.println("Merged file1.txt and file2.txt into file3.txt");
        
		    //==>    // Hangi dosyaların hangi dosya altında birleştiği bilgisi veriliyor ancak menü itibariyle görüntü kirliliği
        					// oluşturmaması açısından yorum satırına alındı
		
	}

}
