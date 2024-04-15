package tesdt.writer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import tesdt.family_tree.FamilyTree;

public class FileHandlerProj implements Writeble {
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

        
    }

    
