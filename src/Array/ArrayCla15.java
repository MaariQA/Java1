// occurred no
package Array;
public class ArrayCla15 {
	public static void main(String[] args) {
		long no = 94798654479967540l;
		long orgNo = no;
		long r;             // int occ=0;
		for(int i=0; i<10;i++){
			int cnt =0;
			no = orgNo;
			while(no!=0) {
				r = no % 10;
				if( r==i)
				cnt++;
				no= no/10;
			}
			System.out.println(i+" occurred "+cnt+" time");
		}}}

