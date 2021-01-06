package overviewfx.layoutpanefx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		Button btn1 = new Button("Top");
		Button btn2 = new Button("Bottom");
		Button btn3 = new Button("Left");
		Button btn4 = new Button("Right");
		Button btn5 = new Button("Center");
		
		BorderPane borderPane = new BorderPane();
		
		borderPane.setTop(btn1);
		borderPane.setBottom(btn2);
		borderPane.setLeft(btn3);
		borderPane.setRight(btn4);
		borderPane.setCenter(btn5);
		
		BorderPane.setAlignment(btn1, Pos.CENTER);
		BorderPane.setAlignment(btn2, Pos.CENTER);
		BorderPane.setAlignment(btn3, Pos.CENTER);
		BorderPane.setAlignment(btn4, Pos.CENTER);
		BorderPane.setAlignment(btn5, Pos.CENTER);
		
		Scene scene = new Scene(borderPane);
		primaryStage.setTitle("Border Pane Demo");
		primaryStage.setWidth(320);
		primaryStage.setHeight(180);
		primaryStage.setScene(scene);
		primaryStage.setResizable(true);
		
		primaryStage.show();
		
	}
	
	public void main(String[] args) {
		launch(args);
	}
}
