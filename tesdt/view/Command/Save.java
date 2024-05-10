package tesdt.view.Command;

import tesdt.view.ConsoleUI;

public class Save extends Command {
    public Save(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Сохранить список:";
    }

    public void execute(){
        consoleUI.Save();
    }
}
