package com.tka.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.client.A;
import com.tka.service.ElectionService;

@RestController
public class ElectionController {

	@Autowired
	ElectionService es;

	@Autowired
	A aa;

	@GetMapping("fetchCandidatesFromAllStates")
	public ArrayList<String> fetchCandidatesFromAllStates() {
		System.out.println("I am in controller");
		// ElectionService es = new ElectionService();
		ArrayList<String> al = es.fetchCandidatesFromAllStates();
		return al;

	}

	

	public ArrayList<String> fetchCandidatesStartswithS() {
		ElectionService es = new ElectionService();
		ArrayList<String> al = es.fetchCandidatesStartswithS();
		return al;

	}

	public ArrayList<String> fetchCandidatesStartswithSandM() {
		ElectionService es = new ElectionService();
		ArrayList<String> al = es.fetchCandidatesStartswithSandM();
		return al;

	}

	public ArrayList<String> fetchCandidatesSorted() {
		ElectionService es = new ElectionService();
		ArrayList<String> al = es.fetchCandidatesSorted();
		return al;

	}

}
