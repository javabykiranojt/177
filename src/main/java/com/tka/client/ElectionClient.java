package com.tka.client;

import java.util.ArrayList;

import com.tka.controller.ElectionController;

public class ElectionClient {
	public static void main(String[] args) {

		ElectionController ec = new ElectionController();
		ArrayList<String> listStates = ec.fetchCandidatesFromAllStates();
		System.out.println("All List : ");
		System.out.println(listStates);  

		ArrayList<String> listStatesS = ec.fetchCandidatesStartswithS();
		System.out.println(listStatesS);
		System.out.println("\n List starts from 'S' : ");

		ArrayList<String> listStatesSandM = ec.fetchCandidatesStartswithS();
		System.out.println("\n List starts from 'S' and 'M' : ");
		System.out.println(listStatesSandM);

		ArrayList<String> listStatesSorted = ec.fetchCandidatesStartswithS();
		System.out.println("\n List sorted : ");
		System.out.println(listStatesSorted);

	}
}
