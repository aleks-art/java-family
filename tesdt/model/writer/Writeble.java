package tesdt.model.writer;


import tesdt.model.Human.Human;
import tesdt.model.family_tree.FamilyTree;

public interface Writeble {
    boolean save (FamilyTree serializable, String filename);
    Object read(String filename);
    void setFilePath(String filePath);

    FamilyTree<Human> read();

    boolean save(FamilyTree<Human> activeTree);
}
