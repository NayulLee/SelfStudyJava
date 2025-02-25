package chapter04.exam03;

public class Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	
	Song(){}
	
	Song(String t, String a, int y, String c){
		this.title = t;
		this.artist = a;
		this.year = y;
		this.country = c;
	}
	
	public void show() {
		System.out.println(year + "년 " + country +"국적의 " + artist +
				"가 부른 " + title);
	}
}
