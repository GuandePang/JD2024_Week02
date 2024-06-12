package Practice02;

public class People {
    private String username;
    private int score;

    public People(String username, int score){
        this.username = username;
        this.score = score;
    }

    public String getFinalMark(){
        if(this.score >= 90){
            return "A";
        } else if (score >= 60) {
            return "B";
        } else {
            return "C";
        }
    }
}
