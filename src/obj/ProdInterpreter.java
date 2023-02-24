/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obj;

/**
 *
 * @author gabri
 */
public class ProdInterpreter {
    
    public static String toString(Producto a) {
        return a.getIdProd()+ ", " + a.getName() + ", " + a.getDescripcion();
    }
    
    public static Producto fromString(String s){
        String[] div = s.split(",");
        return new Producto(div[0],div[1]);
    }
    
}
