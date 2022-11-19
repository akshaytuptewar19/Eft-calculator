package coordinate;

import electricField.electricField;
import rectCords.rectCords;
import unit.unit;

public class cords {

	public cords() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		rectCords a=new rectCords(2,-1,3);
//		rectCords b=new rectCords(0,0,0);
//		unit charge=new unit(5,-9);
//		electricField E=new electricField();
//		E.pointEf(a, b, charge);
//		System.out.println(E.ef.z);
		
		
		
		
		
		
		
		
	

	}

}


// public class rectCords{
//	public double x;
//	public double y;
//	public double z;
//	
//	public rectCords(double x,double y,double z){
//		this.x=x;
//		this.y=y;
//		this.z=z;
//		
//	}
//	
//	void getData(double a,double b,double c){
//		x=a;
//		y=b;
//		z=c;
//	}
//	
//	cycCords convertToCyc(rectCords a) {
//		double ra=Math.pow(a.x, 2)+Math.pow(a.y, 2);
//		double radius=Math.pow(ra, 0.5);
//		double theta=Math.atan(a.y/a.x);
//		cycCords c=new cycCords(radius,theta,a.z);
//		return c;
//		
//		
//		
//	}
//	
//	sphCords convertToSph(rectCords a) {
//		
//		double b=Math.pow(a.x, 2)+Math.pow(a.y, 2)+Math.pow(a.z, 2);
//		double r=Math.pow(b, 0.5);
//		double theta=Math.atan(a.z/r);
//		double phi=Math.atan(a.y/r);
//		sphCords s=new sphCords(b,theta,phi);
//		return s;
//		
//		
//		
//	}
//	double getR() {
//		
//		double b=Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2);
//		return b;
//		
//	}
//	
//	rectCords unitvector(rectCords r) {
//		double a=r.getR();
//		rectCords u=new rectCords(r.x/a,r.y/a,r.z/a);
//		return u;
//	}
//	
//	rectCords mul(double k) {
//		rectCords r=new rectCords(x*k,y*k,z*k);
//		return r;
//		
//	}
//	double distance(rectCords r1,rectCords r2) {
//		return Math.pow(Math.pow(r1.x-r2.x, 2)+Math.pow(r1.y-r2.y, 2)+Math.pow(r1.z-r2.z, 2),0.5);
//	}
//	rectCords sub(rectCords r1,rectCords r2) {
//		rectCords temp=new rectCords(r1.x-r2.x,r1.y-r2.y,r1.z-r2.z);
//		return temp;
//	}
//	
//	
//}
//
//
//
//
//
//
// public class unit{
//	public double x;
//	public int p;
//	
//	public unit(double a,int p){
//		x=a;
//		this.p=p;
//	}
//	unit mul(unit u1) {
//		double a=x*u1.x;
//		 int po=u1.p +p;
//		
//		while( a>10) {
//			a=a/10;
//			po++;
//		}
//		unit u=new unit(a,po);
//		return u;
//		
//	}
//	unit mul(double k) {
//		double a=x*k;
//		
//		
//		while( a>10) {
//			a=a/10;
//			p++;
//		}
//		unit u=new unit(a,p);
//		return u;
//		
//	}
//	unit div(unit u1) {
//		double a=x/u1.x;
//		int po=p-u1.p;
//		unit u=new unit(a,po);
//		return u;
//		
//	}
//	unit div(double k) {
//		double ans=x/k;
//		if(ans<1) {
//			while(ans<1 && ans>0 ) {
//				ans=ans*10;
//				p--;
//			}
//		}
//		unit u=new unit(ans,p);
//		return u;
//		
//	}
//	
//	
//}
// class charge{
//	int s;
//	unit u;
//	charge(unit u,int s){
//		this.s=s;
//		this.u=u;
//	}
//	charge(){
//		s=0;
//		
//	}
//}
//
//
// public class electricField{
//	
//	public rectCords ef;
//	int p;
//	unit magnitude;
//	public electricField(){
//		ef=null;
//		p=0;
//		
//	}
//	public void pointEf(rectCords r,rectCords at,unit q) {
//		double pi=3.14159;
//		unit epsi=new unit(8.85418,-12);
//		double radius=r.distance(at,r);
//		radius=Math.pow(radius, 2);
//		rectCords uv=r.sub(at,r);
//		uv=uv.unitvector(uv);
//		
//		unit a=q;
//		a=a.div(radius*4*pi);
//		a=a.div(epsi);
//		p=a.p;
//		magnitude=a;
//		ef=uv.mul(a.x);
//		
//		
//		
//		return;
//		
//	}
//	void disp() {
//		System.out.println(ef.x +"x "+ef.y+"y "+ef.z+"z");
//	}
//	
//	void inflineEf(rectCords r,rectCords at,unit q) {
//		unit epsi=new unit(8.85,-12);
//		double pi=3.1432;
//		unit a;
//		rectCords uv;
//		double radius ;
//		rectCords dis = null;
//		
//		if(r.z==0 && r.y!=0 && r.x!=0) {
//			dis=new rectCords(r.x,r.y,at.z);
//			
//			
//			
//			
//			
//		}else if(r.x!=0 && r.y==0 && r.z!=0) {
//			dis=new rectCords(r.x,at.y,r.z);
//			
//			
//		}else if(r.x==0 && r.y!=0 && r.z!=0) {
//			dis=new rectCords(at.x,r.y,r.z);
//			
//			
//		}
//		radius=dis.distance(at,dis);
//		uv=dis.unitvector(dis);
//		
//		a=q.div(2*pi);
//		a=a.div(epsi);
//		a=a.div(radius);
//		p=a.p;
//		ef=uv.mul(a.x);
//		
//		
//}
//	
//	void infsurfaceEf(rectCords r,charge q) {
//		final unit epsi=new unit(8.85,-12);
//		unit a;
//		a=q.u;
//		a=a.div(2);
//		a=a.div(epsi);
//		double radius=r.getR();
//		rectCords ans=new rectCords(0,0,r.z/radius);
//		ans=ans.mul(a.x);
//		ef=ans;
//		p=a.p;
//		return ;
//		
//		
//	}
//}
//
// class MagneticFeild{
//	charge m;
//	
//	charge inflineMf(rectCords r,charge q){
//		unit a=q.u;
//		final double pi=3.1432;
//		
//		cycCords c=r.convertToCyc(r);
//		a=a.div(2*pi*c.r);
//		charge m=new charge(a,q.s);
//		return m;
//		
//		
//	}
//	
//}


