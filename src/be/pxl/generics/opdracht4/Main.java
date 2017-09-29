package be.pxl.generics.opdracht4;

import java.util.ArrayList;

public class Main {
	private static ArrayList<Integer> integers;
	private static ArrayList<Object> list;
	

	public static void main(String[] args) {
		maakIntegerLijst(12);
		printIntegerLijst();
		maakLijst("Cunt");
		printLijst();
		maakLijst(12);
		printLijst();
		maakLijst(0.5);
		printLijst();
	}
	
	private static void maakIntegerLijst(int integer){
		integers = new ArrayList<>(10);
		for(int i = 0; i<10; i++){
			integers.add(integer);
		}
	}
	
	private static void printIntegerLijst() {
		for(int i: integers){
			System.out.println(i);
		}
	}
	
	private static <E> void maakLijst(E content){
		list = new ArrayList<>();
		for(int i = 0; i < 10; i++){
			list.add(content);
		}
	}
	
	private static void printLijst() {
		for(Object o: list){
			System.out.println(o);
		}
	}

}
