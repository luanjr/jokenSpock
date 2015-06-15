package jokenSpock;

import java.util.ArrayList;

public class Jogo {
	private ArrayList<ItemJogo> itens=new ArrayList<ItemJogo>();
	
	
	public Jogo() {
		ItemJogo item=new ItemJogo("Tesoura");
		item.addGanha("Papel");
		item.addGanha("Lagarto");
		itens.add(item);
		item=new ItemJogo("Pedra");
		item.addGanha("Tesoura");
		item.addGanha("Lagarto");
		itens.add(item);
		item=new ItemJogo("Papel");
		item.addGanha("Pedra");
		item.addGanha("Spock");
		itens.add(item);
		item=new ItemJogo("Spock");
		item.addGanha("Tesoura");
		item.addGanha("Pedra");
		itens.add(item);
		item=new ItemJogo("Lagarto");
		item.addGanha("Papel");
		item.addGanha("Spock");
		itens.add(item);
	}

	public ItemJogo getItem(String item){
		for(ItemJogo i :itens){
			if(i.getName().equalsIgnoreCase(item)){
				return i;
			}
		}
		return null;
	}

	public String winnerName(ItemJogo itemJogo1,ItemJogo itemJogo2){
		if(itemJogo1==null || itemJogo2==null){
			return "Erro";
		}else if(itemJogo1.equals(itemJogo2)){
			return "Empate";
		}else{
		return itemJogo1.vence(itemJogo2.getName()) ? itemJogo1.getName() : itemJogo2.getName();
		}
		}
	
}
