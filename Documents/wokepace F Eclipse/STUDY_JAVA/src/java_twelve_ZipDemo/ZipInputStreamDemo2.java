package java_twelve_ZipDemo;

import java.io.File ;
import java.io.OutputStream ;
import java.io.InputStream ;
import java.util.zip.ZipEntry ;
import java.util.zip.ZipFile ;
import java.util.zip.ZipInputStream ;
import java.io.FileInputStream ;
import java.io.FileOutputStream ;

public class ZipInputStreamDemo2 {
	public static void main(String args[]) throws Exception{	// 所有异常抛出
		File file  = new File("/Users/wuyufan/Downloads"  +  File.separator + "test.txt.zip	");
		File outFile = null;	//输出文件的时候要有文件夹的操作
		ZipFile zipFile =new ZipFile(file);
		ZipInputStream zipInput = null;		//定义压缩输入流
		OutputStream out = null;		//定义输出流，用于输出每一个实体内容
		InputStream input = null;		//定义输入路，用于输出每一个ZipEntry
		ZipEntry entry = null;			//每一个压缩实体
		zipInput = new ZipInputStream(new FileInputStream(file));
		while((entry = zipInput.getNextEntry())!=null){
			System.out.println("解压缩" + entry.getName() + "文件");
			outFile = new File("/Users/wuyufan/Downloads" + File.separator + entry.getName());
					//定义输出文件路径
			if(!outFile.getParentFile().exists()){	//如果输出文建家不村子啊
				outFile.getParentFile().mkdir();
			}
			if(!outFile.exists()){	//判断输出文件是否存在
				outFile.createNewFile();	//创建文件
			}
			input = zipFile.getInputStream(entry);	//得到每一个实体的输入流
			out = new FileOutputStream(outFile);
			int temp = 0;
			while((temp=input.read())!=-1){
				out.write(temp);
			}
			input.close();
			out.close();
		}
		input.close();
	}
}
