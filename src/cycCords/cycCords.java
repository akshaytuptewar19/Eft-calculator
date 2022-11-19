
package cycCords;

import rectCords.rectCords;
import sphCords.sphCords;

public class cycCords{
	public double r;
	public double t;
	public double z;
	
	public cycCords(double x,double y,double z){
		this.r=x;
		this.t=y;
		this.z=z;
		
	}
	
	public void getData(double a,double b,double c){
		r=a;
		t=b;
		z=c;
	}
	
	public rectCords convertToRect(cycCords c) {
		double k,l;
		k=r*(Math.cos(t));
		l=r*(Math.sin(t));
		rectCords re=new rectCords(k,l,c.z);
		return re;
		
		
	}
	
	public sphCords convertToSph(cycCords c) {
		double radius= Math.pow(Math.pow(r,2)+Math.pow(c.z,2 ),0.5);
		double theta=Math.atan(radius/c.z);
		double phi=c.t;
		sphCords s=new sphCords(radius,theta,phi);
		return s; 
		
		
	}
	public void disp() {
		System.out.print(r+" "+t+" "+z);
		
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
