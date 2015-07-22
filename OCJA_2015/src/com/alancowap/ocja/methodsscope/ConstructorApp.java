/** 
 *  Demo constructor calls
 *  Demo static variable
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
package com.alancowap.ocja.methodsscope;

import com.alancowap.ocja.operatorsstrings.NumericPromotion;

public class ConstructorApp {


	public static void main(String[] args) {
		System.out.println("Hello World");

//		ParentClass pc = new ParentClass();
		ChildClass sissy = new ChildClass(" Sissy");
		System.out.println("Number of children is " + ChildClass.numChildren);
		ChildClass sean = new ChildClass(" Sean");
		System.out.println("Number of children is " + ChildClass.numChildren);
		ChildClass sarah = new ChildClass(" Sarah");
		System.out.println("Number of children is " + ChildClass.numChildren);
		
//		int numPeople = sissy.getNumChildren();
	}

}
