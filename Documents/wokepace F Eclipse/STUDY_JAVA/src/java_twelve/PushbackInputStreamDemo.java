package java_twelve;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

public class PushbackInputStreamDemo {
	public static void main(String args[])throws Exception{
		String str = "hjhj";
		PushbackInputStream push = null;
		ByteArrayInputStream bai  = null;		//定义内存输入流，作用：将所有的字符串放在内存中
		bai = new ByteArrayInputStream(str.getBytes());	//实例化内存输入流
		push = new PushbackInputStream(bai);				//从内存中读取数据
		System.out.print("read these data from storage is: ");
		int temp = 0;
		while((temp=push.read())!=-1){		//读取内容
			if(temp=='.'){					//判断是否读取到了"."
				push.unread(temp);			//放回到缓冲区中
				temp=push.read();				//再读一次
				System.out.print("（退回"+(char)temp+"）") ;

			}else{
				System.out.print((char)temp) ;	// 输出内容.
			}
		}
	}
}
