import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryMain
{
    static File groceryListFile = new File("./rescourse/groceryNames.txt");

    public static void main(String[] args)
    {
        GroceryList gL = getGroceryListFromFile(groceryListFile);

        GroceryList2 groceryList2 = new GroceryList2();


        /*
        GroceryItemOrder gio = new GroceryItemOrder("Tomato", 2.5, 60);
        GroceryItemOrder gio1 = new GroceryItemOrder("Mango", 5.0, 25);
        GroceryItemOrder gio2 = new GroceryItemOrder("Avocado", 6.0, 30);
        GroceryItemOrder gio3 = new GroceryItemOrder("Peach", 3.0, 50);
        GroceryItemOrder gio4 = new GroceryItemOrder("Aizen fruit", 10.0, 15);
        GroceryItemOrder gio5 = new GroceryItemOrder("American Chestnut", 2.0, 150);
        GroceryItemOrder gio6 = new GroceryItemOrder("Batuan", 4.0, 120);
        GroceryItemOrder gio7 = new GroceryItemOrder("BlackSapote", 4.5, 80);
        GroceryItemOrder gio8 = new GroceryItemOrder("Conkerberry", 1.5, 250);
        GroceryItemOrder gio9 = new GroceryItemOrder("Feijoa", 3.5, 75);

        gL.addItem(gio);
        gL.addItem(gio1);
        gL.addItem(gio2);
        gL.addItem(gio3);*/

        System.out.println(gL);

    }

    public static GroceryList getGroceryListFromFile(File file) {
        GroceryList groceryList = new GroceryList();
        Scanner scanner = null;

        try
        {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                groceryList.addItem(new GroceryItemOrder(scanner.nextLine()));
            }

        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        return groceryList;
    }


}