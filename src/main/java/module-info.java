module ccac.bridgingfromjavatocplusplus {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens ccac.bridgingfromjavatocplusplus to javafx.fxml;
    exports ccac.bridgingfromjavatocplusplus;
}