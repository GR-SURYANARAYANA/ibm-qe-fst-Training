package activities.FinalActivityDayOne;

public class Template {
     void startUp(){
        System.out.println("""
                 _________________________________________
                |   welcome to Rock Paper Scissor Game    |
                |_________________________________________|\n""");
    }

    void gameTemplate(){
        System.out.println("""
                -------------------------------------
               |       Game Rock Paper Scissor      |
                -------------------------------------
                1. Rock
                2. Paper
                3. Scissors
                -------------------------------------
                Enter the choice:""");
    }

    void EndTemplate(){
        System.out.println("""
                 -------------------------------------
                |   Thanks for Playing the game       |   
                 -------------------------------------
                """);
    }


}
