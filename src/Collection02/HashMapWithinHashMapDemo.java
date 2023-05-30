package Collection02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapWithinHashMapDemo {

	private static Iterator<String> iter1;

	public static void main(String[] args) {
		Map<String,Map<String,String>> map = new HashMap<>();

		@SuppressWarnings({ "rawtypes", "unchecked" })
		Map<String,String> hdfcM1 = new HashMap()
		{
			{
				put("coo","coo@hdfc.com");
				put("ceo","ceo@hdfc.com");
			}
		};
		@SuppressWarnings
		({ "serial", "unchecked" })
		Map<String,String> citiM1 = new HashMap()
		{
			{
				put("cto","cto@citi.com");
				put("cfo","cfo@citi.com");
			}
		};
		@SuppressWarnings("unchecked")
		Map<String,String> sbiM1 = new HashMap()
		{
			{
				put("BH","cto@sbi.com");
				put("ABH","cfo@sbi.com");
			}
		};

		@SuppressWarnings("unchecked")
		Map<String,String> axisM1 = new HashMap()
		{
			{
				put("clerk1","clerk@axis.com");
				put("clerk2","clerk2@axis.com");
			}
		};
		map.put("hdfc", hdfcM1);
		map.put("citi", citiM1);
		map.put("sbi", sbiM1);
		map.put("axis", axisM1);


		/* System.out.println(map);
	  System.out.println(hdfcM1);
	  System.out.println(citiM1);
	  System.out.println(sbiM1);
	  System.out.println(axisMi);
		 */

		Set<String> ks = map.keySet();
	//	System.out.println(ks);

		Iterator<String> iter = ks.iterator();
		while(iter.hasNext())
		{
			String k = iter.next();
			System.out.println(k);

			Map<String, String> iMap = map.get(k);
	//		System.out.println(iMap);
			Set<String> iKs = iMap.keySet();
			Iterator<String> iter1 = iKs.iterator();
			while(iter1.hasNext())
			{
				String k1 = iter1.next();
				String v1= iMap.get(k1);
				System.out.println(k1 + ":" + v1);
			}
		}
	}
}

