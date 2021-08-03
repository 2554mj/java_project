package 생성자;

public class MemberBag {
	String id;
	String no;
	String name;
	String tel;

	public MemberBag(String id, String no, String name, String tel) {
		super();
		this.id = id;
		this.no = no;
		this.name = name;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "MemberBag [id=" + id + ", no=" + no + ", name=" + name + ", tel=" + tel + "]";
	}

}
