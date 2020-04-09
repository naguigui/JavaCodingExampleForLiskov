import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GroceryStore walmart = new Walmart();
        GroceryStore sobeys = new Sobeys();

        ArrayList<String> groceryItems =new ArrayList<String>();
        groceryItems.add("Eggs");
        groceryItems.add("Lays Ketchup Chips");

        // Here we define a list of grocery stores
        ArrayList<GroceryStore> groceryStoreList = new ArrayList<GroceryStore>();
        groceryStoreList.add(walmart);
        groceryStoreList.add(sobeys);

        // Here we loop through an array of grocery stores and invoke its method sortAscending.
        // This is possible because walmart and sobeys both stem from the same abstract class!
        groceryStoreList.stream().forEach(store -> store.sortAscending(groceryItems));

        // Another way to loop and invoke their methods.
        for (GroceryStore groceryStore : groceryStoreList)
        {
            groceryStore.sortAscending(groceryItems);
        }
    }
}
