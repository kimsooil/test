package test;

public class sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] alist= {3,8,91,17,2,11,1};
        System.out.println("Unsorted array:");
        for(int element: alist)
             System.out.print(element + " ");
        System.out.println();

        selectionSort(alist);

        System.out.println("Sorted array:");
        for(int element: alist)
              System.out.print(element + " ");
        System.out.println();		
	}
	static void selectionSort( Comparable[] list )
	{
			
			  for(int i=0; i<list.length-1; i++)
			  {
			     int min = i;
			     for(int j=i+1; j<list.length; j++)
			     {
					if(list[min].compareTo(list[j]) > 0)
					min = j;
			     }
			     if( min != i){
			    	 Comparable temp = list[min];
			    	 list[min] = list[i];
			    	 list[i] = temp;
			     }
			     //System.out.println(Arrays.toString(list));
			  }
	}
}
