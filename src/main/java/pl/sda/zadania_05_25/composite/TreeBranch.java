package pl.sda.zadania_05_25.composite;

import java.util.ArrayList;
import java.util.List;

public class TreeBranch implements TreeElement {

    private final List<TreeElement> treeElements = new ArrayList<TreeElement>();

    public void addTreeElement(TreeElement element) {
        treeElements.add(element);
    }

    public void print() {
        System.out.println("This is branch");
        for (TreeElement element : treeElements) {
            element.print();
        }
    }
}
