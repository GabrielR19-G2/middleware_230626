/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socket;

import com.google.gson.Gson;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import obj.Producto;
import obj.Report;
import obj.ReportInterpreter;
import pantallas.FrmProd;

/**
 *
 * @author gabri
 */
public class ThClienteProds extends Thread{
    Socket socket = null;
    DataInputStream in = null;
    Producto prodRec = null;
    Report repRec = null;
    FrmProd frmP = null;

    public ThClienteProds(Socket s, DataInputStream in, FrmProd frmP) {
        this.socket = s;
        this.in = in;
        this.frmP = frmP;
    }
    
    public void Run() throws IOException{
        while(true){
            try{
                Gson gs = new Gson();
                
                String msg = in.readUTF();
                System.out.println(msg);
                repRec = ReportInterpreter.fromString(msg);
                frmP.agregarReporte(repRec);
            }catch(IOException e){
                
            }
        }
    }
}
