package videomediaplayer;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

public class FXMLDocumentController implements Initializable {
    
    private String path;
    
    private MediaPlayer mediaPlayer;
    
    @FXML
    private MediaView mediaView;
    
    @FXML
    private Button muteBtn;
    
    public void open_FileMethod() {
        
        FileChooser fileChooser = new FileChooser();
        
        File file = fileChooser.showOpenDialog(null);
        
        path = file.toURI().toString();
        
        if(path != null) {
        
        Media media = new Media(path);
        
        mediaPlayer = new MediaPlayer(media);
        
        mediaView.setMediaPlayer(mediaPlayer);
        
        DoubleProperty widthProp = mediaView.fitWidthProperty();
        DoubleProperty heightProp = mediaView.fitHeightProperty();
            
        widthProp.bind(Bindings.selectDouble(mediaView.sceneProperty(), "width"));
        heightProp.bind(Bindings.selectDouble(mediaView.sceneProperty(), "height"));
        
        mediaPlayer.setVolume(50);
        
        mediaPlayer.play();
                
        }
        
    }
    
    public void pauseVideo(ActionEvent event){
        
        mediaPlayer.pause();
        
    }
    
    public void stopVideo(ActionEvent event){
        
        mediaPlayer.stop();
        
    }
    
    public void playVideo(ActionEvent event){
        
        mediaPlayer.play();
        
        mediaPlayer.setRate(1);
        
    }
    
    public void muteVideo(ActionEvent event){
        
        double vol = mediaPlayer.getVolume();
        
        if(vol > 0){
            
            muteBtn.setText("UnMute");
            
            mediaPlayer.setVolume(0);
             
        } else {
            
            muteBtn.setText("Mute");
            
            mediaPlayer.setVolume(50);
             
        }
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

}
