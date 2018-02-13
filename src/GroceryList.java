import java.util.Arrays;

public class GroceryList
{
    /*
    The GroceryList class should use an array to store the grocery item orders.
    Assume that a grocery list will have no more than 10 item orders.

    The GroceryList class should have an add-method that will add a given item order to the list if the list has
    fewer than 10 items, and a getTotalCost-method that will return the total sum cost of all grocery item orders
    in this list. It should also have a toString-method.
     */
    private GroceryItemOrder[] groceryItem;
    private int pointer;

    public double getTotalCost ()
    {
        double sum = 0;

        for (GroceryItemOrder groceryItem: groceryItem )
        {
            sum += groceryItem.getTotalCost();
        }

        return sum;

    }

    public GroceryList()
    {
        this.groceryItem = new GroceryItemOrder[10];
    }

    public void addItem(GroceryItemOrder gio)
    {
        groceryItem[pointer] = gio;
        pointer++;
    }

    @Override
    public String toString()
    {
        String value = "";
        for (GroceryItemOrder gio: this.groceryItem) {
            value += gio + "\n";
        }
        return "GroceryList" + value;
    }
}
