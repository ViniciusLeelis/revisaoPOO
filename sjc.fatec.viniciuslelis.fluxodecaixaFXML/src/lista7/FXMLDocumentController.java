/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista7;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javax.swing.JOptionPane;
import lista7.Lista7;

/**
 *
 * @author Admin
 */
public class FXMLDocumentController {
    
    @FXML
    public void initialize() {
    }
    
    
    @FXML
    private Text welcomeMessage;
    
    @FXML
    private Pane registerPane;
            
    
    //Registrar usuario
    @FXML
    private TextField registerName;
    
    @FXML
    private TextField registerEmail;
    
    @FXML
    private TextField registerUser;
    
    @FXML
    private TextField registerPassword;
    
    //Fazer login
    @FXML
    private TextField userTextField;
    @FXML
    private TextField passwordTextField;
    
    @FXML
    private AnchorPane conteudo;
    

    
    //Metodos para LOGIN
    listaUsuarios listaUsuarios = new listaUsuarios();
    
    
    @FXML
    public void close() {
    Platform.exit();
    }
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    @FXML
    private void showRegister(ActionEvent event) {        
        registerPane.setVisible(true);
        welcomeMessage.setText("Register: ");
    }
    @FXML
    private void login(ActionEvent event) throws IOException {
        String user; String password;
        user = userTextField.getText();
        password = passwordTextField.getText();
        listaUsuarios.fazerLogin(user, password);
        

    }
    @FXML 
    private void registerUser(ActionEvent event) throws IOException {

        String nome; String email; String user; String password;
        nome = registerName.getText(); email = registerEmail.getText(); 
        user = registerUser.getText(); password = registerPassword.getText();
        Usuario novo = new Usuario(nome, email, user, password, true);
        listaUsuarios.addUsuario(novo);
        String arquivoNovo = "[" + nome + "," + email + "," + user + "," + password + "]";
        JOptionPane.showMessageDialog(null,  "Seja bem-vindo ao sistema  !");
        registerName.setText(""); registerEmail.setText(""); registerUser.setText(""); registerPassword.setText("");
        registerPane.setVisible(false);
        userTextField.setText(user);
        welcomeMessage.setText("Welcome again !");
        arquivoMetod.escritor("C:\\biblioteca\\usuarios.txt", arquivoNovo);
        
    }
    
    
    }


