package il.ac.mta;
import java.io.IOException;




import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class MyNewServlet extends HttpServlet{



protected void doGet(HttpServletRequest req,HttpServletResponse resp)
		throws ServletException,IOException {
	resp.setContentType("text/html");
	//resp.getWriter().println("Hello my new Servlet");
	int var1 = 50;
    double radius = (var1*var1) * Math.PI;
	int hypotenuse = 50;
	int degrees=30;
	
	double radian = Math.sin(Math.toRadians(degrees));
	double length = radian*hypotenuse;
	
	int base = 20;
	int exp = 13;
  	float rst = power(base,exp);

  	
  	String line1 = new String ("<b>calculation 1: Area of circle with radius  "+var1+  " is " +radius+  " square-cm ");
	String line2 = new String ("calculation 2: Length of opposite where angle B is 30 degrees and Hypotenuse lengh is 50 cm is: "+ length+ " cm ");
	String line3 = new String ("calculation 3: Power of "+base+" with exp of "+exp+ " is result: "+rst);
	
	String resultStr = line1 + "<br>" + line2 + "<br>" + line3;	
			
		resp.getWriter().println(resultStr);	


}



	public float power(int base, int exp) {

	    if (exp > 1) {
	    	return (base*power(base,exp-1));
	    }
	    if (exp == 0) { return 1;}
	    	return base;
}
	
}