public class Array_demo{
	public static int check(int [] a,int l,int r,int x){

		if(r<1){
			return -1;
		}
		if(a[l]==x){
			return l;
		}
		if(a[r]==x){
			return r;
		}
		else{
			return check(a,l+1,r-1,x);
		}
	}
	public static void main(String[] args) {
		int [] a={10,20,30,40,50};

		int x=30;

		int index=check(a,0,a.length-1,x);

		if(index!=-1){
			 System.out.println("Element " + x + " is present at index "+ index);
		}

		else{
			System.out.println("Element " + x + " is not present");
		}
		
	}
}