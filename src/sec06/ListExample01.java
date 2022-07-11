package sec06;

import java.util.ArrayList;

public final class ListExample01 {

	public static void main(String[] args) {
	  ArrayList<String>fruits=new ArrayList<String>();
	  fruits.add("りんご");
	  fruits.add("みかん");
	  fruits.add(1,"ぶどう");
	  System.out.println(fruits);
	  fruits.remove("りんご");
	  System.out.println(fruits);
	  fruits.remove(0);
	  System.out.println(fruits);
	  String fruit = fruits.get(0);
	  System.out.println("fruit="+fruit);
	  System.out.println(fruits);
	  fruits.set(0, "メロン");
	  System.out.println(fruits);
	  
	  ArrayList<Integer>integers=new ArrayList<Integer>();
	  integers.add(123);
	  integers.add(1000);
	  System.out.println("Integers="+integers);
	  
	  ArrayList<Double>doubles=new ArrayList<Double>();
	  doubles.add(1.23);
	  doubles.add(0.0001);
	  System.out.println("Integers="+doubles);}}


