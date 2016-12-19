import java.util.ArrayList;



public class Sorter {
	public void sort(String[] a,String[] b){
		
		String min;
		String min1;
		int minIndex;
		for(int i=0;i<a.length;i++){
			min=a[i];
			min1=b[i];
			minIndex=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j].charAt(0)<min.charAt(0)){
					min=a[j];
					min1=b[j];
					minIndex=j;
				}
			}
		
			a[minIndex]=a[i];
			b[minIndex]=b[i];
			a[i]=min;
			b[i]=min1;
		}
	}
	
	
	
}


