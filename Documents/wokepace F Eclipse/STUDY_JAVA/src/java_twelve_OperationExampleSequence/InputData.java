package java_twelve_OperationExampleSequence;

import java.io.*;
import java.util.*;
import java.text.*;

public class InputData{
	private BufferedReader buf = null;
	public InputData(){	//只要输入数据就要使用此语句
		this.buf = new BufferedReader(new InputStreamReader(System.in));		//接受键盘输入
	}
	public String getString(String info){  //一、得到字符串信息
		String temp = null;
		System.out.print(info);		//打印提示信息
		try{
		temp = this.buf.readLine();	//接收数据
		}catch(IOException e){
			e.printStackTrace();
		}
		return temp;
	}
	public int getInt(String info,String err){	//二、得到一个整数的输入数据
//		当给出的不是一个整数信息，则通过String err给出一个错误的提示信息
		int temp = 0;
		String str = null;
		boolean flag = true;	//定义一个标记位
		while(flag){
			str  = this.getString(info);
			if(str.matches("^\\d+$")){	//判断是否由数字组成
				temp = Integer.parseInt(str);	//转型
				flag = false;
			}else{
				System.out.println(err);
			}
		}
		return temp; 
	}
	public float getFloat(String info,String err){
		float temp = 0;
		String str = null;
		boolean flag = true;
		while(flag){
			str = this.getString(info);
			if(str.matches("^\\d+.?\\d+$")){	//正则表达式，判断是否有数字组成，+号代表移位
				temp = Float.parseFloat(str);	//将一个字符串转换为浮点形数字
				flag = false;
			}else{
				System.out.println(err);
			}
		}
		return temp;
	}
	public Date getDate(String info,String err){	//得到日期的输入数据
		Date temp = null;
		String str = null;
		boolean flag = true;
		while(flag){
			str = this.getString(info);
			if(str.matches("^\\d{4}-\\d{2}-\\d{2}$")){	//年月日格式：年、四位，月、日、两位
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				try{
					temp = sdf.parse(str);	//将字符串变为Date型数据
				}catch(Exception e){}
				flag = false;
			}else{
				System.out.println(err);
			}
		}
		return temp;
	}
}
