package tesdt.view.Command;

import tesdt.view.ConsoleUI;

public class GetFamilyInfo extends Command{
    public GetFamilyInfo(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Получить список семьи";
    }

    public void execute(){
        consoleUI.getStudentsListInfo();
    }
}
