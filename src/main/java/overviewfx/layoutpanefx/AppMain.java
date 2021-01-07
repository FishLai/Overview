package overviewfx.layoutpanefx;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String demo;
		demo = "grid2";
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
		}
	}

}
