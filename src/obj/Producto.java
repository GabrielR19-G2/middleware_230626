/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obj;

/**
 *
 * @author gabri
 */
public class Producto {
    private int idProd;
    private String name;
    private String descripcion;

    public Producto() {
    }

    public Producto(int idProducto, String name, String semestre) {
        this.idProd = idProducto;
        this.name = name;
        this.descripcion = semestre;
    }

    public Producto(String name, String desc) {
        this.descripcion = desc;
        this.name = name;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
