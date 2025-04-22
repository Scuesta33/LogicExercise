package com.ejercicios.logica.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class javaList {
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	  int InitialSize = scanner.nextInt();
	  
	  List<Integer> list = new ArrayList<>();
	  for (int i = 0; i < InitialSize; i++) {
		  list.add(scanner.nextInt());
	  }
	  int numberOfQueries = scanner.nextInt();
	  scanner.nextLine();
	  
	  for (int i = 0; i < numberOfQueries; i++) {
		  String action = scanner.nextLine();
		  
		  if (action.equals("Insert")) {
			  String[] parts = scanner.nextLine().split(" ");
			  int index = Integer.parseInt(parts[0]);
			  int value = Integer.parseInt(parts[1]);
			  list.add(index, value);
			  
		  } else if (action.equals("Delete")) {
			  int index = Integer.parseInt(scanner.nextLine());
			  list.remove(index);
		  }
	  }
	  for (int num : list) {
		  System.out.print(num + " ");
	  }
	  
 }
 
}
