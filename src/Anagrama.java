import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Anagrama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<String> words= new ArrayList<String>();
	words.add("HOLA");
	words.add("ALAaaa");
	words.add("soidaa");
	words.add("osooaa");
	words.add("soida");
	
	ArrayList<String>  queries= new ArrayList<String>();
	queries.add("ALOH");
	queries.add("adiSO");
	queries.add("oooS");
	
	getSearchResult(words,queries);
	
	System.out.println(getSearchResult(words,queries));
	
	}
	
	static ArrayList<ArrayList<String>> getSearchResult(ArrayList<String> words, ArrayList<String>  queries){
		/*
		 * this is a main program retorn a ArrayList of a Anagrama. 
		 * [[palabras similar al queri],[palabras similar al queri]]
		 */
		ArrayList<ArrayList<String>> searchResult= new ArrayList<ArrayList<String>>();
		
		for (String wordQueri : queries) {
			String wordQueriArray = sordWord(wordQueri);
			ArrayList<String> resultWordFound= new ArrayList<String>();
			for (String wordToLook : words) {
				String wordArray = sordWord(wordToLook);
				if (equalString(wordArray, wordQueriArray)) {
					returnQueriWordResult(wordToLook, resultWordFound);
					}
				}
			returnQueriWordResult(resultWordFound, searchResult);
			}
	return 	searchResult;
	}
		
	static String sordWord(String word){
		/*	Create a function to return a ordered String from a unordered String
		 * 	using an Array of Character and methods toCharArray(),sort, new String(characterInArray)
		 */
		char[] characterInArray= word.toLowerCase().toCharArray();
		Arrays.sort(characterInArray);
		String orderedWord = new String(characterInArray);
		return orderedWord;
		}
	
	static boolean equalString(String word1, String queri) {
		/*
		 * return true if the String 1 is equal String 2
		 */
		boolean result= word1.equals(queri);
		return result;
		}
	
	static ArrayList<String> returnQueriWordResult(String word, ArrayList<String> resultWordFound){
		/*
		 * add a String to ArrayList
		 */
		resultWordFound.add(word);
		return resultWordFound;
		}
	
	
	
	static ArrayList<ArrayList<String>> returnQueriWordResult(ArrayList<String> resultWordFound, ArrayList<ArrayList<String>> searchResult){
		/*
		 * Add a ArrayList inside of a ArrayList type ArrayList<ArrayList<String>>
		 */
		searchResult.add(resultWordFound);
		return searchResult;
		}
	
}
