package tesdt.Comparated;

import tesdt.Human.Human;
import tesdt.family_tree.FamilyInterface;

import java.util.Comparator;

public class HumanComparatorByName<R extends FamilyInterface> implements Comparator<R>{
    @Override
    public int compare(R o1, R o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
