package ud7;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.*;

public class SopaDeLetras2 extends Application {

    static char[][] sopaLetras = {
            { 's', 'o', 'z', 'h', 'i', 'a', 'c', 'd', 'y' },
            { 's', 'e', 'x', 'a', 'm', 's', 'r', 'w', 'q' },
            { 'p', 'o', 'v', 'h', 'p', 'f', 'p', 'v', 'j' },
            { 'p', 'o', 'z', 'e', 'l', 'b', 'u', 'o', 'g' },
            { 'p', 'o', 'z', 'h', 'n', 'x', 'z', 'n', 'ñ' },
            { 'l', 'r', 'k', 'ñ', 'h', 'm', 't', 'e', 's' },
            { 'z', 'z', 'd', 'b', 'h', 'g', 'f', 'p', 'i' },
            { 'q', 'g', 'ñ', 'j', 'f', 'd', 's', 'c', 'x' },
            { 'z', 'c', 'm', 'g', 'd', 's', 'm', 'd', 'x' }
    };

    // Lista de letras seleccionadas
    private StringBuilder palabraActual = new StringBuilder();
    private List<Label> letrasSeleccionadas = new ArrayList<>();

    // Conjunto de palabras válidas
    private Set<String> palabrasValidas = new HashSet<>(Arrays.asList(
            "buzo","mar","ancla","barco","arpon","pesca","pez","peces","banco"
            
    ));

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Sopa de Letras");

        GridPane gridpane = new GridPane();

        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[i].length; j++) {
                Label lblLetra = new Label(String.valueOf(sopaLetras[i][j]));
                lblLetra.setPrefSize(40, 40);
                lblLetra.setAlignment(Pos.CENTER);
                lblLetra.setStyle("-fx-border-color: gray; -fx-font-size: 16px;");

                final int row = i;
                final int col = j;

                lblLetra.setOnMouseClicked(e -> {
                    if (!letrasSeleccionadas.contains(lblLetra)) {
                        lblLetra.setStyle("-fx-background-color: lightblue; -fx-border-color: gray; -fx-font-size: 16px;");
                        letrasSeleccionadas.add(lblLetra);
                        palabraActual.append(sopaLetras[row][col]);

                        System.out.println("Letra: " + sopaLetras[row][col]);
                        System.out.println("Palabra actual: " + palabraActual);

                        // Si la palabra es válida, mostrar alerta
                        if (palabrasValidas.contains(palabraActual.toString())) {
                            mostrarAlerta("¡Palabra encontrada!", "Has encontrado la palabra: " + palabraActual.toString());
                            reiniciarSeleccion();
                        }
                    }
                });

                gridpane.add(lblLetra, j, i);
            }
        }

        gridpane.setAlignment(Pos.CENTER);
        gridpane.setVgap(5);
        gridpane.setHgap(5);

        primaryStage.setScene(new Scene(gridpane, 300, 300));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private void reiniciarSeleccion() {
        // Quitar color y limpiar selecciones
        for (Label l : letrasSeleccionadas) {
            l.setStyle("-fx-border-color: gray; -fx-font-size: 16px;");
        }
        letrasSeleccionadas.clear();
        palabraActual.setLength(0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}