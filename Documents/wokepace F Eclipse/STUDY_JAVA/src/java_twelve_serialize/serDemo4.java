package java_twelve_serialize;
import java.io.*;
public class serDemo4 {
	public static void main(String args[])throws Exception{
		Person per[] = {new Person("zhd",39),new Person("sdfs",34),new Person("王五",32)} ;
		ser(per);
		Object o[] = (Object[])dser() ;
		for(int i=0;i<o.length;i++){
			Person p = (Person)o[i];
			System.out.println(p) ;
		}
	}
	public static void ser(Object obj[]) throws Exception{
		File f= new File("/Users/wuyufan/Downloads" + File.separator + "test.txt");
		ObjectOutputStream  oos = null;
		OutputStream out = new FileOutputStream(f);
		oos = new ObjectOutputStream(out);
		oos.writeObject(new Person("zhang san ",30));	//保存对向
		oos.close();	//关闭
	}
	public static Object[] dser() throws Exception{
		File f= new File("/Users/wuyufan/Downloads" + File.separator + "test.txt");
		ObjectInputStream ois = null;
		InputStream input = new FileInputStream(f);
		ois = new ObjectInputStream(input);
		Object obj[] = (Object[])ois.readObject();
		ois.close();
		return obj;		
	}
}
