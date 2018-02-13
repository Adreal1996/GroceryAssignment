public class GroceryItemOrder
{
    /*
    The GroceryItemOrder class should have an item name, a quantity, and a price per unit,
    and it should have a constructor setting all these values,
    and one only setting the name(the default quantity should be one).

    It should have a getCost-method returning the total cost of the item in its given quantity,
    and a toString-method returning a String with the name, quantity, and total cost.
    All fields should have getter and setter methods.
    */
    private String name;
    private double price;
    private int units;

    public double getTotalCost ()
    {
        return (this.price * this.units);
    }

    public GroceryItemOrder(String name)
    {
        this.name = name;
        this.units = 1;
    }

    public GroceryItemOrder(String name, double price, int units)
    {
        this.name = name;
        this.price = price;
        this.units = units;
    }

    @Override
    public String toString()
    {
        return "Grocery Item: " + name + ", "+ "Price: " + price + ", " + "Quantity: " + units;
    }
}
