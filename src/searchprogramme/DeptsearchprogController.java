/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchprogramme;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import mainproject.Mainproject;

/**
 * FXML Controller class
 *
 * @author Ibeun Joe Dickson
 */
public class DeptsearchprogController implements Initializable {

  @FXML
    private JFXButton back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backbtn(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/mainproject/depthamburger.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            
            stage.setResizable(false);
            
            stage.setScene(new Scene(root1));
            stage.show();
            stage.setOnCloseRequest(new EventHandler<WindowEvent>() {

                    @Override
                    public void handle(WindowEvent e) {
                        try {
                            System.out.println("save");
                            Mainproject.save();

                        } catch (IOException ex) {
                            ex.printStackTrace();

                        }

                    }

                });
            //closing this window
            back.getScene().getWindow().hide();
        } catch (IOException ex) {
            Logger.getLogger(SearchprogrammeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

