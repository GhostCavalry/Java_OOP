package skeleton;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Topicss able = new Topic();
		able.ElitUye();
		
		Topicss ableD = new Topic();
		ableD.GenelUye();
		
		MainAccess accessable = new MainAccess(); // Program ilk çalıştırıldığında main tarafından MainAccess classına yönlendirilerek başlar
		accessable.Welcome();
		
	}

}

