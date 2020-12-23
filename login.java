/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import com.sun.prism.paint.Color;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class Login extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       GridPane grid=new GridPane();
       grid.setAlignment(Pos.CENTER);
       grid.setHgap(5);
       grid.setVgap(5);
       grid.setPadding(new Insets(10,10,10,10));
       
       Scene scene = new Scene(grid,400,500);
       Text text =new Text("LOGIN :");
       text.setFont(Font.font("Tahoma", FontWeight.LIGHT, 0));
       
       Label userName=new Label("User Name :");
       TextField txt=new TextField("your name");
       
       Label pass=new Label("PassWord :");
       PasswordField passF=new PasswordField();
       
       grid.add(text,0,0,2,1);
       grid.add(userName, 0, 1);
       grid.add(txt, 1, 1);
       grid.add(pass, 0, 2);
       grid.add(passF, 1, 2);
       
       
       grid.setGridLinesVisible(false);
        Button btn=new Button("Submit");
        HBox hbtn =new HBox(20);
        hbtn.setAlignment(Pos.BASELINE_RIGHT);
        hbtn.getChildren().add(btn);
        grid.add(hbtn, 1, 3);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget,1,6);
       
        
        primaryStage.setTitle("LOGIN PAGE");
        primaryStage.setScene(scene);
        primaryStage.show();
    
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
