/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius Lelis
 */
public class listaUsuarios {
    private List<Usuario>Usuarios = new ArrayList<>();
    public void addUsuario(Usuario usuario) {
        Usuarios.add(usuario);
    }
    public void fazerLogin(String user, String password) throws IOException {
        for(Usuario usuario: Usuarios) {
            if(usuario.getUser().equals(user) && usuario.getPassword().equals(password)) {
                JOptionPane.showMessageDialog(null, "Usuario encontrado !");
                try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLProgram.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stageProgram = new Stage();
                stageProgram.setScene(new Scene(root1));  
                stageProgram.show();
              } catch(Exception e) {
                    e.printStackTrace();
           }
            }
             else {
                JOptionPane.showMessageDialog(null, "Usuario não encontrado");
            }
            }
        }
  
    public void printar() {
        for(Usuario usuario: Usuarios) {
            System.out.println("User: " +  usuario.getUser() + "Password: " + usuario.getPassword() );
        }
    }
}
