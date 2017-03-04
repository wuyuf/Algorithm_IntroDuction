package java_twelve_Unicode;


import java.io.File;
import java.io.OutputStream;
import java.io.FileOutputStream;
public class charSetEncoding2 {
	public static void main(String args[])throws Exception{
	File f = new File("/Users/wuyufan/Downloads" + File.separator + "test.txt");
	OutputStream out = new FileOutputStream(f);
	byte[] b = "china hello!".getBytes("ISO8859-1");
	out.write(b);
	out.close();
	}
}
