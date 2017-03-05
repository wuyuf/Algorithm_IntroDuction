package java_twelve_serialize;

import java.io.Serializable;


public class Person implements Serializable {
	private String name;
	private int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "name" + this.name + "age" + this.age;
	}
}
