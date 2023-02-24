/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author gabri
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ServerSocket server = null;
        Socket s[] = new Socket[3];
        DataInputStream[] in = new DataInputStream[3];
        DataOutputStream[] out = new DataOutputStream[3];
        Socket turno = null;
        
        
        int[] puertoCliente = new int[3];
        final int port = 5000;
        
        try{
            server = new ServerSocket(port);
            System.out.println("Servidor iniciado");
            ServerHilo s1 =null;
            ServerHilo s2 =null;
            ServerHilo s3 =null;
            
            for (int i = 0; i < puertoCliente.length; i++) {
                s[i] = server.accept();
                in[i] = new DataInputStream(s[i].getInputStream());
                out[i] = new DataOutputStream(s[i].getOutputStream());
                System.out.println("Cliente: " + (i+1) + ", conectado.");
            }
            s1 = new ServerHilo(s[0], in[0],out[1]);
            s2 = new ServerHilo(s[2], in[2],out[0]);
            s3 = new ServerHilo(s[1], in[1],out[0]);
            s1.start();
            s2.start();
            s3.start();
            while(true){}
        }catch(IOException e){
            
        }
        
    }
    
}
