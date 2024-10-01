package binary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Item implements Serializable {
    private int id;
    private String name;
    private Double cost;
    private String From;
    private String Description;

    public Item(int id, String name, Double cost, String from , String description) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.From = from;
        this.Description = description;
    }

    public int getId() {
        return id++;
    }

    public int setId(int id) {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String From) {
        this.From = From;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public static void writeDataToFile(String path, List<Item> items){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(items);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Item> readDataFormFile(String path){
        List<Item> items = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
        } catch (Exception ex) {
            ex.printStackTrace();
        }return items;
    }

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(  new Item (1,"Ball",5.0,"VN","idk"));
        items.add(  new Item (2,"Box",0.2,"USA","box"));
        items.add(  new Item (3,"clown's hat",2.0,"French","clown"));
        items.add(  new Item (4,"backpack",3.0,"China","package"));
        items.add(  new Item (5,"Glove",12.0,"India","just don't"));
        writeDataToFile("D:\\khang\\c0624g1Module2\\IOTextFile\\src\\binary\\item.txt",items );
        List<Item> itemDataFormFile = readDataFormFile("D:\\khang\\c0624g1Module2\\IOTextFile\\src\\binary\\item.txt");
        for (Item item: itemDataFormFile){
            System.out.println(item);
    }
}}
