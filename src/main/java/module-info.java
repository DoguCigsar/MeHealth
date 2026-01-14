module org.dogu_bhavya.mehealth {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.dogu_bhavya.mehealth to javafx.fxml;
    exports org.dogu_bhavya.mehealth;
}