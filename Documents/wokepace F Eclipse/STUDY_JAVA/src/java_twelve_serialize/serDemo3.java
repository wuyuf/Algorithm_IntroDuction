package java_twelve_serialize;

import java.io.*;

public class serDemo3 {
	public static void main(String args[]) throws Exception{
//		ser() ;
		dser() ;
	}
		public static void ser() throws Exception{
			File f= new File("/Users/wuyufan/Downloads" + File.separator + "test.txt");
			ObjectOutputStream  oos = null;
			OutputStream out = new FileOutputStream(f);
			oos = new ObjectOutputStream(out);
			oos.writeObject(new Person("zhang san ",30));	//保存对向
			oos.close();	//关闭
		}
		public static void dser() throws Exception{
			File f= new File("/Users/wuyufan/Downloads" + File.separator + "test.txt");
			ObjectInputStream ois = null;
			InputStream input = new FileInputStream(f);
			ois = new ObjectInputStream(input);
			Object obj = ois.readObject();
			ois.close();
			System.out.println(obj);
			
		}
	} 

