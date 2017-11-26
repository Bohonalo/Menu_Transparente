package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class MenuController {
	
    @FXML
    private Button btn_settings;

    @FXML
    private Button btn_close;
    
    @FXML
    private AnchorPane panel_settings;
    
    @FXML
    private void handleButtonAction(MouseEvent event) {
		
    	if (event.getSource() == btn_close) {
    		System.exit(0);
    	}else if (event.getSource() == btn_settings) {
    		if (panel_settings.isVisible() == true) {
    			panel_settings.setVisible(false);
    		}else {
    			panel_settings.setVisible(true);
    		}
    		
    	}

	}
	
}
