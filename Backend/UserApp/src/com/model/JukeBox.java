package com.model;

public class JukeBox {
	private String songName;
	private String artist;
	private String language;
	private String ratings;

	@Override
	public String toString() {
		return "JukeBox [songName=" + songName + ", artist=" + artist + ", language=" + language + ", ratings="
				+ ratings + "]";
	}

	public JukeBox() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JukeBox(String songName, String artist, String language, String ratings) {
		super();
		this.songName = songName;
		this.artist = artist;
		this.language = language;
		this.ratings = ratings;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
}
