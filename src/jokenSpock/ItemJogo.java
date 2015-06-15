package jokenSpock;

import java.util.ArrayList;

public class ItemJogo {
	private String name;
	private ArrayList<String> ganha=new ArrayList<String>();
	
	
	
	public ItemJogo(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void addGanha(String ganha) {
		this.ganha.add(ganha);
	}
	
	public boolean vence(String adversario){
		return this.ganha.contains(adversario);
	}
	
}
