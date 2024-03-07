package chickenfactory;
import java.util.*;
public class Home {
/*Hello mr.espi! We are an evil factory owned by kat the evil boss. Could you help us find the reason why we are unable to escape from the company TT. 
  hint: something with the price of the items
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Implementing the objects
		Menu menu = new Menu();
		Food food = new Food();
		//Adding in the different items into the menu
		menu.add(new Food("Spicy Full Chicken",70.99));
		menu.add(new Food("8pcs Spicy Chicken Wings", 80.99));
		menu.add(new Food("4pcs Spicy Chicken Drumsticks",50.99));
		menu.add(new Food("4pcs Spicy Chicken Tenders", 60.99));
		menu.add(new Food("Salty Full Chicken", 150.99));
		menu.add(new Food("8pcs Salty Chicken Wings", 100.99));
		menu.add(new Food("4pcs Salty Chicken Drumsticks",70.99));
		menu.add(new Food("4pcs Salty Chicken Tenders", 90.99));
		menu.add(new Food("Marinated Full Chicken", 250.99));
		menu.add(new Food("8pcs Marinated Chicken Wings", 190.99));
		menu.add(new Food("4pcs Marinated Chicken Drumsticks",150.99));
		menu.add(new Food("4pcs Marinated Chicken Tenders", 150.99));
		menu.add(new Food("Sturdy Antartic Chicken", 1500.99));
		menu.add(new Food("Live Chicken",7500.99));
		menu.add(new Food("Cooked Chicken", 8500.99));
		//==================================================================================>
		//The variables that will be used in the program
		int deposit;
		String userName;
		double cartTotal = 0;
		//Company Introduction
		
		System.out.println("Welcome to our Chicken Factory!");
		System.out.println("We provide you with the highest quality of chicken, with the "
				+ "right tenderness and the right flavor. Perfect for any holiday occasion. "
				+ "The chicken is cured in natural ingredients with zero preservatives inside. "
				+ "Each chicken is closely inspected before it is ready by your doorstep. ");
		
		//Starting the game introduction
		
		System.out.println("");
		System.out.println("JOIN US ON OUR JOURNEY NOW!");
		System.out.println("Type \"join\" to get started on your journey");
		String join = scanner.nextLine();
		

		//This starts running when the the user agrees to join. 
		if(join.toLowerCase().equals("join")) {
	
			/*Steps before user can access menu and begin buying items. This includes knowing the user's name and the amount of money it will
			  deposit. The amount they deposit is very important here, as it would be used a way to hold hostage of the customer. If their purchase
			  amount exceeds their initial deposit, they will be forced to work at the company to pay off their debt. 
			*/
			
			System.out.println("");
			System.out.println("Glad you've decided to join us.");
			System.out.println("Please, tell us what your name is");
			userName = scanner.nextLine();
			System.out.println("");
			System.out.println("Hello " + userName);
			System.out.println("Please deposit an amount of money");
			deposit = scanner.nextInt();
			//Introduction completed
			
			//Shopping begins
			scanner.nextLine();
			System.out.println("Let's Get Shopping!");
			System.out.println("Press [1] for Menu");
			int menuOpen = scanner.nextInt();
			
