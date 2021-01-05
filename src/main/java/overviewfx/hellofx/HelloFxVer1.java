package overviewfx.hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloFxVer1 extends Application{
	@Override
	public void start(Stage primaryStage) {
		Text text = new Text("JavaFX Hello World");
		text.setX(50);
		text.setY(50);
		
		Group group = new Group();
		group .getChildren().add(text);
		
		Scene scene = new Scene(group);
		
		primaryStage.setTitle("JavaFX Hello World");
		primaryStage.setWidth(250);
		primaryStage.setHeight(200);
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	public void main(String[] args) {
		launch(args);
	}
}
