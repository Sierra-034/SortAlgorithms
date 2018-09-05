import java.io.FileInputStream;
import java.io.File;

public class Application {
	public static void main(String[] sierra034) throws Exception {
		File f = new File("Temperatura.dat");
		FileInputStream mf = new FileInputStream("Temperatura.dat");
		byte[] data = new byte[4];
		mf.read(data);

		for(byte n : data)
			System.out.println(n);

		System.out.println(f.length());
	}
}