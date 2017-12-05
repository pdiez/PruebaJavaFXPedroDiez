package control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * 
 * @author pdiez
 * @version 1.0.0
 * @see MainFX
 *
 */

public class ControlFX implements Initializable {
		
	@FXML
	private JFXButton cmdGetStarted;//, cmdCerrar;
	
	@FXML
	private Label titulo1;//, l1, l2;
	
	
	
	@FXML
	private void openStage(ActionEvent event)  {

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/vista/FreeSolo.fxml"));
	        Scene scene;
			scene = new Scene(loader.load(), 500, 400);
	        Stage stage = new Stage();
	        stage.setScene(scene);
	        stage.initStyle(StageStyle.UNDECORATED);
	        stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@FXML
	private void closeApp(ActionEvent event)  {
		Platform.exit();
	}
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		titulo1.setId("textoGrande");
		/*final Tooltip tooltip = new Tooltip();
		tooltip.setText("Open FreeSolo");
		cmdGetStarted.setTooltip(tooltip);*/
		
		
		
	}
	
	
	
	
	
	
}
