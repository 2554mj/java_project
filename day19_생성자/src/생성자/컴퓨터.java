package 생성자;

public class 컴퓨터 {
	int price;
	String company;
	int mosize;
	
	public 컴퓨터(int price, String company, int mosize) {
		super();
		this.price = price;
		this.company = company;
		this.mosize = mosize;
	}
	
	@Override
	public String toString() {
		return "컴퓨터 [가격=" + price + ", 제조회사=" + company + ", 모니터크기=" + mosize + "]";
	}
}
