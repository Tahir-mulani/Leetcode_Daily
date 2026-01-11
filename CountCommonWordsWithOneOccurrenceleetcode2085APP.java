import java.util.*;
public class CountCommonWordsWithOneOccurrenceleetcode2085APP
{
	public static void main(String x[])
	{
		String []words1 = {"leetcode","is","amazing","is"};
		String []words2 = {"amazing","leetcode","is"};
		
		int result = countWords(words1,words2);
		System.out.println("Count is : "+result);
		
	}
	public static int countWords(String []words1,String []words2)
	{
		int count = 0;
		
		Map<String , Integer> map1 = new HashMap<>();
		Map<String , Integer> map2 = new HashMap<>();
		
		//count words in words1
		for(String word : words1){
			map1.put(word,map1.getOrDefault(word, 0)+1);
		}
		
		//count words in words2
		for(String words : words2){
			map2.put(words,map2.getOrDefault(words, 0)+1);
		}
		
		//Check common words with frequency = 1
		for(String word : map1.keySet()){
			if(map2.containsKey(word) && map1.get(word) == 1 && map2.get(word) == 1){
				count++;
			}
		}
		return count;
	}
}
		
 