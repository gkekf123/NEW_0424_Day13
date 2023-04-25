package day13_0424_obj;

public class MainClass {

	public static void main(String[] args) {
		
//		Hotel h = new Hotel();
//		
//		//Chef를 생성해서 Hotel한테 전달
//		//Chef chef = new Chef();
//		h.setChef(new Chef());
//		
//		Chef c = h.getChef(); //Hotel안에 있는 Chef를 꺼냄
//		c.cooking();
			
		Chef c = new Chef();
		
		//사용하는 곳(생성하는 곳
		Hotel h = new Hotel(c);	//객체를 생성자로 받는다/ 변수로 객체를 준다
	
		Chef chef = h.getChef();	//메서드의 반환유형을 보는 습관을 들이면 쉽다, 마우스 올리면 맨 앞이 반환타임
		chef.cooking();	// chef안에 들어있는 기능
		//System.out.println(c == chef); //true
		
		
		
		
		
		
	}
}
