package fr.mds.mydigitalpizza.classes;

import java.util.ArrayList;
import java.util.List;

import fr.mds.mydigitalpizza.interfaces.Item;

public class Meal {
	private Item item;
	private List<Item> listItem = new ArrayList<>();


	public void addItem(Item item) {
		listItem.add(item);
	}
	
	public float getCost() {
		float cost = 0;
		for(Item item: this.listItem){
			cost = cost + item.price();
	    }
		return cost;
	}
	
	public void showItems() {
		for(Item item: this.listItem){
	       	 System.out.println (item);
	       }
	}
}
