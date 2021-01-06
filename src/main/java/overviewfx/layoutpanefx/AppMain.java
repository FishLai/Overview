package overviewfx.layoutpanefx;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String demo;
		demo = "archor";
		if(demo.equals("border")) {
			BorderPaneFx borderPane = new BorderPaneFx();
			borderPane.main(args);
		}else if(demo.equals("archor")) {
			AnchorPaneFx anchorPane = new AnchorPaneFx();
			anchorPane.main(args);			
		}
	}

}
