package dao;

import dto.게시판Bag;
import dto.회원Bag;

public class 게시판DAO {
	
	public void create(게시판Bag bag) {
	System.out.println("전달된 id는 " + bag.getId());	
	System.out.println("전달된 date는 " + bag.getDate());	
	System.out.println("전달된 title는 " + bag.getTitle());	
	System.out.println("전달된 content는 " + bag.getContent());
	

}
}