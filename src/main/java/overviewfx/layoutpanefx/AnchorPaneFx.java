package overviewfx.layoutpanefx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPaneFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		Button btn1 = new Button("Top-Left");
		btn1.setPrefSize(100, 20);
		Button btn2 = new Button("Bottom-Left");
		btn2.setPrefSize(100, 20);
		Button btn3 = new Button("Bottom-Right");
		btn3.setPrefSize(100, 20);
		Button btn4 = new Button("Top-Right");
		btn4.setPrefSize(100, 20);
		
		AnchorPane anchorPane = new AnchorPane();
		
		AnchorPane.setTopAnchor(btn1, 10.0);
		AnchorPane.setLeftAnchor(btn1, 10.0);
		
		AnchorPane.setBottomAnchor(btn2, 10.0);
		AnchorPane.setLeftAnchor(btn2, 10.0);
		
		AnchorPane.setRightAnchor(btn3, 10.0);
		AnchorPane.setBottomAnchor(btn3, 10.0);
		
		AnchorPane.setRightAnchor(btn4, 10.0);
		AnchorPane.setTopAnchor(btn4, 10.0);
		
		anchorPane.getChildren().addAll(btn1, btn2, btn3, btn4);
		
		Scene scene = new Scene(anchorPane);
		primaryStage.setTitle("Demo Anchor Pane");
		primaryStage.setWidth(320);
		primaryStage.setHeight(180);
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	public void main(String[] args) {
		launch(args);
	}
}
