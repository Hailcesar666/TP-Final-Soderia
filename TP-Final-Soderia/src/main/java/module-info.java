module com.example.tpfinalsoderia {
    requires javafx.controls;
    requires javafx.fxml;


    opens tpSoderia to javafx.fxml;
    exports tpSoderia;
}