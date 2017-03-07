package java_twelve_OperationExampleSequence;


import java.io.Serializable;
import java.io.*;


public class Person implements Serializable{
	private String  name;
	private int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "姓名" + this.name + "年龄" + this.age;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
