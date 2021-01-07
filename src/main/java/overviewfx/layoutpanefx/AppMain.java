package overviewfx.layoutpanefx;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String demo;
		demo = "tile";
		if(demo.equals("border")) {
			BorderPaneFx borderPane = new BorderPaneFx();
			borderPane.main(args);
		}else if(demo.equals("archor")) {
			AnchorPaneFx anchorPane = new AnchorPaneFx();
			anchorPane.main(args);			
		}else if (demo.equals("flow")) {
			FlowPaneFx flowPane = new FlowPaneFx();
			flowPane.main(args);
		}else if (demo.equals("grid")) {
			GridPaneFx gridPane = new GridPaneFx();
			gridPane.main(args);
		}else if (demo.equals("grid2")) {
			GridPane2Fx gridPane = new GridPane2Fx();
			gridPane.main(args);
		}else if (demo.equals("hbox")) {
			HBoxFx hbox = new HBoxFx();
			hbox.main(args);
		}else if (demo.equals("vbox")) {
			VBoxFx vbox = new VBoxFx();
			vbox.main(args);
		}else if (demo.equals("stack")) {
			StackPaneFx stackPane = new StackPaneFx();
			stackPane.main(args);
		}else if (demo.equals("tile")) {
			TilePaneFx tilePane = new TilePaneFx();
			tilePane.main(args);
		}
	}
}
