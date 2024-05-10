package tesdt.view.Command;

import tesdt.view.ConsoleUI;

public class SortByAge extends Command{
    public SortByAge(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Отсортировать список по возрасту";
    }

    public void execute(){
        consoleUI.sortByAge();
    }
}
