
package shop.dto;

public class 게시판Bag {
	private String id;
	private String date;
	private String title;
	private String content;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "게시판Bag [id=" + id + ", date=" + date + ", title=" + title + ", content=" + content + "]";
	}
	

	
	
	

}
