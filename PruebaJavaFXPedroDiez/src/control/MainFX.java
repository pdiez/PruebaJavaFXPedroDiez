package control;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * 
 * @author pdiez
 * @version 1.0.0
 * @see ControlFX
 *
 */

public class MainFX extends Application {
	Stage stage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
			mainWindow();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private void mainWindow() {
		try {
			FXMLLoader loader=new FXMLLoader(getClass().getResource("/vista/Login.fxml"));
	        AnchorPane pane=loader.load();
	        stage.initStyle(StageStyle.DECORATED);
	        stage.setScene(new Scene(pane));
	        stage.getScene().getStylesheets().add("/vista/styles.css");
	        
	        
	        
	        stage.show();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
