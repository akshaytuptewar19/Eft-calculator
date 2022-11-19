package electricField;

import rectCords.rectCords;
import unit.unit;

public class electricField{
	
	public rectCords ef;
	public int p;
	public unit magnitude;
	public electricField(){
		ef=null;
		p=0;
		
	}
	public void pointEf(rectCords r,rectCords at,unit q) {
		double pi=3.14159;
		unit epsi=new unit(8.85418,-12);
		double radius=r.distance(at,r);
		radius=Math.pow(radius, 2);
		System.out.println("rad="+radius);
		rectCords uv=r.sub(at,r);
		uv=uv.unitvector(uv);
		System.out.println(uv.x+" "+uv.y+" "+uv.z );
		
		
		unit a=q;
		System.out.println(a.x+" "+a.p );
		a=a.div(radius*4*pi);
		System.out.println(a.x+" "+a.p );
		a=a.div(epsi);
		System.out.println(a.x+" "+a.p );
		p=a.p;
		magnitude=a;
		ef=uv.mul(a.x);
		
		
		
		
		
		return;
		
	}
	public void disp() {
		System.out.println(ef.x +"x "+ef.y+"y "+ef.z+"z");
	}
	
	public void inflineEf(rectCords r,rectCords at,unit q) {
		unit epsi=new unit(8.85,-12);
		double pi=3.1432;
		unit a;
		rectCords uv;
		double radius ;
		rectCords dis = null;
		
		if(r.z==1000000 && r.y!=1000000 && r.x!=1000000) {
			dis=new rectCords(r.x,r.y,at.z);
			
			
			
			
			
		}else if(r.x!=100000 && r.y==1000000 && r.z!=100000) {
			dis=new rectCords(r.x,at.y,r.z);
			
			
		}else if(r.x==1000000 && r.y!=1000000 && r.z!=1000000) {
			dis=new rectCords(at.x,r.y,r.z);
			
			
		}
		radius=dis.distance(at,dis);
		uv=dis.sub(at,dis);
		uv=uv.unitvector(uv);
		
		a=q.div(2*pi);
		a=a.div(epsi);
		a=a.div(radius);
		p=a.p;
		magnitude=a;
		ef=uv.mul(a.x);
		
		
}
	
	public void infsurfaceEf(rectCords r,rectCords at,unit q) {
		final unit epsi=new unit(8.85,-12);
		unit a;
		a=q;
		a=a.div(2);
		a=a.div(epsi);
		
		rectCords uv=null;
		if(r.z==0 && r.y==0 && r.x!=0) {
			uv=new rectCords(at.x,0,0);
			
			
			
			
			
		}else if(r.x==1000000 && r.y!=0 && r.z==1000000) {
			uv=new rectCords(0,at.y,0);
			
			
		}else if(r.x==1000000 && r.y==1000000 && r.z!=1000000) {
			uv=new rectCords(0,0,at.z);
			
			
		}
		uv=uv.unitvector(uv);
		
		ef=uv.mul(a.x);
		magnitude=a;
		p=a.p;
		return ;
		
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
