package Practice11;

public class NewsSubscriber implements Observer{
    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + "收到了" + news);
    }
}
