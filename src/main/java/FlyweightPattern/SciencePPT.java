package FlyweightPattern;

import java.sql.SQLOutput;

public class SciencePPT extends PowerPoint{
    public SciencePPT(String copyright) {
        super(copyright);
    }

    @Override
    void create() {
        System.out.println("科技类PPT模板");
    }
}
