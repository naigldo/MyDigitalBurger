package fr.mds.mydigitalpizza.interfaces;

public interface Item {
	public void setName(String name);
	public void setPacking(Packing packing);
	public void setPrice(float price);
	
	public String name();
	public Packing packing();
	public float price();
}
