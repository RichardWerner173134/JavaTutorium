package main;

import java.util.ArrayList;
import java.util.List;

import gui.MyGUI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> blackList = new ArrayList<String>();
		blackList.add("Spinner");
		blackList.add("Idiot");
		blackList.add("Lappen");
		blackList.add("Penner");
		new MyGUI(blackList);

	}

}