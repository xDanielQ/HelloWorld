package pl.sda.zadania_03_31;

public class AlgorytmFigury2 {
    public static void main(String[] args) {
        przekatna(6);
    }

    static void przekatna(int level){
        if(level > 1 && level < 20)
            przekatna(level - 1);
        for(int i = 0; i < level; i++)
            System.out.print(" ");
        System.out.println("*");
    }
}
