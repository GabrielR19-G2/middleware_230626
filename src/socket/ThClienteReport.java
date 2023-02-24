/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import obj.ProdInterpreter;
import obj.Producto;
import obj.Report;
import pantallas.FrmRep;

/**
 *
 * @author gabri
 */
public class ThClienteReport extends Thread{

    Socket socket = null;
    DataInputStream in = null;
    Producto prodRec = null;
    Report repRec = null;
    FrmRep frmR = null;

    public ThClienteReport(Socket s, DataInputStream dtS, FrmRep frmR) {
        this.socket = s;
        this.in = dtS;
        this.frmR = frmR;
    }

    @Override
    public void run(){
        while (true) {
            try {
                String msg = in.readUTF();
                System.out.println(msg);
                prodRec = ProdInterpreter.fromString(msg);
                frmR.agregarReporte(prodRec);
            }catch(IOException e){
                
            }
        }
    }

}
