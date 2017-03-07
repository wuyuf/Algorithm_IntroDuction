package java_twelve_OperationExampleSequence;


public class Menu {
	public Menu(){
		while(true){
			this.show();		//无限制调用菜单的显示
		}
	}
	public void show(){
		System.out.println("===== Xxx系统 =====") ;
		System.out.println("    [1]、增加数据") ;
		System.out.println("    [2]、删除数据") ;
		System.out.println("    [3]、修改数据") ;
		System.out.println("    [4]、查看数据") ;
		System.out.println("    [0]、系统退出\n") ;
		InputData input = new InputData();
		int i = input.getInt("please select", "please input correct options");
		switch(i){
		case 1:{
				Operate.add();
				break;
		}case 2:{
			Operate.delete() ;	// 调用删除操作
			break ;
		}
		case 3:{
			Operate.update() ;	// 调用更新操作
			break ;
		}
		case 4:{
			Operate.find() ;		// 调用查看操作
			break ;
		}
		case 0:{
			System.exit(1) ;		// 系统退出
			break ;
		}
		default:{				//若输入5.6.7.8.等
			System.out.println("请选择正确的操作！") ;
			}
		}
	}
}
