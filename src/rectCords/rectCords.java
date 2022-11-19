
package rectCords;

import cycCords.cycCords;
import sphCords.sphCords;

public class rectCords{
		public double x;
		public double y;
		public double z;
		
		public rectCords(double x,double y,double z){
			this.x=x;
			this.y=y;
			this.z=z;
			
		}
		
		void getData(double a,double b,double c){
			x=a;
			y=b;
			z=c;
		}
		
		public cycCords convertToCyc(rectCords a) {
			double ra=Math.pow(a.x, 2)+Math.pow(a.y, 2);
			double radius=Math.pow(ra, 0.5);
			double theta=Math.atan(a.y/a.x);
			cycCords c=new cycCords(radius,theta,a.z);
			return c;
			
			
			
		}
		
		public sphCords convertToSph(rectCords a) {
			
			double b=Math.pow(a.x, 2)+Math.pow(a.y, 2)+Math.pow(a.z, 2);
			double r=Math.pow(b, 0.5);
			double theta=Math.atan(a.z/r);
			double phi=Math.atan(a.y/r);
			sphCords s=new sphCords(b,theta,phi);
			return s;
			
			
			
		}
		public double getR() {
			
			double b=Math.pow(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2),0.5);
			return b;
			
		}
		
		public rectCords unitvector(rectCords r) {
			double a=r.getR();
			rectCords u=new rectCords(r.x/a,r.y/a,r.z/a);
			return u;
		}
		
		public rectCords mul(double k) {
			
			rectCords r=new rectCords(x*k,y*k,z*k);
			
			return r;
			
		}
		public double distance(rectCords r1,rectCords r2) {
			return Math.pow(Math.pow(r1.x-r2.x, 2)+Math.pow(r1.y-r2.y, 2)+Math.pow(r1.z-r2.z, 2),0.5);
		}
		public rectCords sub(rectCords r1,rectCords r2) {
			rectCords temp=new rectCords(r1.x-r2.x,r1.y-r2.y,r1.z-r2.z);
			return temp;
		}
		
		
		public rectCords crossp(rectCords a,rectCords b) {
			rectCords s;
			double k=a.y*b.z - b.y*a.z;
			double l=b.x*a.z-b.z*a.x;
			double m=a.x*b.y - b.x*a.y;
			s=new rectCords(k,l,m);
			return s;
		}
		public rectCords dotp(rectCords a,rectCords b) {
			rectCords s;
			double k=a.x*b.x;
			double l=a.y*b.y;
			double m=a.z*b.z;
			s=new rectCords(k,l,m);
			return s;
		}
		
		
	

	 
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
