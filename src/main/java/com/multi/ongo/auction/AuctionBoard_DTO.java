package com.multi.ongo.auction;

import java.sql.Date;

public class AuctionBoard_DTO {
	private int auction_number ;       // 경매번호(게시글번호)
	private String member_id;               //작성자
	private String auction_category;     //상품카테고리
	private String auction_state;       //경매상태(입찰중,경매완료
	private String auction_title;	//경매제목
	private int hits ;	//조회수
	private Date write_date ;	//작성일+경매시작시간
	private String board_content;	//경매내용
	private String list_photo ;	//작성사진
	private String min_price ; // 경매 최소가
	private String start_price ;	//시작가
	private String end_price;	//낙찰가
	private String add_user1 ;	//입찰자 id1
	private String  add_price1 ;//입찰금액1
	private String add_time1 ;	//입찰등록 시간
	private String add_user2 ;//낙찰자 id2
	private String add_price2;	//입찰금액2
	private String add_time2 ;	//입찰등록 시간
	private Date end_date ;		//마감일(24시간)
	
	public AuctionBoard_DTO(){
		
	}
}
   
	
	
	
	
	
	
	public int getAuction_number() {
		return auction_number;
	}
	public void setAuction_number(int auction_number) {
		this.auction_number = auction_number;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getAuction_category() {
		return auction_category;
	}
	public void setAuction_category(String auction_category) {
		this.auction_category = auction_category;
	}
	public String getAuction_state() {
		return auction_state;
	}
	public void setAuction_state(String auction_state) {
		this.auction_state = auction_state;
	}
	public String getAuction_title() {
		return auction_title;
	}
	public void setAuction_title(String auction_title) {
		this.auction_title = auction_title;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public Date getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public String getList_photo() {
		return list_photo;
	}
	public void setList_photo(String list_photo) {
		this.list_photo = list_photo;
	}
	public String getMin_price() {
		return min_price;
	}
	public void setMin_price(String min_price) {
		this.min_price = min_price;
	}
	public String getStart_price() {
		return start_price;
	}
	public void setStart_price(String start_price) {
		this.start_price = start_price;
	}
	public String getEnd_price() {
		return end_price;
	}
	public void setEnd_price(String end_price) {
		this.end_price = end_price;
	}
	public String getAdd_user1() {
		return add_user1;
	}
	public void setAdd_user1(String add_user1) {
		this.add_user1 = add_user1;
	}
	public String getAdd_price1() {
		return add_price1;
	}
	public void setAdd_price1(String add_price1) {
		this.add_price1 = add_price1;
	}
	public String getAdd_time1() {
		return add_time1;
	}
	public void setAdd_time1(String add_time1) {
		this.add_time1 = add_time1;
	}
	public String getAdd_user2() {
		return add_user2;
	}
	public void setAdd_user2(String add_user2) {
		this.add_user2 = add_user2;
	}
	public String getAdd_price2() {
		return add_price2;
	}
	public void setAdd_price2(String add_price2) {
		this.add_price2 = add_price2;
	}
	public String getAdd_time2() {
		return add_time2;
	}
	public void setAdd_time2(String add_time2) {
		this.add_time2 = add_time2;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	

		
	
