package overviewfx.layoutpanefx;

/*
 * Record
 * 21.01.06
 * JavaFX provide builder object, example
 * BorderPane has BorderPaneBuilder
 * Scene scene = SceneBuilder.create()
 *   .width(..)
 *   .height(..)
 *   .root(
 *     BorderPane borderPane = new BorderPaneBuilder.create()
 *       .top(...)
 *       .bottom(...)
 *       .left(...)
 *       .right(...)
 *       .center(...)
 *       .build(); to construct BorderPane layout
 *   )
 *   .build();
 *   
 * AnchorPaneBuilder
 * AnchorPane anchorPane = AnchorPaneBuilder.create()
 *   .children(...)
 *   .build();
 * 
 * 
 */