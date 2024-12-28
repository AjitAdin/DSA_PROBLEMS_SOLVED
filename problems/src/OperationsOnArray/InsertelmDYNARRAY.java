package OperationsOnArray;

import java.util.ArrayList;

//insert the element in DYNAMIC SIZED ARRAY 
public class InsertelmDYNARRAY {
  public static void main(String args[]) {
	  ArrayList<Integer> MyArrayList= new ArrayList<>();
	  MyArrayList.add(1);
	  MyArrayList.add(2);
	  MyArrayList.add(3);
	  MyArrayList.add(4);
	  MyArrayList.add(5);
	  System.out.println("Original List:"+MyArrayList);
	  MyArrayList.add(2,80);
	  
	  System.out.println("Updated List:"+MyArrayList);
	  MyArrayList.remove(4);
	  System.out.println("After Deleting List:"+MyArrayList);
	  
	  for(int i=0;i<MyArrayList.size();i++) {
		  System.out.println(MyArrayList.get(i));
	  }
	  
	  
	  
	  
  }
}
