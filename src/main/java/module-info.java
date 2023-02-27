module l_lau_u.team_task_manager {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens l_lau_u.team_task_manager to javafx.fxml;
    exports l_lau_u.team_task_manager;
}
