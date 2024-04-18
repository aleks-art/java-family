package tesdt.family_tree;

import java.util.Iterator;
import java.util.List;

import tesdt.Human.Human;


public class FamilyIterator implements Iterator<Human>{
    private int index;
    private List<Human> HumanList;

    public FamilyIterator(List<Human> humanList) {
        this.HumanList = humanList;
        index = 0;
    }


    @Override
    public boolean hasNext() {
        return index < HumanList.size();
    }

    @Override
    public Human next() {
        return HumanList.get(index++);
    }

}
