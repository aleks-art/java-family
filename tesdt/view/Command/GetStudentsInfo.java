package tesdt.view.Command;

import tesdt.view.ConsoleUI;

public class GetStudentsInfo extends Command{
    public GetStudentsInfo(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Получить список студентов";
    }

    public void execute(){
        consoleUI.getStudentsListInfo();
    }
}
