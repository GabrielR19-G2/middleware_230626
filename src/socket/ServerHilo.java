/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socket;

import com.google.gson.Gson;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JFrame;
import obj.ProdInterpreter;
import obj.Producto;
import obj.Report;
import obj.ReportInterpreter;

/**
 *
 * @author gabri
 */
public class ServerHilo extends Thread {
    Socket s = null;
    DataInputStream in = null;
    DataOutput out = null;
    JFrame jframe =null;
    
    public ServerHilo(Socket soc, DataInputStream in, DataOutput ot){
        this.s = soc;
        this.in = in;
        this.out = ot;
    }
    
    @Override
    public void run(){
        while(true){
            try{
                Gson gson = new Gson();
                String msg = in.readUTF();
                System.out.println(msg);
                if (msg.contains("{")) {
                    Producto p = gson.fromJson(msg, Producto.class);
                    msg =ProdInterpreter.toString(p);
                    out.writeUTF(msg);
                    
                }else{
                    Report r = ReportInterpreter.fromString(msg);
                    String repJs = gson.toJson(r);
                    out.writeUTF(repJs);
                }
            }catch(IOException e){
                
            }
        }
    }
}
