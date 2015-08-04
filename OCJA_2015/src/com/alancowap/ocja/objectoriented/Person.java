/** 
 *  Simple class representing a Person.
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.objectoriented;


public class Person {

	private String name;

	public Person(String name){
		this.name = name;
	}
	
	public void makeNoise(){
		System.out.println(this.name + " says Yay!");
	}
	
	public String toString(){
		return this.name;
	}
	
}
