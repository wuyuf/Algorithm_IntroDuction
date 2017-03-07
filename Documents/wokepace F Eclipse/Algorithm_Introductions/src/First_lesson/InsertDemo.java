package  First_lesson;

import java.util.Scanner;
public class InsertDemo{
	public static void main(String args[]){
		int a [];

		Scanner sc = new Scanner(System.in);	//得到从键盘输入的数字
		int n = sc.nextInt();
		a = new int[n];		//动态分配数组空间
		for(int i=0;i<n;i++){		//输出从键盘输入的数字
			a[i] = sc.nextInt();
		}
		a = InsertSort(a);			//调用InserSort方法
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" "); 
		}
	}
	
	public static int[] InsertSort(int a[]){
		int i,j;
		int n = a.length;
		int key;
		// 假定第一个元素被放到了正确的位置上
		// 这样，仅需遍历1 - n-1
		
		for(i=1;i<n;i++){
			j=i;
			key = a[i];
			
			while(j>0 && key < a[j-1]){		
	//若在此处需要倒序输出的话，只需要将key < a[j-1]换成key > a[j-1]即可
				a[j] = a[j-1];
				j--;
			}
			a[j]=key;
		}
		return a;
	}
}