import javafx.scene.layout.Pane;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class lunarLander extends Application
{
    
public static void main(String[] args)
{

launch(args);

}

@Override
public void start(Stage primaryStage)
{

Image landerLanderImage = new Image("lunar_lander.png"); //Load lander
Image lunarSurfaceImage = new Image("lunar_surface.png"); //Load surface
  
ImageView viewLander = new ImageView(landerLanderImage); //View lander
ImageView viewSurface = new ImageView(lunarSurfaceImage); //View surface
  
// Transition to  move the lander
TranslateTransition landerTrans =
new TranslateTransition(new Duration(1500), viewLander);
landerTrans.setFromY(350);
landerTrans.setFromX(0);
landerTrans.setToY(350);
landerTrans.setToX(320);

  
TranslateTransition transAction =
new TranslateTransition(new Duration(1500), viewLander);
transAction.setFromY(350);
transAction.setFromX(320);
transAction.setToY(-100);
transAction.setToX(320);

  
// Pane
Pane pane = new Pane(viewSurface, viewLander);
  
Scene scene = new Scene(pane);
  
// event handler.
scene.setOnKeyPressed(s ->
{
transAction.play();
});

primaryStage.setScene(scene);
primaryStage.show();
landerTrans.play();

    }
}