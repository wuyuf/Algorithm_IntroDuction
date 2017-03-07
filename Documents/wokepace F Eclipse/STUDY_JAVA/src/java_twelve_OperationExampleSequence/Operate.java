package java_twelve_OperationExampleSequence;

import java_twelve_OperationExample.InputData;

public class Operate {
	public static void add(){			//实例化输入数据对象
		InputData input = new InputData();
		FileOperate fo = new FileOperate("/Users/wuyufan/Downloads//test.txt" );
		String name = input.getString("please input name");
		int age = input.getInt("please input age","age must be figure");
		Person per = new Person(name,age);
		try{
			fo.save(per);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("** 选择的是增加success!!") ;
	}
	public static void delete(){	// 删除操作
		System.out.println("** 选择的是删除操作") ;
	}
	public static void update(){	// 更新操作
		System.out.println("** 选择的是更新操作") ;
	}
	public static void find(){	// 查看操作
		System.out.println("** 选择的是查看操作") ;
	}
}
