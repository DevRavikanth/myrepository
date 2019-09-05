package problemsolving;

public class LnrSrchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearSearchTest lt = new LinearSearchTest();
		
		int arr[]= {12,23,34,45,65,67};
		
		int search = lt.LsinArr(arr, 67);
		
		
			  if(search == -1) {
			        System.out.print("Element is not present in array"); 
			  }
			    else
			        System.out.print("Element is present at index " + search);
		}
		
		
	}


