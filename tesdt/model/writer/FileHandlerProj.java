package tesdt.model.writer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import tesdt.model.Human.Human;
import tesdt.model.family_tree.FamilyTree;

public class FileHandlerProj {
    public boolean save(FamilyTree serializable, String filename){
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename))){
            objectOutputStream.writeObject(serializable);  
            return true;       
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        }

        public Object read(String filename){
            try (ObjectInputStream objectInputStream =  new ObjectInputStream(new FileInputStream(filename))){
                return objectInputStream.readObject();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

//    @Override
//    public FamilyTree<Human> read() {
//        return null;
//    }
//
//    @Override
//    public boolean save(FamilyTree<Human> activeTree) {
//        return false;
//    }


}

    
