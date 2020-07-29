package June;

public class class_avg {

		double kor, eng, math;
		double avg;
		void setKor(double kor) {
			this.kor = kor;
		}
		void setEng(double eng) {
			this.eng = eng;
		}
		void setMath(double math) {
			this.math = math;
		}
		
		void getAvg() {
			this.avg = (this.kor+this.eng+this.math)/3;
			System.out.println("3과목의 평균 : "+this.avg);
		}
		
		void grade() {
			if(this.avg >= 90) {
				System.out.println("수");
			}
			else if(this.avg >= 80) {
				System.out.println("우");
			}
			else if(this.avg >= 70) {
				System.out.println("미");
			}
			else if(this.avg >= 60) {
				System.out.println("양");
			}
			else if(this.avg >= 50) {
				System.out.println("가");
			}else {
				System.out.println("꺼지십시오");
			}
		}
		
	
}
