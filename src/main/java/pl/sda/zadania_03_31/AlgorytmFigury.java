package pl.sda.zadania_03_31;

public class AlgorytmFigury {
    public static void main(String[] args) {
        gwiazdki(6);
    }

    static void gwiazdki(int level){
        if(level > 1 && level < 20)
            gwiazdki(level - 1);
        for(int i = 0; i < level; i++)
            System.out.print("*");
        System.out.println();
    }
}
