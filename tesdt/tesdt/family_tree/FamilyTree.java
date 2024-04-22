package tesdt.family_tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import tesdt.Comparated.HumanComparatorByAge;
import tesdt.Comparated.HumanComparatorByName;
import tesdt.Human.Human;

public class FamilyTree<E extends FamilyInterface> implements Serializable,Iterable<E>{
    private long humansId;
    private List<E> humanList;

    public FamilyTree() {
        this(new ArrayList<>());
    }

    public FamilyTree(List<E> HumanList) {
        this.humanList = HumanList;
    }

    public boolean add(E human){
        if (human == null) {
            return false;
        }
        if (!humanList.contains(human)){
            humanList.add(human);
            human.setId(humansId++);

//            addToParents(human);

            return true;
        }
        return false;
    }

//    private void addToParents(E human){
//        for (E parent : human.getParents()) {
//            parent.addChild(human);
//        }
//    }

    public List<E> getByName(String name){
        List<E> res = new ArrayList<>();
        for (E human: humanList){
            if (human.getName().equals(name)){
                res.add(human);
            }
        }
        return res;
    }

        public E getById(long id){
        for (E human: humanList){
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
        for (E human: humanList){
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();
    }

    

    public void sortByName(){
        humanList.sort(new HumanComparatorByName<>());
    }

    public void sortByDeathDate(){
        humanList.sort(new HumanComparatorByAge<>());
    }


    @Override
    public Iterator<E> iterator() {
        return new FamilyIterator<>(humanList);
    }

   }