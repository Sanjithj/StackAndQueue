package com.bridgelabz;
import java.util.LinkedList;

public class Stack {
	
	    LinkedList<Integer> LinkedList = new LinkedList<>();

	    public void insert(int data) {
	        LinkedList.addFirst(data);
	    }

	    public void peek() {
	        System.out.println("Peek Element: "+LinkedList.peek());
	    }

	    public void delete() {
	        if(LinkedList.size() != 0) {
	            LinkedList.pop();
	        }else {
	            System.out.println("Stack Is Empty");
	            return;
	        }
	    }

	    public void display() {
	        for (Integer integer : LinkedList) {
	            System.out.println(" "+integer);
	        }
	    }
	}
