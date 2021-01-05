package overviewfx.welcomfx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class WelcomeFxController implements Initializable {
	@FXML Button button;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		/*P.S.
		 * ResourceBundle is used to do internationaliztion (i18n), 
		 * setting TW, US, etc... into .porperties
		 */
		
		if (button != null) {
			button.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					System.out.println("Hello World");
				}
			});
		}
	}
	
}
