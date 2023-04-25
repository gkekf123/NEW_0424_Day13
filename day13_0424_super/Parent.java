package day13_0424_super;

public class Parent {

	String mother;
	String father;
	
	Parent(String mother, String father) {
		this.mother = mother;
		this.father = father;
	}	
	
	String info() {
		return "name:" + mother + ", name:" + father;
	}
	
	
	
	
}
