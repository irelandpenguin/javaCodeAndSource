package com.yida_06.GenericInter;

public class Movie {
	private String name;
	private String time;

	public Movie(String name, String time) {
		super();
		this.name = name;
		this.time = time;
	}



	@Override
	public String toString() {
		return "Movie [name=" + name + ", time=" + time + "]";
	}

}
