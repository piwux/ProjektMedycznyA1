module javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
requires java.naming;
    opens javafx to javafx.fxml;
    exports javafx;
}