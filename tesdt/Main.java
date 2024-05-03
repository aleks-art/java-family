package tesdt;

import java.time.LocalDate;
import tesdt.model.Human.Gender;
import tesdt.model.Human.Human;
import tesdt.model.family_tree.FamilyTree;
import tesdt.model.writer.FileHandlerProj;
import tesdt.view.ConsoleUI;
import tesdt.view.View;

public class Main {
    public static void main(String[] args) {

//
        String filename = "H:/python/tesdt/Family.txt";
        FamilyTree<Human> tree = new FamilyTree<>();

        View view = new ConsoleUI();
        view.start();
        Human vasya = new Human("Василий", Gender.Male, LocalDate.of(1963, 12, 10));
        Human masha = new Human("Мария", Gender.Female, LocalDate.of(1965, 9, 15));
        Human christina = new Human("Кристина", Gender.Female, LocalDate.of(1988, 7, 5),
                vasya, masha);
        Human semyon = new Human("Семен", Gender.Male, LocalDate.of(1991, 1, 25),
                vasya, masha);
        Human aleks = new Human("Леша", Gender.Male, LocalDate.of(1990, 3, 12),
                vasya, masha);

        tree.add(vasya);
        tree.add(masha);
        tree.add(christina);
        tree.add(semyon);
        tree.add(aleks);



//        tree = read(filename);
        // System.out.println(tree);

//        save(tree,filename);
//        // tree = read(filename);
//        System.out.println(read(filename));
//        tree.sortByDeathDate();
//        System.out.println(tree);
//        tree.sortByName();
//        System.out.println(tree);
        }


//        static void save(FamilyTree familyTree,String filename){
//                FileHandlerProj fileHandler = new FileHandlerProj();
//                fileHandler.save(familyTree,filename);
//        }
//
//        static FamilyTree read(String filename){
//                FileHandlerProj fileHandler = new FileHandlerProj();
//                return (FamilyTree) fileHandler.read(filename);
//
//        }

    }