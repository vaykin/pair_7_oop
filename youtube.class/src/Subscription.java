import java.time.Duration;

public class Subscription extends User {

    public Subscription(int id, String userName, Channel channel, Duration duration) {
        super(id, userName); //subscriber
        this.channel = channel; //subscribed
        this.duration = duration;
    }
    public Subscription(){

    }

    private Channel channel;
    private Duration duration;

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
