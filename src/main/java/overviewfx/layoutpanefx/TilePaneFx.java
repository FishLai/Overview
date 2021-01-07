package overviewfx.layoutpanefx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		TilePane tilePane = new TilePane(Orientation.VERTICAL);
		tilePane.setPadding(new Insets(10));
		tilePane.setHgap(5);
		tilePane.setVgap(5);
		tilePane.setPrefRows(20);
		Button btn[] = new Button[9];
		
		for(int i=0; i<9; i++) {
			btn[i] = new Button("btn "+i);
			tilePane.getChildren().add(btn[i]);
		}
		
		Scene sc = new Scene(tilePane);
		primaryStage.setTitle("Demo Tile Pane");
		primaryStage.setWidth(640);
		primaryStage.setHeight(360);
		primaryStage.setScene(sc);
		primaryStage.show();
	}
	
	public void main(String[] args) {
		launch(args);
	}
}
