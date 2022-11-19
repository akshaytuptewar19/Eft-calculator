package unit;

public class unit {

	 
			public double x;
			public int p;
			
			public unit(double a,int p){
				x=a;
				this.p=p;
			}
			public unit mul(unit u1) {
				double a=x*u1.x;
				 int po=u1.p +p;
				
				while( a>10) {
					a=a/10;
					po++;
				}
				unit u=new unit(a,po);
				return u;
				
			}
			public unit mul(double k) {
				double a=x*k;
				int po=0;
				
				
				while( a>10) {
					a=a/10;
					po++;
				}
				if(a<1) {
					while(a<1 && a>0 ) {
						a=a*10;
						po--;
					}
				}
				
				unit u=new unit(a,p);
				return u;
				
			}
			public unit div(unit u1) {
				double a=x/u1.x;
				int po=p-u1.p;
				while( a>10) {
					a=a/10;
					po++;
				}
				if(a<1) {
					while(a<1 && a>0 ) {
						a=a*10;
						po--;
					}
				}
				unit u=new unit(a,po);
				return u;
			}
			public unit div(double k) {
				double ans=x/k;
				if(ans<1) {
					while(ans<1 && ans>0 ) {
						ans=ans*10;
						p--;
					}
				}
				unit u=new unit(ans,p);
				return u;
				
			}
			
			
		}


