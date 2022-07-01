public class Array_2nd_maximum{
	public static void main(String [] args){
		
		int a[]={0,-8,4,3,8,5,-7};
		int maximum1=a[0];
		int maximum2=a[0];
		for(int i=0;i<a.length-1;i++){
			if(maximum1<a[i]){
				maximum2=maximum1;
				maximum1=a[i];
			}
			else if(maximum2<a[i]){
				maximum2=a[i];
			}
		}
		System.out.println(maximum2);
	}
}