/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productsystem;

/**
 *
 * @author Priyank H
 */
public class Product {
    
    private int id;
    private String name;
    private float price;
    private String date;
    private byte[] picture;
    
    public Product(int id,String name,float price,String date,byte[] picture){
        this.id=id;
        this.name=name;
        this.price=price;
        this.date=date;
        this.picture=picture;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    public String getDate(){
        return date;
    }
    public byte[] getPicture(){
        return picture;
    }
}
