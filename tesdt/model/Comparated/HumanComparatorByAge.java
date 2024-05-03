package tesdt.model.Comparated;

import tesdt.model.family_tree.FamilyInterface;

import java.util.Comparator;

public class HumanComparatorByAge<R extends FamilyInterface> implements Comparator<R> {
    @Override
    public int compare(R o1, R  o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
