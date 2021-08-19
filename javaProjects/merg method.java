public static int [] merge(int arra[],int arrb[]){
		int arrc[]=new int[arra.length+arrb.length];
		
		int n=0,m=0;
		boolean b=true,r=true;
		 for(int i=0;i<arra.length+arrb.length;i++){
			if((arra[n]<=arrb[m]||(arra[n]>arrb[m]&&!r))&&b)
				{
				arrc[i]=arra[n];
				n++;
				if(n==arra.length)
					{b=false; n--;}
				}
			else if((arrb[m]<=arra[n]||(arrb[m]>arra[n]&&!b))&&r)
				{
				arrc[i]=arrb[m];
				m++;
				if(m==arrb.length)
					{r=false; m--;}
				}

			
		}
		return arrc;