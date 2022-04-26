public class Jugador { 

    private String name;
    private int score;
    private int encertades;

    public Jugador(String name) {
        this.name=name;
        this.score=0;
        this.encertades=0;
    }

    public String getName() { return this.name; }
    public int getScore() { return this.score; }
    public int getEncertades() { return this.encertades; }

    public void incrementScore(int score) { this.score+=score; }
    public void deccrementScore(int score) { this.score-=score; }
    public void incrementEncertades() { this.encertades++; }
}