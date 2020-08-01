import java.io.*;

public class MyClass {
	public static void main(String[] args) {
		try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			String s = bufferRead.readLine();
			String filename = String.format("result%s.txt", s);
			PrintWriter writer = new PrintWriter(filename, "UTF-8");
			while(s.equals("x")==false) {
				s = bufferRead.readLine();
				writer.println(s);
			}
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
