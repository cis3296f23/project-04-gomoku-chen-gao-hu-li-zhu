module com.gomoku.project04gomoku {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires javafx.media;

    opens com.gomoku.project04gomoku to javafx.fxml;
    exports com.gomoku.project04gomoku;
    exports com.gomoku.project04gomoku.mvc.ViewModel;
    opens com.gomoku.project04gomoku.mvc.ViewModel to javafx.fxml;
}