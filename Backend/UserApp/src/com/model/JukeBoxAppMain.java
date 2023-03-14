package com.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class JukeBoxAppMain {

	ArrayList<JukeBox> al = new ArrayList<JukeBox>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JukeBoxAppMain().printSongs();

	}

	void printSongs() {
		getSongs();
		// Collections.sort(al, new ProjectSort());
		for (JukeBox us : al)
			System.out.println(us);
	}

	void getSongs() {
		File file = new File("jukebox.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = br.readLine()) != null) {
				addSongs(line);
			}

		} catch (Exception e) {

			// e.printStackTrace();
		}
	}

	void addSongs(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		JukeBox jb = new JukeBox(tokens[0], tokens[1], tokens[2], tokens[3]);
		al.add(jb);
	}

}
