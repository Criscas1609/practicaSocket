package com.example.practicasocket.service;

import javafx.scene.control.TextField;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Logger;

public class ServerConection implements ActionListener {

    private Logger log = Logger.getLogger(String.valueOf(ServerConection.class));
    private Socket socket;
    private TextField tfMensaje;
    private String usuario;
    private DataOutputStream salidaDatos;

    public ServerConection(Socket socket, TextField tfMensaje, String usuario) {
        this.socket = socket;
        this.tfMensaje = tfMensaje;
        this.usuario = usuario;
        try {
            this.salidaDatos = new DataOutputStream(socket.getOutputStream());
        } catch (IOException ex) {
            // log.error("Error al crear el stream de salida : " + ex.getMessage());
        } catch (NullPointerException ex) {
            // log.error("El socket no se creo correctamente. ");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            salidaDatos.writeUTF(usuario + ": " + tfMensaje.getText() );
            tfMensaje.setText("");
        } catch (IOException ex) {
            //log.error("Error al intentar enviar un mensaje: " + ex.getMessage());
        }
    }
}