			//Menu is opened up for the user to gain access to
			if(menuOpen==1) {
				
//================>This is for REGULAR CUSTOMERS. Includes instructions on how to order.
				if(deposit<150) {
					System.out.println("We don't talk to broke people (◔_◔)");
	
				}else if(deposit>150 && deposit<1000) {
					System.out.println("Welcome our dearest lovely customer. Here's our menu catered"
							+ "just for you :)");
					menu.getRegular();
					System.out.println("");
					
					scanner.nextLine();
					System.out.println("Order now? Type in \"Yes\" or \"No\"");
					String userRegular = scanner.nextLine();
					
					if(userRegular.toLowerCase().equals("yes")) {
						System.out.println("The menu is ordered with numbers from 1 to 9. By typing in numbers, you can order the item you like.");
						int selectitem1 = scanner.nextInt();
						cartTotal+=menu.itemPriceRegular(selectitem1-1)*20;
						System.out.println("Item added!");
						System.out.println("Would you like to continue shopping?");
						System.out.println("[1] Yes");
						System.out.println("[2] No");
						boolean repeat1 = true;
						if(scanner.nextInt()==1) {
							//While loop helps repeat the questions of asking the user whether or not they would like to continue shopping
							while(repeat1) {
								menu.getRegular();
								System.out.println("Item of choice?");
								System.out.println("");
								int item =scanner.nextInt();
								cartTotal+=menu.itemPriceRegular(selectitem1-1)*20;
								System.out.println("Item added!");
								System.out.println("Would you like to continue shopping?");
								
								System.out.println("[1] Yes");
								System.out.println("[2] No");
								
								scanner.nextLine();
								int continueShop1 = scanner.nextInt(); //whether or not the customer chose to continue to shop 
								/*when the user chooses the number 1, the menu would appear again, allowing them to continue shopping
							 	When 2 is selected, the program would stop and shows the total. by then, we will know whether or not the customer gets to leave
							 
								 */
								if(continueShop1==1) {
									menu.getRegular();
									System.out.println("Item of choice?");
									System.out.println("");
									int itemChoice = scanner.nextInt();
									if(itemChoice<menu.getRegularMenuSize()) {
										cartTotal+=menu.itemPriceRegular((itemChoice-1))*20;
										System.out.println("Item added!");
									}else {
										System.out.println("Sorry, invalid input. Try Again");
									}
									
								}else if(continueShop1==2){
									System.out.println(cartTotal);
									if(cartTotal<deposit){
										System.out.println("Look who is not escaping the factory today?");
										System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⡿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⡿⠛⠛⢟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⠟⠋⠛⢿⣿⣿⣿⣿\n"
												+ "⣿⣿⣯⣿⡏⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⡇⠀⠀⠀⠈⡷⣿⣿⣿\n"
												+ "⣿⣿⣿⣟⣧⣀⣀⣠⣬⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡷⡠⣀⠀⣠⣟⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣽⣫⣵⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣮⣿⣿⣾⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣷⢫⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢿⢯⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⡰⠋⠃⣹⢻⠟⢿⣿⠿⢿⣿⡿⢿⣿⡿⢿⡿⡏⠹⡏⢧⣸⣦⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣾⣾⣇⢸⢀⡏⢹⠀⣸⠹⡆⢸⠙⣇⢸⡇⢱⣼⣇⣸⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣼⣷⣧⣀⣿⣯⣀⣾⣾⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿\n"
												+ "⠀⠀⠀⠀⠀⠀⠠⠦⠶⠤⠠⠤⠴⠠⠤⠄⠀⠢⠶⠶⠦⠦⠒⠰⠀⠀⠀⠀⠀⠀");
									
								}else {
									System.out.println("You are free to go. But don't you worry, we will get you next time >:(");
								}
									break;	
								}
							}
						}
					//------Customer refuses to shop and comply. Let's see if we can get them trapped in our factory forever
						if(scanner.nextInt()==2) {
							System.out.println("Stop shopping? WHY? TODAY IS YOUR DOOMSDAY! MUAHAHAHAHAHAHHAHAHAHHAHAHAHA");
							System.out.println("You have died. You have failed the workers at the factory");
						
					}else if (userRegular.toLowerCase().equals("no")) {
						System.out.println("What?! You wanna order later? How rude. Get out of our factory right now!");
					}
						
				}
					
					
					
					
//================>This is for LIMITED CUSTOMERS. Includes instructions on how to order.
				}else if(deposit>1500 && deposit < 9999){
					System.out.println("OMG OUR DEAREST MOST LOVELY LOVING CARING WONDERFUL CUSTOMER! PLEASE"
							+ "HAVE A SEAT HERE! WE ARE SO PLEASED BY YOUR VISIT! PLEASE LOOK AT OUR VERY VERY NICE MENU!");
					menu.getLimited(); //shows menu
					System.out.println("");
					
					scanner.nextLine(); //formatting purposes 
					System.out.println("Order now? Type in \"Yes\" or \"No\"");
					String userLimited = scanner.nextLine();
					
					//time to order!
					if((userLimited.toLowerCase().equals("yes"))) { //=====> If the user answered yes to order now
						System.out.println("The menu is ordered with numbers from 1 to 9. By typing in numbers, you can order the item you like.");
						int selectitem = scanner.nextInt();
						cartTotal+=menu.itemPriceLimited(selectitem-1)*20;
						System.out.println("Item added!");
						System.out.println("Would you like to continue shopping?");
						System.out.println("[1] Yes");
						System.out.println("[2] No");
						boolean repeat2 = true;
		
						//-----User is continuing to shop
						if(scanner.nextInt()==1) {
							//While loop helps repeat the questions of asking the user whether or not they would like to continue shopping
							while (repeat2){
								menu.getLimited();
								System.out.println("Item of choice?");
								System.out.println("");
								int item =scanner.nextInt();
								cartTotal+=menu.itemPriceLimited(selectitem-1)*20;
								System.out.println("Item added!");
								System.out.println("Would you like to continue shopping?");
								
								System.out.println("[1] Yes");
								System.out.println("[2] No");
								scanner.nextLine();
								int continueShop2 = scanner.nextInt(); //whether or not the customer chose to continue to shop 
								/*when the user chooses the number 1, the menu would appear again, allowing them to continue shopping
							 	When 2 is selected, the program would stop and shows the total. by then, we will know whether or not the customer gets to leave
							 
								 */
								if(continueShop2==1) {
									menu.getLimited();
									System.out.println("Item of choice?");
									System.out.println("");
									int itemChoice = scanner.nextInt();
									if(itemChoice<menu.getLimitedMenuSize()) {
										cartTotal+=menu.itemPriceLimited((itemChoice-1))*20;
										System.out.println("Item added!");
									}else {
										System.out.println("Sorry, invalid input. Try Again");
									}
									
								}else if(continueShop2==2){
									System.out.println(cartTotal);
									if(cartTotal<deposit){
										System.out.println("Look who is not escaping the factory today?");
										System.out.println("⣿⠛⠉⠉⠁⠀⠛⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⡇⠰⢶⣟⣃⠀⠠⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣅⡀⢾⣿⣽⣶⠒⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠟⠋⠉⠉⠉⠉⠉⠛⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⠃⠀⢈⠻⡿⠄⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣦⣝⣿⣦⣤⡉⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡯⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⠛⠀⠈⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡋⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣯⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⢀⡠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⠂⠀⠀⢀⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⠀⣀⣰⡗⢀⣠⣤⣶⣶⣶⣶⣶⣦⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠉⠿⣿⣿⣿⣿⠋⢤⣾⣶⠝⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⡛⠿⣿⣿⢿⡀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣷⣌⣉⡉⣠⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⢀⣤⣶⣶⣤⣀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢹⢫⠛⣧⠈⠻⡄⠀⣀⠀⠀⠀⠀⠀⠉⠻⢿⣻⠿⢿⣿⠿⣿⠿⠻⠃⠀⠀⣀⠀⠀⠀⠀⠀⢦⣾⣿⡿⠛⣻⣙⣿⡇⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢧⡞⠀⠛⣧⠀⢻⠟⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⣠⣼⠗⠦⣤⠀⡾⣿⣿⣇⡘⠿⠟⣸⣇⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠘⠁⣶⡿⣿⡖⣯⠀⡁⢿⣷⣤⣤⣽⡶⠦⠖⠒⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⡟⡠⢀⣿⡇⠃⠹⢻⣿⣿⣷⣾⣿⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⢦⡻⣤⣈⣆⢻⠀⢹⠸⠿⣿⣿⣦⣤⣠⡄⠀⠀⠀⠀⠀⠀⠀⠀⠈⢉⡻⠁⠀⠈⣼⡿⠃⠀⠀⠀⠁⠉⠉⠉⠁⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⡙⠷⠍⣹⣿⡄⠀⠀⢸⡈⢻⣿⣿⣿⣿⣶⣶⣶⣦⣤⣄⣀⣀⡀⠀⠙⠆⠒⠀⠹⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣄⣠⣿⡇⠀⠀⠀⠃⠀⢿⣿⣿⣿⣿⣿⣿⢿⣿⣿⢿⣿⣿⣿⣶⣶⣤⣄⣀⣀⣀⠀⠀⠀⠀⠀⢹⣦⣼⣥⠜⠛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣇⠀⠀⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⣴⣯⣼⢸⣃⣿⡿⢹⣿⣿⢿⣿⣿⣿⣿⣶⣶⣠⣤⣾⣿⣟⠁⡄⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⢻⡄⠀⢀⠀⠀⠀⠈⢿⣿⣿⣿⣻⢿⣿⣿⣿⣿⣿⣷⣾⣿⣧⣾⣿⡞⠙⣻⣿⣿⣿⡿⢻⢟⠏⢀⢃⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠘⣷⡀⠈⠄⢡⠀⠀⠀⠈⠻⣿⣿⣤⡿⢹⢏⣿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⢀⡼⠋⢀⡼⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⡀⢹⣷⡄⠀⡈⣆⠀⠀⠀⠀⠽⣿⣿⣿⣿⣾⣁⠋⣿⡏⡿⠿⢿⣙⣼⣿⣿⠏⠁⢀⣾⡁⣉⣽⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡗⠸⣄⢿⣷⡄⢱⢤⡀⠀⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⣿⣶⣷⣶⣿⣿⣿⡿⠃⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⢸⡜⠾⣿⣿⣾⡆⢧⠀⠀⠀⠀⠐⢤⡀⢻⡿⢿⣿⣿⣿⣿⣿⣿⠿⠋⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⣿⠓⠀⠘⡇⠀⢻⣿⣿⣿⡜⣧⠀⠀⠀⠀⠀⠉⠀⠡⢤⣬⣉⣉⡿⠋⠁⠀⡀⣀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⠿⠿⠿⠿⠿⠿⠛⠛⠛⠉⠉⠀⢀⣼⠃⠀⠀⠀⢻⠀⢸⣿⣿⣿⣿⣿⣶⡄⠀⠀⠀⠀⠀⠀⠀⠓⠉⠉⠀⠀⠀⠎⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠋⡏⠀⠀⠀⠸⡏⠀⠨⡿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠃⠀⠃⠀⢰⣧⠀⠀⠀⢹⣿⣿⣿⣿⣿⣷⣆⣀⠀⠀⠀⠀⠀⠀⠀⢀⣴⢟⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⡆⠘⣦⠀⠀⠀⠈⠛⠿⣿⣿⣿⣿⣿⣿⣷⣶⣶⣦⣤⣤⣴⣿⢁⠎⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢠⠀⠀⠀⠀⡀⠀⠉⢻⢿⣿⣿⣿⣿⣿⣿⣟⣿⡿⠋⠂⢰⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠘⣦⣀⣘⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⢀⡞⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠰⠀⠀⠄⠀⠀⠤⢀⠨⢿⣿⣿⣿⣿⣿⣿⣿⣿⡗⠀⠀⠀⡾⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n"
												+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣤⠹⣿⣮⣿⣿⣿⣿⣿⣿⢫⡄⣀⠀⠀⠐⠁⠀⠀⠀⠀⠀⠀⠀⠈⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
									
								}else {
									System.out.println("You are free to go. But don't you worry, we will get you next time >:(");
								}
									break;	
								}			
										
							}
															
						}
		//------Customer refuses to shop and comply. Let's see if we can get them trapped in our factory forever
						if(scanner.nextInt()==2) {
							System.out.println("Stop shopping? WHY? TODAY IS YOUR DOOMSDAY! MUAHAHAHAHAHAHHAHAHAHHAHAHAHA");
							System.out.println("You have died. You have failed the workers at the factory");
						}
								
					//What happens when the customer decided not to order now
					}else if (userLimited.toLowerCase().equals("no")) {
						System.out.println("What?! You wanna order later? How rude. Get out of our factory right now!");
					}
						
				}
					
//================>This is for SPECIAL CUSTOMERS. Includes instructions on how to order.
			else if(deposit>9999) {
				
				System.out.println("Oh dear. No words could ever describe how happy we are to see you here. I'm crying on the spot"
						+ "because of your visit. This is a once in a lifetime type of thing. I don't know. My heart goes to you "
						+ "our wonderful customer. My whole family could not be more thankful for your investment in us. I am beyond"
						+ "asdjiaosjdio. Please allow me to introduce you to our mega special limited beautiful absolutely gorgeous menu"
						+ "Inside this menu, you would see, hundreds, and hundreds, and hundreds, dollars worth of food. Enjoy :)");
				menu.getSpecial(); //shows menu
				System.out.println("");
				
				scanner.nextLine(); //formatting purposes 
				System.out.println("Order now? Type in \"Yes\" or \"No\"");
				String userSpecial = scanner.nextLine();
				
				//time to order!
				if((userSpecial.toLowerCase().equals("yes"))) { //=====> If the user answered yes to order now
					System.out.println("The menu is ordered with numbers from 1 to 9. By typing in numbers, you can order the item you like.");
					int selectitem3 = scanner.nextInt();
					cartTotal+=menu.itemPriceSpecial(selectitem3-1)*20;
					System.out.println("Item added!");
					System.out.println("Would you like to continue shopping?");
					System.out.println("[1] Yes");
					System.out.println("[2] No");
					boolean repeat3 = true;
	
					//-----User is continuing to shop
					if(scanner.nextInt()==1) {
						//While loop helps repeat the questions of asking the user whether or not they would like to continue shopping
						while (repeat3){
							menu.getSpecial();
							System.out.println("Item of choice?");
							System.out.println("");
							int item =scanner.nextInt();
							cartTotal+=menu.itemPriceSpecial(selectitem3-1)*20;
							System.out.println("Item added!");
							System.out.println("Would you like to continue shopping?");
							
							System.out.println("[1] Yes");
							System.out.println("[2] No");
							scanner.nextLine();
							int continueShop3 = scanner.nextInt(); //whether or not the customer chose to continue to shop 
							/*when the user chooses the number 1, the menu would appear again, allowing them to continue shopping
							 	When 2 is selected, the program would stop and shows the total. by then, we will know whether or not the customer gets to leave
							 
							 */
							if(continueShop3==1) {
								menu.getSpecial();
								System.out.println("Item of choice?");
								System.out.println("");
								int itemChoice3 = scanner.nextInt();
								if(itemChoice3<menu.getSpecialMenuSize()) {
									cartTotal+=menu.itemPriceSpecial((itemChoice3-1))*20;
									System.out.println("Item added!");
								}else {
									System.out.println("Sorry, invalid input. Try Again");
								}
								
							}else if(continueShop3==2){
								System.out.println(cartTotal);
								if(cartTotal>deposit){
									System.out.println("Look who is not escaping the factory today?");
									System.out.println("⢀⣾⣿⣿⣾⣿⣿⡿⣱⣿⣿⣿⡿⠁⢸⡟⢸⣿⣵⣿⣿⡿⣿⢻⡿⠀⠀⠀⠀⠀⠀⢀⡀⠈⢹⣾⣯⣿⣿⡙⣿⣿⣿⣇⡀⠀⠀⠀⠀⠀\n"
											+ "⠀⠀⠀⠀⢀⣿⣿⣿⣇⣿⣿⡿⣸⣿⣿⣿⣿⡁⢰⣿⢠⣿⣱⣿⣿⡟⣱⡟⣿⠆⠀⠀⠀⠀⠀⠀⠈⢱⠀⠆⢻⣾⣿⣿⣧⢻⣿⣿⣧⠱⠀⠀⠀⠀⠀\n"
											+ "⠀⠀⠀⠀⣾⣼⣿⣿⣼⣿⡿⣹⣿⣿⣿⣿⡗⠛⢦⣷⣿⢻⣿⣿⡿⣱⠟⢠⣿⠀⠀⠀⠀⠀⠀⠁⡅⢸⢇⠀⠙⣿⣿⣿⣿⣮⣿⣿⣿⣧⢣⠀⠀⠀⠀\n"
											+ "⠀⠀⠀⢰⢧⣿⣿⡯⣿⣿⣣⣯⡿⣿⣿⣿⡝⣀⢸⣿⢻⣿⣿⣿⢱⡛⣠⣼⡇⠀⠀⠀⠀⠀⠀⠀⠡⠘⢈⣦⡇⢹⣿⣿⢿⣏⣿⣿⣿⣿⡌⠀⠀⠀⠀\n"
											+ "⠀⠀⠀⢸⣼⣿⣿⣿⣿⠃⡟⣼⠃⣿⣿⡯⢃⣽⢿⢳⣿⣿⡿⢡⠛⠁⠇⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠋⡃⠘⣿⣿⢸⣇⣿⣿⣿⣿⡏⠀⠀⠀⠀\n"
											+ "⠀⠀⠀⠺⣿⣿⣿⣿⠏⠀⠛⠉⢰⣿⠹⡟⠉⢱⣹⣾⠋⣹⡾⠁⠀⠀⣸⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣸⡇⣿⣿⣿⣿⡷⠀⠀⠀⠀\n"
											+ "⠀⠀⠀⢀⣿⣿⣿⡟⠀⠀⠆⢠⢾⣿⣰⣄⠒⠋⠘⠱⠀⣿⠁⠀⠀⠀⣿⡁⠀⠀⠀⠀⠀⠀⣀⣀⠀⠀⠀⠇⠰⣼⣿⣿⣿⢿⣿⣿⣿⣿⣿⡀⠀⠀⠀\n"
											+ "⠀⠀⢀⢼⣿⣿⣿⠆⠀⣠⣼⣾⣾⣿⣾⣿⣿⣆⡀⠐⠊⠉⠀⠀⠀⢰⡿⠀⠀⠀⣀⣤⣾⣿⣿⣾⣿⣶⣦⣄⠀⣿⡎⢿⣿⢸⣿⣿⣿⣿⣿⣧⠀⠀⠀\n"
											+ "⠀⠀⠈⢺⣿⣿⣼⣠⣸⣿⣿⠟⠛⢻⠟⠻⣿⣿⣿⣆⡀⠀⠀⠀⠀⠀⠁⠀⡴⣶⣿⣿⣿⡿⠛⠛⠛⢿⣿⣿⡄⣀⡂⠂⠉⣸⣿⣿⣿⣿⣿⣟⠀⠀⠀\n"
											+ "⠀⠀⠀⢺⣿⡿⠀⣿⣽⣿⠇⢀⣼⣿⣶⣈⢋⠙⣿⣿⡗⠀⠀⠀⠀⠀⠀⠘⣽⣿⣿⡿⢋⢔⣂⣀⠀⠀⠈⢿⣿⠸⡤⠄⠀⢸⣿⣿⣿⣿⣿⣿⡄⠀⠀\n"
											+ "⠀⠀⠀⣼⣿⣯⠀⣿⣿⣯⠀⢸⣿⣿⣿⣿⣏⢀⣿⣿⣯⠀⠀⠀⠀⠀⠀⢾⣿⣿⣿⡴⣿⣿⣿⣿⣿⡄⡄⢸⣿⡀⠃⠀⠀⠸⣿⣿⣿⣿⣿⣿⡇⠀⠀\n"
											+ "⠀⠀⡄⣹⣿⡗⠈⢻⣾⣿⣇⠌⢻⠿⠿⣿⣼⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣧⢹⣿⣿⣿⣿⢧⢀⣾⣿⢃⠃⠀⠀⢸⣿⣿⣿⣿⣿⣿⡇⠀⠀\n"
											+ "⠀⠀⠃⣿⣿⣿⢠⠈⢹⣿⡿⣷⣶⣾⣾⣿⣿⣟⣿⡟⠙⡆⠀⠀⠀⠀⠀⠂⢹⣿⣿⣿⣷⣽⣿⣋⣷⣬⣿⣿⢣⠀⠁⠀⠀⣾⣿⣿⣿⣿⣿⣿⠌⠀⠀\n"
											+ "⠀⠀⠀⣿⣿⣿⣘⠆⠘⡟⡯⣿⣷⣼⣿⣿⣿⠟⠁⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣿⣿⣿⡿⡿⢿⠟⠛⣩⠲⠁⠀⠀⠀⢤⣿⣿⣿⣿⣿⣿⣿⠦⡆⠀\n"
											+ "⠀⠀⠀⣿⣿⣿⣿⠄⠀⠀⠙⠻⢻⡿⢿⠟⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠿⣿⣿⣶⣿⠿⠿⠃⠀⠀⠀⣠⣡⣸⣿⣿⣿⣿⣿⣿⣿⡟⠃⠀\n"
											+ "⠀⠀⠀⣿⣿⣿⣿⣶⡄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠩⠙⠌⠀⠠⠊⠀⠀⠰⠍⢿⣿⣿⣿⣿⣿⣿⣿⣿⡷⢀⠀\n"
											+ "⠀⠀⠈⣿⣿⣿⣿⣿⠉⠣⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⣀⣀⣴⢷⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀\n"
											+ "⠀⠀⢐⣿⣿⣿⣿⣿⡃⡀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠳⣴⣧⣦⠄⠀⠀⠀⠀⠀⠀⠀⠀⢀⠰⣶⣷⠿⣤⠞⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢀\n"
											+ "⠀⠀⣺⣾⣿⣿⣿⣿⣷⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⣿⣿⡶⠋⣿⣿⣾⠀⠀⠀⠀⠀⠀⠀⠀⣟⣊⡹⣺⣾⢟⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠈\n"
											+ "⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⡄⢾⣆⠀⠀⠀⠀⠀⠀⠐⣿⣿⠈⠃⠙⢿⠿⠀⠀⠀⠀⠀⠀⠀⠀⠉⣩⣾⡿⢃⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀\n"
											+ "⢆⠀⠀⣿⣿⣿⣿⣿⣿⣿⣟⣎⣿⣧⡄⠀⠀⠀⠀⠀⠙⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢐⣦⣾⡿⢋⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀\n"
											+ "⢸⡦⡆⣿⣿⣿⣿⣿⣿⣿⣿⣿⡌⠹⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⣀⣼⣿⣿⠉⣐⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⡇⠀\n"
											+ "⠀⢸⠃⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⠈⢻⣿⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣿⣿⡿⠃⣡⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⠀\n"
											+ "⠀⠀⠙⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠙⠿⣿⣿⣦⣤⣀⣠⣀⣤⣴⣿⣿⣿⠋⠁⠤⣬⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠀\n"
											+ "⠀⠀⡜⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣀⠉⠛⠻⣿⣿⣿⣿⠿⠛⠿⢉⣀⡤⡀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀\n"
											+ "⠀⠀⠇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠂⠀⠈⢳⡒⢀⣀⠤⢀⠀⣭⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣼⠁⠀⠀\n"
											+ "⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣈⠣⠄⠀⠉⠀⣠⣵⠞⠉⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⣧⠀⠀⠀\n"
											+ "⠀⠀⣤⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠒⢶⠒⠶⠀⠉⠀⠀⠈⣿⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣹⣯⠀⠀⠀\n"
											+ "⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢳⢀⠸⠀⠀⠀⠀⠀⠀⠐⣿⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢹⡾⡃⠀⠀\n"
											+ "⠀⠀⣿⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣞⡄⠀⠀⠀⠀⠀⠀⠂⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⣿⠀⠀⠀\n"
											+ "⠀⠀⣿⡟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣤⣿⣿⣿⣿⣿⣌⠀⠀⠀⠀⠠⠀⠀⣿⣿⣿⣿⣿⡟⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠹⠃⠀⠀\n"
											+ "⠀⠰⣘⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⡃⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠈⠀⠀⠀\n"
											+ "⠀⠀⡿⠟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⢿⡇⠀⠀⠀⠀⠀⠈⡇⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣀⠀");
								
							}else {
								System.out.println("You are free to go. But don't you worry, we will get you next time >:(");
							}
								break;	
							}		
						}							
					}
	//------Customer refuses to shop and comply. Let's see if we can get them trapped in our factory forever
					if(scanner.nextInt()==2) {
						System.out.println("Stop shopping? WHY? TODAY IS YOUR DOOMSDAY! MUAHAHAHAHAHAHHAHAHAHHAHAHAHA");
						System.out.println("You have died. You have failed the workers at the factory");
						
					}
							
				//What happens when the customer decided not to order now
				}else if (userSpecial.toLowerCase().equals("no")) {
					System.out.println("What?! You wanna order later? How rude. Get out of our factory right now!");
					}
				}	
		}else {
			System.out.println("You're missing out on the benefits. That's on you");
			}		
		}
	}
}


