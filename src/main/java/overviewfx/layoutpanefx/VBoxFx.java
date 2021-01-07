package overviewfx.layoutpanefx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class VBoxFx extends Application {
	@Override
	public void start(Stage primaryStage) {
		VBox vbox = new VBox();
		vbox.setPadding(new Insets(10));
		vbox.setSpacing(10);
		
		Label lbl1 = new Label("Month");
		lbl1.setFont(Font.font("Verdana", FontWeight.BOLD, 12));
		vbox.getChildren().add(lbl1);
		
		ListView<String> list = new ListView<>();
		
		ObservableList<String> months = 
			FXCollections.observableArrayList(
				"Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec.");
		list.setItems(months);
		
		VBox.setVgrow(list, Priority.ALWAYS);
		vbox.getChildren().add(list);
		
		Scene scene = new Scene(vbox);
		
		primaryStage.setTitle("Demo VBox");
		primaryStage.setWidth(640);
		primaryStage.setHeight(360);
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
	
	public void main(String[] args) {
		launch(args);
	}
}
