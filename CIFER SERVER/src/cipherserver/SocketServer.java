/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cipherserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author goopy
 */
public class SocketServer {
    
    public String runSock() throws SocketException, IOException{
        
        
        DatagramSocket serverSocket = new DatagramSocket(9876);
        byte[] reciveData = new byte[1024];
        byte[] sendData = new byte[1024];
        while(true){
            
            DatagramPacket recivePacket = new DatagramPacket(reciveData, reciveData.length);
            serverSocket.receive(recivePacket);
            
        }
    
    }
}
