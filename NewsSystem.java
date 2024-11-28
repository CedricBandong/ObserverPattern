import java.util.ArrayList;
import java.util.List;

public class NewsSystem {
    public static void main(String[] args) {
        Subscriber carl = new Subscriber();
        carl.setSubscriberName("Carl");


        Subscriber trish = new Subscriber();
        trish.setSubscriberName("Trish");


        Subscriber josh = new Subscriber();
        josh.setSubscriberName("Josh");


        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(trish);
        subscriberList.add(carl);
        subscriberList.add(josh);


        NewsAgency news = new NewsAgency();
        news.setBreakingNews("Magnitude 5.7 quake jolts Tarlac!");
        news.setSubscriberList(subscriberList);


        System.out.println("NEWS UPDATE!");
        System.out.println(news.notifySubscriber());


        news.unsubscribe(carl);


        Subscriber cedric = new Subscriber();
        cedric.setSubscriberName("Cedric");
        news.subscribe(cedric);


        System.out.println("\nNEWS RECENTLY!");
        System.out.println(news.notifySubscriber());


        cedric.updateNewsAgency(news);
    }
}