package java_GitHub;

public class Gugudan {

	private int a; // 7 > 8·Î ¹Ù²ñ
	
	Gugudan(int a){
		this.a = a;
	}
	
	public void setDan(int b) {
		this.a = b;
	}
	
	public void show() {
		for(int i = 1; i <= 9; i++) {
			for(int j = a; j <= a; j++) {
				System.out.print(j+" X "+i+" = "+j*i+"\t");
			}System.out.println();
		}
	}
	
	
	
	
}
