import java.util.ArrayList;

abstract class GroceryStore {
    public abstract ArrayList<String> sortAscending(ArrayList<String> groceryItems);

    public abstract ArrayList<String> sortDescending(ArrayList<String> groceryItems);
}