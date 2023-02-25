package com.example.practicasocket.service;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientChat {
    private Socket socket;
    public void conection(String host, String puerto) {
        try {
            socket = new Socket(host, Integer.parseInt(puerto));
        } catch (
                IOException ex) {
            //  log.error("No se ha podido conectar con el servidor (" + ex.getMessage() + ").");
        }
        //if(socket != null) Host.
    }
}
