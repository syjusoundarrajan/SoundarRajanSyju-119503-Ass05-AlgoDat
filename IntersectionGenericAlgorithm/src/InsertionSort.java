
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {6,2,4,5,3,1};
		int temp, m;
		for(int i=1;i<arr.length;i++) {
			temp=arr[i];
			m=i;
			while(m>0 && arr[m-1]>temp){
				arr[m]=arr[m-1];
				m=m-1;
				
			}
			arr[m]=temp;
		}
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}

	}

}
