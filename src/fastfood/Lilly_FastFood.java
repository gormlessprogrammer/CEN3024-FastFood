// Name: Trevor Lilly
// Date: 02/26/22
// Program Name: Lilly_FastFood
// Description: A program that shows a list of fast food items using graphical checkboxes and performs basic addition and subtraction, while displaying a string.

package fastfood;

import java.text.NumberFormat;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;


public class Lilly_FastFood extends Application {
	
	// I'm assembling a team. Of fast food items.
	// So the purpose of these two array lists is to show what the user selected on the second screen.
	static ArrayList<String> items = new ArrayList<>();
	static ArrayList<Double> cost = new ArrayList<>();
	// Global public variable. Idiotic? Yes.
	static double total = 0;


	public static void main(String[] args) {

		
//		System.out.println("Printing menu and prices: \n");
//		for (int i = 0; i < fastFood.length; i++) {
//		System.out.println(fastFood[i]+" "+price[i]);
//		}
		
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// cash money format
		NumberFormat format = NumberFormat.getCurrencyInstance();
		// sir, this is a fastfood app.
		stage.setTitle("Fastfood App");
		TilePane ff = new TilePane();
		Button order = new Button("send");
		// in case you get confused.
		Label mi = new Label("This is a menu item");
		// A string array of fastfood items.
		String fastFood[] = new String[]{"Hamburger", "Cheeseburger", "Bacon Cheeseburger", "Hot Dog", "Fries", "Shake", "Soda"};
		// A double array of their prices.
		final double price[] = new double[] {3.59, 3.97, 4.35, 1.95, 2.79, 3.15, 1.86};
		ff.getChildren().add(mi);
		// Making a textfield so you can add your special instructions
		TextField instruction = new TextField();
		ff.setAlignment(Pos.CENTER);
		
		// This is not graceful, but for the sake of granular control we're doing individual checkboxes like this. Ewwwwwwwwww.
			CheckBox menuitem = new CheckBox(fastFood[0] + " " + format.format(price[0]));
			CheckBox menuitem1 = new CheckBox(fastFood[1] + " " + format.format(price[1]));
			CheckBox menuitem2 = new CheckBox(fastFood[2] + " " + format.format(price[2]));
			CheckBox menuitem3 = new CheckBox(fastFood[3] + " " + format.format(price[3]));
			CheckBox menuitem4 = new CheckBox(fastFood[4] + " " +  format.format(price[4]));
			CheckBox menuitem5 = new CheckBox(fastFood[5] + " " +  format.format(price[5]));
			CheckBox menuitem6 = new CheckBox(fastFood[6] + " " +  format.format(price[6]));
			// IT BEGINS.
			ff.getChildren().addAll(menuitem, menuitem1, menuitem2, menuitem3, menuitem4, menuitem5, menuitem6);
		
			// this listener method is probably the ugliest thing i've seen ... look at it
			menuitem.selectedProperty().addListener((ObservableValue<? extends Boolean> ov,
					Boolean old_val, Boolean new_val) -> {
						if (menuitem.isSelected()) {
							// So, if you tick a box - it'll add the price of the item to what you ordered.
							cost.add(price[0]);
							// It'll also update the global price variable.
							total = (price[0] += total);
							// This adds the names to the list on the second screen.
							items.add(fastFood[0]);
							 }
						else {
							if (!menuitem.isSelected()) {
								// If you un-select something, it'll undo everything. Hopefully.
								cost.remove(price[0]);
								total -= price[0]; 
								items.remove(fastFood[0]);
							} 
						} 
						System.out.println(total);
							});
			
			
			menuitem1.selectedProperty().addListener((ObservableValue<? extends Boolean> ov,
					Boolean old_val, Boolean new_val) -> {
						if (menuitem1.isSelected()) {
							cost.add(price[1]);
							total = (price[1] += total);
							System.out.println(total);
							items.add(fastFood[1]);
						}  
						else {
							if (!menuitem1.isSelected()) {
								cost.remove(price[1]);
								total -= price[1]; 
								items.remove(fastFood[1]);
							} 
						} 
						System.out.println(total);
							});
			
			menuitem2.selectedProperty().addListener((ObservableValue<? extends Boolean> ov,
					Boolean old_val, Boolean new_val) -> {
						if (menuitem2.isSelected()) {
							cost.add(price[2]);
							total = (price[2] += total);
							System.out.println(total);
							items.add(fastFood[2]);
						} 						
						else {
							if (!menuitem2.isSelected()) {
								cost.remove(price[2]);
								total -= price[2]; 
								items.remove(fastFood[2]);
							} 
						} 
						System.out.println(total);
							});
			
			menuitem3.selectedProperty().addListener((ObservableValue<? extends Boolean> ov,
					Boolean old_val, Boolean new_val) -> {
						if (menuitem3.isSelected()) {
							cost.add(price[3]);
							total = (price[3] += total);
							System.out.println(total);
							items.add(fastFood[3]);
						} 						
						else {
							if (!menuitem3.isSelected()) {
								cost.remove(price[3]);
								total -= price[3]; 
								items.remove(fastFood[3]);
								
							} 
						} 
						System.out.println(total);
							});
			
			menuitem4.selectedProperty().addListener((ObservableValue<? extends Boolean> ov,
					Boolean old_val, Boolean new_val) -> {
						if (menuitem4.isSelected()) {
							cost.add(price[4]);
							total = (price[4] += total);
							System.out.println(total);
							items.add(fastFood[4]);
						} 						
						else {
							if (!menuitem4.isSelected()) {
								total -= price[4]; 
								items.remove(fastFood[4]);
								cost.remove(price[4]);
							} 
						} 
						System.out.println(total);
							});
			
			menuitem5.selectedProperty().addListener((ObservableValue<? extends Boolean> ov,
					Boolean old_val, Boolean new_val) -> {
						if (menuitem5.isSelected()) {
							cost.add(price[5]);
							total = (price[5] += total);
							System.out.println(total);
							items.add(fastFood[5]);
						} 						
						else {
							if (!menuitem5.isSelected()) {
								total -= price[5]; 
								items.remove(fastFood[5]);
								cost.remove(price[5]);
							} 
						} 
						System.out.println(total);
							});
			
			menuitem6.selectedProperty().addListener((ObservableValue<? extends Boolean> ov,
					Boolean old_val, Boolean new_val) -> {
						if (menuitem6.isSelected()) {
							cost.add(price[6]);
							total = (price[6] += total);
							System.out.println(total);
							items.add(fastFood[6]);
						} 						
						else {
							if (!menuitem6.isSelected()) {
								total -= price[6]; 
								items.remove(fastFood[6]);
								cost.remove(price[6]);
								
							} 
						} 
						System.out.println(total);
							});

		ff.getChildren().add(instruction);
		ff.getChildren().add(order);
		
		order.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// figured it'd probably be a good idea to convert what was in the textfield to text.
				String instructionText = instruction.getText();
				// The stringbuilder is probably the best option when it comes to dealing with lists, loops, and javaFX
				StringBuilder result = new StringBuilder();
				// just making a label specifically to display this stuff
				Label t = new Label();
				t.setAlignment(Pos.CENTER);
				result.append("You ordered:\n");
				result.append("------------------------------------\n");
				// a loop that iterates through everything you clicked on the menu, individually showing the price and names of what you ordered
				for (int i = 0; i < cost.size(); i++) {
					result.append(items.get(i) + " " + format.format(cost.get(i)));
					result.append(".\n");
				}
					// we display what the global price 
					result.append("\nWhich adds up to: " + format.format(total));
				// displaying everything above with the instructions beneath.
				t.setText(result.toString() + "\n *** Special instructions: " + instructionText.toString() + " ***");
				
				Scene scene2 = new Scene(t, 400, 400);
				stage.setScene(scene2);
				stage.show();
					}
		}
		);
		
		Scene scene = new Scene(ff, 400, 400);
		stage.setScene(scene);
		stage.show();
		
	}

	}
