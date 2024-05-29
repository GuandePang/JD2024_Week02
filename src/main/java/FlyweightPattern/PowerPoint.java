package FlyweightPattern;



public abstract class PowerPoint {
    private String copyright;
    private String title;

    public PowerPoint(String copyright){
        this.copyright = copyright;
    }

    public void setTitle(String title){
        this.title = title;
    }

    abstract void create();

    public String toString(){
        return "编号" + hashCode() + ": PowerPoint{" +
                "copyright= " + copyright + '\'' +
                ", right= " + title +'\'' +
                "}";
    }
}
