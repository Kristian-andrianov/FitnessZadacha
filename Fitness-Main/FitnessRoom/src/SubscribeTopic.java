public class SubscribeTopic implements Observer {

    private String name;
    private Observable topic;

    public SubscribeTopic(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if(this.topic == null) {
            System.out.println("No topic set");
            return;
        }
        String lastTopic = this.topic.getUpdate();
        System.out.println();
        System.out.println(this.name + " is doing: " + lastTopic);
    }

    @Override
    public void setTopic(Observable topic) {
        this.topic = topic;
    }

}