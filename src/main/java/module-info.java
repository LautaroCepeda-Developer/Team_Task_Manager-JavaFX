module l_lau_u.team_task_manager {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens l_lau_u.team_task_manager to javafx.fxml;
    opens l_lau_u.team_task_manager.forms to javafx.fxml;
    exports l_lau_u.team_task_manager;
    exports l_lau_u.team_task_manager.forms to javafx.fxml;
}
