package shoppinglist;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    private ArrayList <Item> Lists = new ArrayList<Item>();

    public int ListSize()
    {
        return Lists.size();
    }        
    public void print(Item items)
    {
        int aisleNumber = items.toString().charAt(0);
        System.out.println(aisleNumber);
    }        
    public Item get(int index)
    {
        return (Lists.get(index));
    }        
    public void add(Item items)
    {
        Lists.add(items);
    }        
    public void sort(int index)
    {
        Lists.get(index);
    }        
    private class Item 
    {
        String Name;
        int Aisle;
        
        public Item(String Name, int Aisle) 
        {
            this.Aisle = Aisle;
            this.Name = Name;
        }
        public String toString()
        {
            return String.format("%-5d %s", Aisle, Name);
        }        
    }
    public static void main(String[] args) throws FileNotFoundException
    {
        String fileName = args[0];
        Scanner s = new Scanner(new File(fileName));
        Shop shoppinglist = new Shop();
        Shop.Item items = null;
        int index = 0;
        while(s.hasNext())
        {
            items = shoppinglist.new Item(s.next(), Integer.parseInt(s.next()));
            shoppinglist.add(items);
            shoppinglist.print(items);
            shoppinglist.get(index++);
        }
        
    }
}
