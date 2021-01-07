package overviewfx.layoutpanefx;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		Button btn4 = new Button("btn4");
		
		FlowPane flowPane = new FlowPane(Orientation.VERTICAL);
		flowPane.setHgap(5.0);
		flowPane.setVgap(5.0);
		flowPane.getChildren().addAll(btn1, btn2, btn3, btn4);
		
		Scene scene = new Scene(flowPane);
		
		primaryStage.setTitle("Demo Flow Pane");
		primaryStage.setWidth(320);
		primaryStage.setHeight(160);
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	public void main(String[] args) {
		launch(args);
	}
}
