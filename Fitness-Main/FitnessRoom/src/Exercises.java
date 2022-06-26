public class Exercises {
    Topic topic = new Topic();
    Observer Amy = new SubscribeTopic("Amy");
    Observer Steve = new SubscribeTopic("Steve");
    Observer Erko = new SubscribeTopic("Erko");
    
    public void Laying() {
    	
        topic.subscribe(Amy);
        topic.subscribe(Steve);
        topic.subscribe(Erko);
        topic.setTopic("The exercise Laying");
    }

    public void Standing() {

        topic.subscribe(Amy);
        topic.subscribe(Steve);
        topic.subscribe(Erko);
        topic.setTopic("The exercise Standing");
    }
}
