package tesdt.presenter;

import tesdt.model.Human.Gender;
import tesdt.model.Human.Human;
import tesdt.model.Service;
import tesdt.model.family_tree.FamilyTree;
import tesdt.view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addHuman(String name, String age, String gender, long idfather, long idmother) {
        service.addHuman(name,gender,age,idfather,idmother);
        //какой-то ответ
        getStudentsListInfo();
    }


    public void getStudentsListInfo() {
        String info = service.getHumanList();
        view.printAnswer(info);
    }

    public void sortByAge() {
        service.sortByDeathDate();
        getStudentsListInfo();
    }

    public void sortByName() {
        service.sortByName();
        getStudentsListInfo();
    }
}
