package kr.co.softsoldesk.beans2;

public class LgTV implements TV{
	
	private int price;
	private AppleSpeaker speaker;
	
	public LgTV() {
		System.out.println("LG TV 객체 생성");
	}
	

	public LgTV(int price, AppleSpeaker speaker) {
		
		this.price = price;
		this.speaker = speaker;
	}


	public int getPrice() {
		System.out.println("가격 : "+price);
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public AppleSpeaker getSpeaker() {
		System.out.println("speaker : "+speaker);
		return speaker;
	}


	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
	}


	@Override
	public void powerOn() {
		System.out.println("LgTV --- 전원 켠다");
		System.out.println("가격 : "+price);
		
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV --- 전원 끈다");
		
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
		
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
		
	}
	
	
}
