import java.io.File;

import javafx.application.Application;

import static javafx.application.Application.launch;

import javafx.geometry.Insets;

import javafx.geometry.Pos;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.control.Slider;

import javafx.scene.effect.ColorAdjust;

import javafx.scene.image.Image;

import javafx.scene.image.ImageView;

import javafx.scene.layout.BorderPane;

import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;

import javafx.stage.Stage;

import javax.imageio.ImageIO;

import javax.swing.JFileChooser;

import javax.swing.filechooser.FileFilter;

import javax.swing.filechooser.FileNameExtensionFilter;

public class ImageAdjuster extends Application {

    private Image selectedImage = null;

    private ImageView imgView;

    private Slider hueSlider, saturationSlider, brightnessSlider, contrastSlider;

    @Override

    public void start(Stage primaryStage) {

        Label hueLabel = new Label("Hue:");

        Label satLabel = new Label("Saturation:");

        Label briLabel = new Label("Brightness:");

        Label contrLabel = new Label("Contrast:");

        hueSlider = new Slider(-10, 10, 0);

        hueSlider.setMajorTickUnit(1);

        hueSlider.setShowTickMarks(true);

        hueSlider.setShowTickLabels(true);

        hueSlider.valueProperty().addListener(e -> update());

        saturationSlider = new Slider(-10, 10, 0);

        saturationSlider.setMajorTickUnit(1);

        saturationSlider.setShowTickMarks(true);

        saturationSlider.setShowTickLabels(true);

        saturationSlider.valueProperty().addListener(e -> update());

        brightnessSlider = new Slider(-10, 10, 0);

        brightnessSlider.setMajorTickUnit(1);

        brightnessSlider.setShowTickMarks(true);

        brightnessSlider.setShowTickLabels(true);

        brightnessSlider.valueProperty().addListener(e -> update());

        contrastSlider = new Slider(-10, 10, 0);

        contrastSlider.setMajorTickUnit(1);

        contrastSlider.setShowTickMarks(true);

        contrastSlider.setShowTickLabels(true);

        contrastSlider.valueProperty().addListener(e -> update());

        VBox sliders = new VBox(hueLabel, hueSlider, satLabel, saturationSlider, briLabel, brightnessSlider, contrLabel, contrastSlider);

        sliders.setAlignment(Pos.CENTER);

        sliders.setPrefWidth(350); 

        imgView = new ImageView(selectedImage);

        imgView.setFitHeight(200);

        imgView.setFitWidth(200);

        Button chooseImg = new Button("Choose/open an image");

        chooseImg.setOnAction(e -> openImage());

        HBox btnBox = new HBox(chooseImg);

        btnBox.setAlignment(Pos.CENTER);

        BorderPane root = new BorderPane();

        root.setPadding(new Insets(20));

        root.setRight(sliders);

        root.setCenter(imgView);

        root.setBottom(btnBox);

        Scene scene = new Scene(root, 800, 700);

        primaryStage.setScene(scene);

        primaryStage.setTitle("Image Adjuster");

        primaryStage.show();

    }

    //event handler method for opening a file

    public void openImage() {

        JFileChooser fileChooser = new JFileChooser();

        FileFilter filter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());

        fileChooser.setFileFilter(filter);

        int res = fileChooser.showOpenDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {

            File f = fileChooser.getSelectedFile();

            selectedImage = new Image("file:" + f.getAbsolutePath());

            imgView.setImage(selectedImage);

        }

    }

    public void update() {

        ColorAdjust colorAdjust = new ColorAdjust(hueSlider.getValue(), saturationSlider.getValue(),

                brightnessSlider.getValue(), contrastSlider.getValue());

        imgView.setEffect(colorAdjust);

    }

    public static void main(String[] args) {

        launch(args);

    }

}