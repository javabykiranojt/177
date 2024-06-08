package com.tka.service;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.client.A;
import com.tka.dao.ElectionDao;

@Service
public class ElectionService {

	@Autowired
	ElectionDao ed;
	@Autowired
	A aa;

	public ArrayList<String> fetchCandidatesFromAllStates() {
		System.out.println("I am in service 111");
		// ElectionDao ed = new ElectionDao();
		ArrayList<String> al = ed.fetchCandidatesFromAllStates();
		System.out.println("I am in service 222");
		return al;

	}

	public ArrayList<String> fetchCandidatesStartswithS() {
		ElectionDao ed = new ElectionDao();
		ArrayList<String> al = ed.fetchCandidatesFromAllStates();

		ArrayList<String> alsCandidateNames = new ArrayList<>();
		for (String sCandidateNames : al) {
			if (sCandidateNames.startsWith("S")) {
				alsCandidateNames.add(sCandidateNames);
			}
		}
		return alsCandidateNames;
	}

	public ArrayList<String> fetchCandidatesStartswithSandM() {
		ElectionDao ed = new ElectionDao();
		ArrayList<String> al = ed.fetchCandidatesFromAllStates();

		ArrayList<String> alsCandidateNames = new ArrayList<>();
		for (String sCandidateNames : al) {
			if (sCandidateNames.startsWith("S") || sCandidateNames.startsWith("M")) {
				alsCandidateNames.add(sCandidateNames);
			}
		}
		return alsCandidateNames;
	}

	public ArrayList<String> fetchCandidatesSorted() {
		ElectionDao ed = new ElectionDao();
		ArrayList<String> al = ed.fetchCandidatesFromAllStates();

		ArrayList<String> alsCandidateNames = new ArrayList<>();
		Collections.sort(alsCandidateNames);
		/*
		 * for (String sCandidateNames : al) { if (sCandidateNames.startsWith("S") ||
		 * sCandidateNames.startsWith("M")) { alsCandidateNames.add(sCandidateNames); }
		 * }
		 */
		return alsCandidateNames;
	}
}
