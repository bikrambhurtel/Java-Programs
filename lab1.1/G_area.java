//G_area.java
import java.util.*;
class G_area{
	public static void main(String []args){
		final float PI = 3.14f;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of the circle: ");
		float r = sc.nextFloat();
		float area = PI*r*r;
		float perimeter = 2*PI*r;
		System.out.println("The area is: "+area+" and the perimeter is: "+perimeter);

	}
}