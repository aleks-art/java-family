package tesdt.model.family_tree;

import java.util.Iterator;
import java.util.List;


public class FamilyIterator<T extends FamilyInterface> implements Iterator<T>{
    private int index;
    private List<T> HumanList;

    public FamilyIterator(List<T> humanList) {
        this.HumanList = humanList;
        index = 0;
    }


    @Override
    public boolean hasNext() {
        return index < HumanList.size();
    }

    @Override
    public T next() {
        return HumanList.get(index++);
    }

}
