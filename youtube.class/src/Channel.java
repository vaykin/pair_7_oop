public class Channel extends User{

    public Channel(int id, String userName, String firstName, String surName, String about, int totalCount, int totalViews) {
        super(id, userName, firstName, surName);
        this.about = about;
        this.totalCount = totalCount;
        this.totalViews = totalViews;
    }
    public Channel(){

    }

    private String name;
    private String about;
    private int totalCount;
    private int totalViews;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }
}
