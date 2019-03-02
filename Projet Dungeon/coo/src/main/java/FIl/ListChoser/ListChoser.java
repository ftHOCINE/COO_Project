package FIl.ListChoser;
import FIl.scanner.*;
import java.util.*;
/**
 * @author HOCINE Ferhat, KABOUCHE Aissa
 * ListChoser allows to the user to chose an option from the list given
 */
public class ListChoser {

	public <T> T chose(String m,List<T> l){
		System.out.println(m);
		int i=0;
		for(T o:l){
			System.out.println(i++ +" - "+o.toString());
			System.out.println(" ");
			}
		int ent = ScannerInt.readInt(l.size());
		if (l.size()<ent && ent<=0)
		return null;
		else 
		return l.get(ent);
		}
		

}
