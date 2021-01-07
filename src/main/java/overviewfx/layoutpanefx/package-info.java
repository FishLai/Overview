package overviewfx.layoutpanefx;

/*
 * Record
 * 21.01.07
 * HBox & VBox
 *   hbox.setHgrow(..., Priority.ALWAYS); as change window size change ... width first;
 *   
 * GridPane -basic
 * GridPane2 -withSpan
 * GridPane3 -apply to welcome (no implement)
 * GridPaneBuilder
 *   row -> valignment(VPos...) when .rowConstraints(RowConstrainsBuilder().create()...build())
 *   col -> halignment(HPos...) when .columnConstraints(ColumnConstraintsBuilder().create()...build())
 * FlowPane
 *   new FlowPane(Orientation.VERTICAL); can change the orientation direction
 *   Maybe I can implement an button to do the change in demo
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