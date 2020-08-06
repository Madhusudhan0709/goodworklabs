import static java.util.stream.Collectors.toMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashtagsOfValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		String str = "How the Avocado Became the Fruit of the Global Trade";
		String[] words = str.split(" ");

		Map<String, Integer> unsortedMap = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < words.length; i++) {

			if (unsortedMap.get(words[i]) == null) {
				unsortedMap.put(words[i], words[i].length());
			}

		}

		Map<String, Integer> sortedMap = unsortedMap.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
				.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		int i = 0;
		for (String key : sortedMap.keySet()) {
			System.out.println("#".concat(key));
			i++;
			if (i == 3) {
				break;
			}

		}

	}

}
