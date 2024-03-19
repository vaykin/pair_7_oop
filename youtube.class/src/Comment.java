public class Comment extends User{

 public Comment(int id, String userName, String text, int likes) {
  super(id, userName);
  this.text = text;
  this.likes = likes;
 }
 public Comment(){

 }
 private String text;
 private int likes;

 public String getText() {
  return text;
 }

 public void setText(String text) {
  this.text = text;
 }

 public int getLikes() {
  return likes;
 }

 public void setLikes(int likes) {
  this.likes = likes;
 }
}
