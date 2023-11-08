import java.io.FileNotFoundException;
import java.util.TreeMap;
import java.util.TreeSet;

public class test {

	public static void main(String[] args) throws FileNotFoundException {
		TreeMap<String, TreeSet<String>> map = myFileReader.readToTreeMap("Movies.csv");
		TreeMap<String, String> mapMatches = studentsMatcher.findMatches(map);
		for(String s : mapMatches.keySet()) {
			System.out.print(s+": "+mapMatches.get(s)+"\n");
		}
	}

}
