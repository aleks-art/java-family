package tesdt.family_tree;

import java.time.LocalDate;
import java.util.List;

public interface FamilyInterface<T> {
    long getId();
    T getFather();
    T getMother();
    boolean addChild(T human);
    String getName();
    LocalDate getBirthDate();
    List<T> getParents();

    void setId(long id);
}
