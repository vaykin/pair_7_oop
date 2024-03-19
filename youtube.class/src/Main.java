import java.time.LocalDate;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {

//    User user1 = new User(1,"@rasimyldz6873","Rasim","Yıldız","rasimyildiz2018@gmail.com","1234",35,"fenerbahçe");
//    User user2 = new User(2,"@ebm018","ebu","mangal","rasifsbfvfbx.com","12g4",18,"data:image/png;base64");
//    Channel channel1 = new Channel(1,1,"Minecraft evi","Oyun videosu için",500,15000);
//    Video video1 = new Video(1,1,"bölüm1","oyun başlangıcı",150,"kvnkjbnlkz",LocalDate.of(2005,10,24) ,Duration.ofHours(2).plusMinutes(30));
//    System.out.println(video1.getVideoTitle());
//    }
        User user = new User(1, "Software", "Ebubekir", "Mangal","mangalbekir1880@gmail.com","1234",18,"bjk.jpg");
        Channel channel = new Channel(1,"software","Ebubekir","Mangal","yazılım hakkında videolar",5000,200000);
        Video video = new Video(1,"software","Yazılım Kullanım Alanları.","Yazılım bölümleri arasındaki farklılıkları açıkladım",2600,"software.jpeg",LocalDate.of(2024,03,18),Duration.ofHours(1).plusMinutes(12),channel);
        Comment comment = new Comment(1,"rasimyldz6873","Kardeşim video içeriğin çok kötü.",50);
        Subscription subscription = new Subscription(1,"@serifeyaman2356",channel,Duration.ofDays(428));
    }
}