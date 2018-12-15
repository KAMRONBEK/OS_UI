package Home;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private VBox pnItems=null;
    private Button trash;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Node [] nodes=new Node[4];
        for (int i=0; i<nodes.length;i++){
            try {
                nodes[i]= FXMLLoader.load(getClass().getResource("Item.fxml"));
                pnItems.getChildren().add(nodes[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //deleting node
//        for (int i=0;i<nodes.length;i++){
//            int finalI = i;
//            trash.setOnAction(evt->{
//                pnItems.getChildren().remove(nodes[finalI]);
//            });
//        }
    }
}
