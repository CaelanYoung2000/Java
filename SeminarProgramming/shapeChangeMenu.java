import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class shapeChangeMenu extends Application {
    
    
    private Canvas drawingCanvas;
    private int selectedNumber;
    private String selectedShape;
    private String selectedColor;
    private GraphicsContext gc;

    @Override
    public void start(Stage primaryStage) {
        
        
        selectedNumber = 20;
        selectedShape = "Rectangle";
        selectedColor = "Blue";
        
        
        BorderPane root = new BorderPane();

        
        MenuBar menubar = new MenuBar();

       
        
        Menu numbers = new Menu("Numbers");
        int nums[] = {1, 10, 20, 30}; 
       
        ToggleGroup numsGroup = new ToggleGroup();
       
        for (int i = 0; i < nums.length; i++) {
            RadioMenuItem item = new RadioMenuItem("" + nums[i]);
            
            if (nums[i] == selectedNumber) {
                item.setSelected(true);
            }
           
            item.setToggleGroup(numsGroup);
           
            item.setOnAction(e -> {
               
                selectedNumber = Integer.parseInt(item.getText());
                updateDrawing();
            });
           
            numbers.getItems().add(item);
        }
        
        Menu shapes = new Menu("Shapes");
        String shapeOptions[] = {"Circle", "Oval", "Rectangle", "Square"};
        ToggleGroup shapesGroup = new ToggleGroup();
        for (int i = 0; i < shapeOptions.length; i++) {
            RadioMenuItem item = new RadioMenuItem(shapeOptions[i]);
            if (shapeOptions[i].equals(selectedShape)) {
                item.setSelected(true);
            }
            item.setToggleGroup(shapesGroup);
            item.setOnAction(e -> {
                selectedShape = item.getText();
                updateDrawing();
            });
            shapes.getItems().add(item);
        }

        Menu colors = new Menu("Colors");
        String colorOptions[] = {"Red", "Green", "Blue", "Black"};
        ToggleGroup colorOptionsGroup = new ToggleGroup();
        for (int i = 0; i < colorOptions.length; i++) {
            RadioMenuItem item = new RadioMenuItem(colorOptions[i]);
            if (colorOptions[i].equals(selectedColor)) {
                item.setSelected(true);
            }
            item.setToggleGroup(colorOptionsGroup);
            item.setOnAction(e -> {
                selectedColor = item.getText();
                updateDrawing();
            });
            colors.getItems().add(item);
        }
        
        menubar.getMenus().addAll(numbers, shapes, colors);
        
        root.setTop(menubar);
        
        drawingCanvas = new Canvas(540, 450);
        
        gc = drawingCanvas.getGraphicsContext2D();
        
        root.setCenter(drawingCanvas);

        Scene scene = new Scene(root, 540, 450);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Select a number, shape, and color");
        primaryStage.show();
        
        updateDrawing();
        
    }

    public void updateDrawing() {   
       
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, drawingCanvas.getWidth(), drawingCanvas.getHeight());
        
        Color c = Color.web(selectedColor.toLowerCase());
        
        gc.setStroke(c);
        
        double x = 50, y = 50, width = 50, height = 25;
       
        if (selectedShape.equalsIgnoreCase("Rectangle")) {
            for (int i = 0; i < selectedNumber; i++) {
                
                gc.strokeRect(x + (i * 4), y + (i * 4), width + (i * 4), height + (i * 4));
            }
        } else if (selectedShape.equalsIgnoreCase("Square")) {
            for (int i = 0; i < selectedNumber; i++) {
                
                gc.strokeRect(x + (i * 4), y + (i * 4), width + (i * 4), width + (i * 4));
            }
        } else if (selectedShape.equalsIgnoreCase("Circle")) {
            for (int i = 0; i < selectedNumber; i++) {
               
                gc.strokeOval(x + i / 2.0, y + i / 2.0, width + (i * 5), width + (i * 5));
            }
        } else if (selectedShape.equalsIgnoreCase("Oval")) {
            for (int i = 0; i < selectedNumber; i++) {
                gc.strokeOval(x + i / 2.0, y + i / 2.0, width + (i * 5), height + (i * 5));
            }
        }

    }

    public static void main(String[] args) {
        launch(args);
    }

}