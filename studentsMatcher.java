import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class studentsMatcher {
	
	public static TreeMap<String, String> findMatches(TreeMap<String, TreeSet<String>> map){
		TreeMap<String, String> matches = new TreeMap<String, String>();
		
		for(String s : map.keySet()) {
			int p = 0;
			TreeSet<String> current = map.get(s);
			int[] sCount = new int[map.keySet().size()];
			for(int i =0; i < map.keySet().size(); i++) {
				ArrayList<String> keyList = new ArrayList<>(map.keySet());
				if(s.equalsIgnoreCase(keyList.get(i)))
					continue;
				TreeSet<String> compare = map.get(keyList.get(i));
				for(String s2 : compare) {
					if(current.contains(s2))
						sCount[i]++;
				}				
			}
			int maxIndex = 0;
			int maxValue = sCount[0];
			for(int j = 1; j < sCount.length; j++) {
				if(sCount[j] > maxValue) {
					maxValue = sCount[j];
					maxIndex = j;
				}
			}
			ArrayList<String> keyList = new ArrayList<>(map.keySet());
			matches.put(s, keyList.get(maxIndex));
			p++;
		}
		return matches;
	}
}
