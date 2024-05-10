package tesdt.model.writer;

import tesdt.model.Human.Human;
import tesdt.model.family_tree.FamilyTree;

public class FileHandlerFamily extends FileHandlerProj implements Writeble{
    private String filePath = "Family.txt";

    @Override
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean save(FamilyTree<Human> tree) {
        return super.save(tree, filePath);
    }

    @Override
    public FamilyTree<Human> read() {
        return (FamilyTree<Human>)super.read(filePath);
    }
}
