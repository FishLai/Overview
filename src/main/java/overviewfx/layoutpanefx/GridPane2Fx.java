package overviewfx.layoutpanefx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPane2Fx extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane gPane = new GridPane();
		gPane.setAlignment(Pos.CENTER);
		gPane.setHgap(10.0);
		gPane.setVgap(10.0);
		gPane.setPadding(new Insets(10.0));
		gPane.setGridLinesVisible(true);
		
		final int col = 3;
		final int row = 4;
		
		Button button[][] = new Button[col][row];
		
		button[0][0] = new Button("("+0+":"+0+")");
		button[0][0].setPrefSize(120, 20);
		gPane.add(button[0][0], 0, 0, 2, 1);
		
		button[2][0] = new Button("("+ 0 + ":"+ 2+")");
		button[2][0].setPrefSize(160, 20);
		gPane.add(button[2][0], 2, 0);
		
		button[0][1] = new Button("("+1+":"+0+")");
		button[0][1].setPrefSize(60, 20);
		gPane.add(button[0][1], 0, 1);
		
		button[1][1] = new Button("("+1+":"+1+")");
		button[1][1].setPrefSize(200, 20);
		gPane.add(button[1][1], 1, 1, 2, 1);
		
		button[0][2] = new Button("("+ 2+":"+0+")");
		button[0][2].setPrefSize(60, 20);
		gPane.add(button[0][2], 0, 2, 1, 2);
		
		button[1][2] = new Button("("+ 2+":"+1+")");
		button[1][2].setPrefSize(60, 20);
		gPane.add(button[1][2], 1, 2);
		
		button[1][3] = new Button("("+3+":"+1+")");
		button[1][3].setPrefSize(60, 20);
		gPane.add(button[1][3], 1, 3);
		
		button[2][2] = new Button("("+2+":"+2+")");
		button[2][2].setPrefSize(60, 20);
		gPane.add(button[2][2], 2, 2, 1, 2);
		
		Scene scene = new Scene(gPane);
		
		primaryStage.setTitle("Demo Grid Pane Span");
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	public void main(String[] args) {
		launch(args);
	}
}
