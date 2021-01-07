package overviewfx.layoutpanefx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane gridPane = new GridPane();
		
		gridPane.setGridLinesVisible(true);
		
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(10.0);
		gridPane.setVgap(10.0);
		gridPane.setPadding(new Insets(10.0, 10.0, 10.0, 10.0));
		
		final int column = 3;
		final int row = 4;
		Button[][] button = new Button[3][4];
		
		for(int i=0; i<column; i++) {
			for(int j=0; j<row; j++) {
				button[i][j] = new Button("(" + j + ":" + i + ")");
				button[i][j].setPrefSize(60, 20);
				
				gridPane.add(button[i][j], i, j);
			}
		}
		
		Scene scene = new Scene(gridPane);
		
		primaryStage.setTitle("Demo Grid Pane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void main(String[] args) {
		launch(args);
	}
	
}
