package javaExampletest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class PatientTest {

	public static void main(String[] args) {
		
		List<Patient> g = new ArrayList<Patient>();
		
		g.add(new Patient("suresh",124,"guntur"));
		g.add(new Patient("suresh1",125,"guntur"));
		g.add(new Patient("suresh2",126,"guntur"));
System.out.println(g);
		Iterator<Patient> itr = g.iterator();
		while(itr.hasNext()) {
			Patient p= (Patient) itr.next();
			
			if(p.getId()==125) {
				itr.remove();
				
			}
			//System.out.println(p);
		}//we can't use iterator two time only onetime
		 itr = g.iterator();
		while(itr.hasNext()) {
System.out.println(itr.next());
		}
		//System.out.println(g);
		g.add(new Patient("vasu",125,"meghana"));
		ListIterator<Patient> j = g.listIterator();
		while(j.hasNext()) {
			Patient h= (Patient) j.next();
			h.setAddress("Guntur");
			j.set(h);
		}
System.out.println(g);

     Map<Integer, String> k =new HashMap<Integer, String>();
		
		for(Patient d : g) {
			k.put( d.getId(), d.getName());
		}
System.out.println("\n"+k);
int y=0;
//Iterating Map elements
for(Map.Entry<Integer, String> en : k.entrySet()) {
	System.out.println(en.getKey()+" : "+en.getValue());
	y++;
}



	}
	

}
