class GFG {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int year=s.nextInt();
	    if (year%100==0){
	        if (year%400==0){
	            System.out.println("leap year");
	        }else{
	            System.out.println("not a leap year");
	        }
	    }else{
	        if(year%4==0){
	            System.out.println("leap year");
	        }else{
	            System.out.println("not a leap year");
	        }
	    }
	
	}
}
