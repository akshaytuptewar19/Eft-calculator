package sphCords;

import cycCords.cycCords;
import rectCords.rectCords;

public class sphCords{
	public double r;
	public double t;
	public double p;
	
	public sphCords(double x,double y,double z){
		this.r=x;
		this.t=y;
		this.p=z;
		
	}
	
	void getData(double a,double b,double c){
		r=a;
		t=b;
		p=c;
	}
	
	public rectCords convertToRect(sphCords o) {
		double x=o.r*(Math.sin(o.p)*Math.cos(o.t));
		double y=o.r*(Math.sin(o.p)*Math.sin(o.t));
		double z=Math.cos(o.p);
		rectCords s=new rectCords(x,y,z);
		return s;
	}
	
	public cycCords convertToCyc(sphCords o) {
		double a=r*Math.sin(p);
		double z=r*Math.cos(p);
		cycCords c=new cycCords(a,t,z);
		return c;
		
	}
	
	
	
	
	
}
