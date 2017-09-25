/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista7;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class Lista7 extends Application {
    
    public static Stage primaryStage;
    public static Class thisClass;
    
    public Lista7() {
        thisClass = getClass();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        
        try {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root, 864, 586);
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    
    public void close() throws Exception {
        this.primaryStage = primaryStage;
        
        try {

        primaryStage.close();
        
    } catch (Exception e) {
        e.printStackTrace();
    }        
    }
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        launch(args);
    }
    public static void loadscene(String nameFile, String titlePage) {
        Parent root;
        try {
            root = FXMLLoader.load(thisClass.getClass().getResource(nameFile));
            Scene scene = new Scene(root);
            primaryStage.setTitle(titlePage);
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
