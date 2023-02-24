/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obj;

/**
 *
 * @author gabri
 */
public class ReportInterpreter {

    public static String toString(Report rep) {
        return rep.getIdReporte() + ", " + rep.getProd().getName() + ", " + rep.getComentario();
    }
    
    public static Report fromString(String str){
        String[] partes = str.split(",");
        Producto prod = new Producto();
        prod.setName(partes[1]);
        Report rep = new Report(partes[2],prod);
        return rep;
    }
}
