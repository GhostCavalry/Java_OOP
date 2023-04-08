package skeleton;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		MainAccess accessable = new MainAccess(); // Program ilk çalıştırıldığında main tarafından MainAccess classına yönlendirilerek başlar
		accessable.Welcome();
		
	}

}

