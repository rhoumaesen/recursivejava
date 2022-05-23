class Main {
  public static void main(String[] args) {
    System.out.println(factorial(5));
		System.out.println(factorialiter(5));
		System.out.println(power(5,3));
		System.out.println(gcd(17,97));
		int [] arr= {20,30,40,50,60,70,100};
		
		
		
		
		System.out.println( "- - - search - - -"  );
		System.out.println(seqsearch(arr,45));
		System.out.println(binsearch(arr,45));

   
  }
  public static int binsearch(int[] arr, int target) {
		int left =0;
		int right = arr.length -1;
		while(left <= right) {
			int mid =(left + right)/2;
			if (target ==arr[mid])
				return mid;
			else if (target < arr[mid]) 
				right =mid-1;
			else
				left =mid+1;
			
				
		}
		return -1;
	}
	
	public static int seqsearch(int[] arr, int target) {
		for (int i=0; i<arr.length; i++) {
			if (target == arr[i])
				return i;
		}
		return -1;
				
		
	}
	
	
	public static int gcd(int m, int n) {
		if(m % n ==0)
			return n;
		else if (m < n)
			return gcd(n,m);
		else
			return gcd(n,m % n);
		
	}
	public static double power(int x, int n) {
		if(n==0)
			return 1;
		else 
			return x * power(x,n-1);
		
	}
	
	public static double factorial(int n) {
		if (n==0)
			return 1;
		else
			return n * factorial(n-1);
		
	}
	public static double factorialiter(int n) {
		if (n==0)
			return 1;
		else {
			double f=1;
			for(int i=1; i<=n;i++) {
				f=f * i;
			}
			return f;
		}
	}

}