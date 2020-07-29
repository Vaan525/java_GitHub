package java_GitHub;

public class StarPrint {

	int a;
	
	StarPrint(int a){
		this.a = a;
	}

	public void setFloor(int b) {
		this.a = b;
	}
	
	public void floorshow() {
		for (int i = 0; i < a; i++) {
			for(int k = a; k >= i; k--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*"+" ");
			}System.out.println(" ");
		}
	}
	

	
	
	
}
