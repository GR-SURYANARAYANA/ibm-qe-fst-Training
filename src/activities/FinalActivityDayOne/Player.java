package activities.FinalActivityDayOne;

public class Player {
    public final String name;
    public int numberOfTurns=3;
    Template template = new Template();

    public Player(String name) {
        this.name = name;
    }
    public void playerPlayConsole(){
        template.startUp();

        template.EndTemplate();
    }





}
