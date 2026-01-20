package activities.others;

public class Main extends Animal{
    public void sound(){
        System.out.println("Bow bow");
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.sound();
    }
}