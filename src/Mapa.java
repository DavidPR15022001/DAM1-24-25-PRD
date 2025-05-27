
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Mapa extends Application {

    String[] mapa = {
            "  Z       ",
            " *        ",
            "  *  *    ",
            "          ",
            " A        "
    };

    int fila, columna;
    GridPane gridPane = new GridPane();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Buscar posición inicial del personaje
        for (int i = 0; i < mapa.length; i++) {
            if (mapa[i].indexOf('A') != -1) {
                fila = i;
                columna = mapa[i].indexOf('A');
                break;
            }
        }

        renderMapa();

        Scene scene = new Scene(gridPane);
        scene.setOnKeyTyped(e -> {
            char tecla = e.getCharacter().toLowerCase().charAt(0);
            int nuevaFila = fila;
            int nuevaColumna = columna;

            switch (tecla) {
                case 'w': nuevaFila--; break;
                case 's': nuevaFila++; break;
                case 'a': nuevaColumna--; break;
                case 'd': nuevaColumna++; break;
                default: return;
            }

            if (nuevaFila < 0 || nuevaFila >= mapa.length || nuevaColumna < 0 || nuevaColumna >= mapa[0].length())
                return;

            char destino = mapa[nuevaFila].charAt(nuevaColumna);
            if (destino == '*') {
                mostrarAlerta("¡BOOM!", "Has pisado una mina.");
                return;
            } else if (destino == 'Z') {
                mostrarAlerta("¡Éxito!", "Has llegado a la meta.");
                return;
            }

            // Mover al personaje
            mapa[fila] = reemplazarCharEn(mapa[fila], columna, ' ');
            mapa[nuevaFila] = reemplazarCharEn(mapa[nuevaFila], nuevaColumna, 'A');
            fila = nuevaFila;
            columna = nuevaColumna;
            renderMapa();
        });

        primaryStage.setTitle("Mapa");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
        gridPane.requestFocus();  // Para capturar teclado
    }

    private void renderMapa() {
        gridPane.getChildren().clear();
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length(); j++) {
                Label lbl = new Label(String.valueOf(mapa[i].charAt(j)));
                lbl.setPrefSize(50, 50);
                lbl.setAlignment(Pos.CENTER);
                String css = "-fx-border-width:1; -fx-border-color:black;";
                switch (mapa[i].charAt(j)) {
                    case '*': css += "-fx-background-color: red;"; break;
                    case 'A': css += "-fx-background-color: green;"; break;
                    case 'Z': css += "-fx-background-color: yellow;"; break;
                }
                lbl.setStyle(css);
                gridPane.add(lbl, j, i);
            }
        }
    }

    private String reemplazarCharEn(String s, int index, char c) {
        return s.substring(0, index) + c + s.substring(index + 1);
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
