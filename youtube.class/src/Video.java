import java.time.Duration;
import java.time.LocalDate;

public class Video extends User {

  public Video(int id, String userName, String title, String description, int views, String img, LocalDate loadDate, Duration duration,Channel channel) {
    super(id, userName);
    this.title = title;
    this.description = description;
    this.views = views;
    this.img = img;
    this.loadDate = loadDate;
    this.duration = duration;
  }
  public Video(){

  }
  private String title;
  private String description;
  private int views;
  private String img;
  private LocalDate loadDate;
  private Duration duration;
  private Channel channel;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getViews() {
    return views;
  }

  public void setViews(int views) {
    this.views = views;
  }

  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public LocalDate getLoadDate() {
    return loadDate;
  }

  public void setLoadDate(LocalDate loadDate) {
    this.loadDate = loadDate;
  }

  public Duration getDuration() {
    return duration;
  }

  public void setDuration(Duration duration) {
    this.duration = duration;
  }

  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }
}
