import java.time.Duration;
import java.time.LocalDate;

public class Playlist extends Video{

    public Playlist(int id, String userName, String title, String description, int views, String img, LocalDate loadDate, Duration duration, Channel channel, int id1, int order, String mainTitle, int videoCount) {
        super(id, userName, title, description, views, img, loadDate, duration, channel);
        this.id = id1;
        this.order = order;
        this.mainTitle = mainTitle;
        this.videoCount = videoCount;
    }

    private int id;

    private int order; // video sıralaması
    private String mainTitle;
    private int videoCount;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public int getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(int videoCount) {
        this.videoCount = videoCount;
    }
}
