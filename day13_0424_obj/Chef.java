package day13_0424_obj;

public class Chef {

//	private String name = "홍연복"; 
//		
//	public void cooking() {
//		System.out.println("요리사");
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
	
	private Chef chef;
	
	// 호텔은 생성될 때 외부에서 chef객체를 받는다
	public Hotel(Chef chef) {
		this.chef = chef;
	}
		
		//setter
		public void setChef(Chef chef) {
			this.chef = chef;
		}
		
		//getter
		public Chef getChef() {
			return chef;
		}	
	
	
	
	
}
