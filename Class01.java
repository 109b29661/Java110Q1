	class Java110Q1{
		double a(int r) {
			return (4 * 3.14159 * r * r * r )/3;
			
		}
		int a(int x,int y,int z) {
			return(x*y+y*z+z*x)*2;
		}
	}
public class Class01 {
	public static void main(String[] args) {
		Cal_area b= new Cal_area();
		  java.text.DecimalFormat nf = new java.text.DecimalFormat("#.#");
		  
		double area;
		area = b.a(10);
		
		
		System.out.println("半徑 = 10");
		System.out.println("球形體積 = "+ area);
		
		area = b.a(4,5,6);
		System.out.println("長 = 4,寬 = 5,高 = 6");
		System.out.println("立方體表面積 = "+ area);
	}

	
}
