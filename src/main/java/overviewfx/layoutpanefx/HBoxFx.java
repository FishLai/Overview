package overviewfx.layoutpanefx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class HBoxFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(20, 10, 10, 10));
		hbox.setSpacing(10);
		
		Label lblURL = new Label("URL : ");
		TextField txtURL = new TextField();
		HBox.setHgrow(txtURL, Priority.ALWAYS);
		
		Button btnGo = new Button("go");
		btnGo.setPrefSize(60, 20);
		
		hbox.getChildren().addAll(lblURL, txtURL, btnGo);
		
		Scene scene = new Scene(hbox);
		
		primaryStage.setTitle("Demo HBox");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void main(String[] args) {
		launch(args);
	}
}
