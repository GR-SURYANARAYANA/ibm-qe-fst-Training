package activities.Exploration;

public class Main {

    public static void main(String[] args) {
//        Fun fun = (String whatsGame) -> "The game we play is " + whatsGame;
//        Runnable r = () -> System.out.println("lamda");
        Addable a1 = (int num1, int num2)->{
            return num1 + num2;
        };
        System.out.println(a1.add(21,32));
        Addable a2 = (int num1,int num2) -> num1*num2;
        System.out.println(a2.add(12,21));

    }
}
