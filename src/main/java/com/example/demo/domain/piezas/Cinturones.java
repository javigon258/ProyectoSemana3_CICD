package com.example.demo.domain.piezas;

public class Cinturones {
	
	private Long id;
	private int numCinturones;
		
	public Cinturones(Long id, int numCinturones) {
		super();
		this.id = id;
		this.numCinturones = numCinturones;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNumCinturones() {
		return numCinturones;
	}
	public void setNumCinturones(int numCinturones) {
		this.numCinturones = numCinturones;
	}
	@Override
	public String toString() {
		return "Cinturones [id=" + id + ", numCinturones=" + numCinturones + "]";
	}
	
}
