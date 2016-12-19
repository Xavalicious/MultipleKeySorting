import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws IOException {
		Scanner dataTake=new Scanner(new File("E:\\MultipleKeySorting\\Names_ages.txt"));
		int maxIndx=-1;
		String[] nage=new String[100];
		while(dataTake.hasNextLine())
		{
		maxIndx++;
		nage[maxIndx]=dataTake.nextLine();	
		}
		dataTake.close();
		
		//for(int abb=0;abb<nage.length;abb++){System.out.println(nage[abb]);}
		
		ArrayList<String> organize=new ArrayList<>();
		ArrayList<String> organize1=new ArrayList<>();
		String[] names;
		for(int x=0;x<=maxIndx;x++)
		{
		names=nage[x].split("\\s+");
		organize.add(x,names[0]);
		organize1.add(x,names[1]);
		}
		
		String[] namesR=new String[organize.size()];
		for(int y=0;y<organize.size();y++)
		{
		namesR[y]=organize.get(y);	
		}
		
		String[] namesRa=new String[organize1.size()];
		for(int z=0;z<organize1.size();z++)
		{
		namesRa[z]=organize1.get(z);	
		}
		
		Sorter xav=new Sorter();
		xav.sort(namesR,namesRa);
		
		int[] namesRage=new int[namesRa.length];
		for(int co=0;co<namesRa.length;co++){
			namesRage[co]=Integer.valueOf(namesRa[co]);
			//System.out.println(namesRage[co]+"\n");
			}
		
		//for(int aaa=0;aaa<namesR.length;aaa++){System.out.println(namesR[aaa]+","+namesRa[aaa]);}
		
		ArrayList<sortObj> correct=sortNum(namesR,namesRage,maxIndx);
		for(int yop=0;yop<maxIndx;yop++){
			System.out.println(correct.get(yop).getName()+", "+correct.get(yop).getAge());
		}
	}
	
	public static ArrayList<sortObj> sortNum(String[] c, int[] d, int maxIndx1){
		ArrayList<sortObj> final2=new ArrayList<sortObj>();
		for(int adder=0;adder<maxIndx1;adder++){
			sortObj git=new sortObj(c[adder],d[adder]);
			final2.add(adder,git);
		}
		gSort(final2,maxIndx1);
		return final2;
	}
	public static void gSort(ArrayList<sortObj> ret,int maxIndx2){
		for(int ed=0;ed<10;ed++){
			int d=0;
			for(d=0;d<maxIndx2-1;d++){
				if(ret.get(d).getName().equals(ret.get(d+1).getName())){
					if(ret.get(d).getAge()>(ret.get(d+1).getAge())){
						Collections.swap(ret, d, d+1);
					}
				}
			}
		}
	}

}
