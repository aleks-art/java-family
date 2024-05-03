package tesdt.view.Command;

import tesdt.view.ConsoleUI;

public class AddHuman extends Command {
    public AddHuman(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Добавить имя";
    }

    public void execute() {
        consoleUI.addHuman();
    }
}
