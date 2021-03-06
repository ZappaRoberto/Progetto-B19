import com.GUI.CartellaComponent;
import com.GUI.NumbersBoard;
import com.GUI.controllers.StartingInterfaceController;
import com.Game.Cartella;
import com.Game.CartellaFactory;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.event.KeyEvent;

/**
 * Class that setup and execute the simulation of the client.
 */
public class Main extends Application {

    /**
     * Main client method
     *
     * @param args
     */
    public static void main(String[] args) {
       /* Client client =  new Client();

        client.avviaClient(); */


        launch(args);
    }

    /**
     * Start the main menu
     *
     * @param primaryStage  stage of the main menu
     * @throws Exception error of loading the stage
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("resources/MenuStage.fxml"));

        //Integer[] num = CartellaFactory.createCartella().getNumeri();




        //CartellaComponent cartella1 = new CartellaComponent();
        //NumbersBoard numbersBoard = new NumbersBoard();
        //numbersBoard.initNumbers();
        //cartella1.setNumeri(num);
        //Pane root = new Pane();
        //root.getChildren().add(numbersBoard);



        //root.getChildren().add(cartella1);
        //Scene scene = new Scene(root);

        //scene.getStylesheets().add(this.getClass().getResource("resources/Style.CSS").toExternalForm() );

        //Load and start the main menu
        FXMLLoader loader = new FXMLLoader(getClass().getResource("resources/StartingInterface.fxml"));


        Parent parent = loader.load();
        Scene scene = new Scene(parent,800, 500);

        //Press ESC to close the window
        scene.addEventHandler(javafx.scene.input.KeyEvent.KEY_PRESSED, new EventHandler<javafx.scene.input.KeyEvent>() {
            @Override
            public void handle(javafx.scene.input.KeyEvent event) {
                if (event.getCode() == KeyCode.ESCAPE){
                    primaryStage.close();
                }
            }
        });

        primaryStage.setTitle("Tombola Game!");
        primaryStage.setScene(scene);
        primaryStage.show();








    }



}