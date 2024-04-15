package tesdt.writer;

import java.io.Serializable;

import tesdt.family_tree.FamilyTree;

public interface Writeble {
    boolean save (FamilyTree serializable, String filename);
    Object read(String filename);
}
