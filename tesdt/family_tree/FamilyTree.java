package tesdt.family_tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import tesdt.Comparated.HumanComparatorByAge;
import tesdt.Comparated.HumanComparatorByName;
import tesdt.Human.Human;

public class FamilyTree implements Serializable,Iterable<Human>{
    private long humansId;
    private List<Human> humanList;

    public FamilyTree() {
        this(new ArrayList<>());
    }

    public FamilyTree(List<Human> HumanList) {
        this.humanList = HumanList;
    }

    public boolean add(Human human){
        if (human == null) {
            return false;
        }
        if (!humanList.contains(human)){
            humanList.add(human);
            human.setId(humansId++);

            addToParents(human);

            return true;
        }
        return false;
    }

    private void addToParents(Human human){
        for (Human parent: human.getParents()){
            parent.addChild(human);
        }
    }

    public List<Human> getByName(String name){
        List<Human> res = new ArrayList<>();
        for (Human human: humanList){
            if (human.getName().equals(name)){
                res.add(human);
            }
        }
        return res;
    }

        public Human getById(long id){
        for (Human human: humanList){
            if (human.getId() == id){
                return human;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("В дереве ");
        sb.append(humanList.size());
        sb.append(" объектов: \n");
        for (Human human: humanList){
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();
    }

    

    public void sortByName(){
        humanList.sort(new HumanComparatorByName());
    }

    public void sortByDeathDate(){
        humanList.sort(new HumanComparatorByAge());
    }


    @Override
    public Iterator<Human> iterator() {
        return new FamilyIterator(humanList);
    }

   }