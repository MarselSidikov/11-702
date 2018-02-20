package ru.itis;

public class Main {

    public static void main(String[] args) {
	    List list = new LinkedList();
	    list.addToBegin(123); // 3
	    list.addToBegin(124); // 2
	    list.addToBegin(125); // 1
	    list.addToBegin(126); // 0
	    list.add("Привет!"); // 4
	    list.add(404); // 5

		int x = (int)list.get(4);
        System.out.println(x);
        int i = 0 ;
    }
}
