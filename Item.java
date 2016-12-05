/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanager;

/**
 *
 * @author Abigail
 */
public class Item {
    
    private String name;
    private int quantity;
    private double price_per_unit;

    public Item() {//no arg constructor
    }

    public Item(String nName, int nQuantity, double nPpu) {//constructor initializes all data fields
        name = nName;
        quantity = nQuantity;
        price_per_unit = nPpu;
    }
//getters 
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice_per_unit() {
        return price_per_unit;
    }
//setters
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice_per_unit(double price_per_unit) {
        this.price_per_unit = price_per_unit;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-15d%-15.2f", this.name, this.quantity, this.price_per_unit);//formats string 
    }//s means string, d means int, f means double 
}
