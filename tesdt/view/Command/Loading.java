package tesdt.view.Command;

import tesdt.view.ConsoleUI;

public class Loading extends Command{
    public Loading(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Загрузить список:";
    }

    public void execute(){
        consoleUI.Loading();
    }
}
