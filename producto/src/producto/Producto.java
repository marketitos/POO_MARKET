/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package producto;

/**
 *
 * @author ET36
 */
public class Producto {

    private int cod;
    private String desc;
    private double precio;
    
    public Producto(int c, String d, double pcio){
        this.cod = c;
        this.desc = d;
        this.precio = pcio;
    }
    
    public String toString(){
        
        return "codigo de producto: " + cod + "descripcion: " + desc + "precio: " + precio + "";
    }
    
    public double calcularTotal(){
        double total = 0;
        return total;
    }
    
}
