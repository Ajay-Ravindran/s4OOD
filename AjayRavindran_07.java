class AjayRavindran_07 {
	public static void main(String[] arguments) {
		int i,j,k;	
	        for(i=0;i<6;i++){
				for(j=5-i;j>0;j--)
					System.out.print("  ");
				for(k=0;k<=2*i;k++)
					if(k>=3 && k<=2*i-3)
						System.out.print("  ");
					else
						System.out.print("1 ");
				System.out.println();
			}
			for(i=5;i>0;i--){
				for(j=5-i;j>=0;j--)
					System.out.print("  ");
				for(k=0;k<=(2*i)-2;k++)
					if(k>=3 && k<=(2*i-5))
						System.out.print("  ");
					else
						System.out.print("1 ");
				System.out.println();
			}
      	}
    }
