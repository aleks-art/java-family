package tesdt.presenter;

import tesdt.model.Service;
import tesdt.model.writer.FileHandlerFamily;
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
        getFamilyInfo();
    }


    public void getFamilyInfo() {
        String info = service.getHumanList();
        view.printAnswer(info);
    }

    public void sortByAge() {
        service.sortByDeathDate();
        getFamilyInfo();
    }

    public void sortByName() {
        service.sortByName();
        getFamilyInfo();
    }

    public void save(){
        service.save();
    }

    public void load(){
        service.setWritable(new FileHandlerFamily());
    }
}
