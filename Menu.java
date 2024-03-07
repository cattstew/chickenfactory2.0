package chickenfactory;
import java.util.*;
public class Menu {
	
	//*NOTE: NO SETTER METHOD
	//INSTANCE VARIABLES OF ARRAYLISTS OF DIFFERENT MENU
	private ArrayList<Food> regularMenu = new ArrayList<Food>();
	private ArrayList<Food> limitedMenu = new ArrayList<Food>();
	private ArrayList<Food> specialMenu = new ArrayList<Food>();
	
	//ADDS THE FOOD OBJECTS TO THE DIFFERENT MENU ACCORDING TO THE PRICE OF THE ITEM
	public void add(Food items) {
		if(items.getPrice()<100) {
			regularMenu.add(items);
		}else if (items.getPrice()>100 && items.getPrice()<1000) {
			limitedMenu.add(items);
		}else if (items.getPrice()>1000) {
			specialMenu.add(items);
		}
		
	}
	//Gives me the price of the item the user chose
	public double itemPriceRegular(int index1) {
		return regularMenu.get(index1).getPrice();
	}
	public double itemPriceLimited(int index2) {
		return limitedMenu.get(index2).getPrice();
	}
	public double itemPriceSpecial(int index3) {
		return specialMenu.get(index3).getPrice();
	}
	
	//GETTER METHOD
	//--> prints out the menu so the customer is able to order from it
	public void getRegular() {
		System.out.println(regularMenu);
	}

	public void getLimited() {
		System.out.println(limitedMenu);
		
	}
	public void getSpecial() {
		System.out.println(specialMenu);
	}
	//--> Get's the size of the menu. Helps solve index out of bound issues
	public int getRegularMenuSize() {
		return regularMenu.size();
	}
	public int getLimitedMenuSize() {
		return limitedMenu.size();
	}
	public int getSpecialMenuSize() {
		return specialMenu.size();
	}
}
	
