import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.event.*;
import javafx.geometry.*;

public class JavaFxMenu extends Application {
  Label response;
  public static void main(String[] args) {
    launch(args);
  }
  public void start(Stage myStage) {
    myStage.setTitle("JavaFx  Menu");
    BorderPane rootNode = new BorderPane();
    Scene myScene = new Scene(rootNode, 300, 300);
    myStage.setScene(myScene);
    response = new Label("JavaFX Menu");
    MenuBar mb = new MenuBar();

    Menu fileMenu = new Menu("_File");
    MenuItem open = new MenuItem("Open");
    MenuItem close = new MenuItem("Close");
    MenuItem save = new MenuItem("Save");
    MenuItem exit = new MenuItem("Exit");
    fileMenu.getItems().addAll(open, close, save,
                               new SeparatorMenuItem(), exit);
    mb.getMenus().add(fileMenu);
    Menu optionsMenu = new Menu("Options");
    Menu colorsMenu = new Menu("Edit");
    optionsMenu.getItems().add(new SeparatorMenuItem());
    MenuItem reset = new MenuItem("Reset");
    optionsMenu.getItems().add(reset);
    mb.getMenus().add(optionsMenu);

    Menu helpMenu = new Menu("Help");
    MenuItem about = new MenuItem("About");
    helpMenu.getItems().add(about);
    mb.getMenus().add(helpMenu);

    EventHandler<ActionEvent> MEHandler =
                                new EventHandler<ActionEvent>() {
      public void handle(ActionEvent ae) {
        String name = ((MenuItem)ae.getTarget()).getText();

        if(name.equals("Exit")) Platform.exit();

        response.setText( name + " selected");
      }
    };

    open.setOnAction(MEHandler);
    close.setOnAction(MEHandler);
    save.setOnAction(MEHandler);
    exit.setOnAction(MEHandler);
    reset.setOnAction(MEHandler);
    about.setOnAction(MEHandler);

    rootNode.setTop(mb);
    rootNode.setCenter(response);

    MenuItem cut = new MenuItem("Cut");
    MenuItem copy = new MenuItem("Copy");
    MenuItem paste = new MenuItem("Paste");
    cut.setOnAction(MEHandler);
    copy.setOnAction(MEHandler);
    paste.setOnAction(MEHandler);

    ContextMenu editMenu = new ContextMenu(cut, copy, paste);

    rootNode.setOnContextMenuRequested(
                new EventHandler<ContextMenuEvent>() {
      public void handle(ContextMenuEvent ae) {
        editMenu.show(rootNode, ae.getScreenX(), ae.getScreenY());
      }
    });

    myStage.show();
  }
}
