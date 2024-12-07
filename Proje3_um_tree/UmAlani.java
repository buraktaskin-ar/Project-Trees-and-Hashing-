package Proje3_um_tree;



import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;




public class UmAlani {



	UmAlani left;
	UmAlani right;
	String name;
	String city;
	int year;
	List<String> wordList  ;
	String text;
	static int numberOfNode;


	public UmAlani(String name, String city, int year, String text  ){
		this.name = name;
		this.city = city;
		this.year = year;
		this.text = text;
		wordList = this.extractWords();
		numberOfNode++;
	}

	private List<String> extractWords(){

		List<String> wordList = new ArrayList<>();
		StringTokenizer tokenizer = new StringTokenizer(text, " ,.:");
		while (tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			wordList.add(word);
		}

		return wordList;
	}


	@Override
	public String toString() {
		return "UmAlanı: " +
			"name='" + name + '\'' +
			", City='" + city + '\''+
			", Year='" + year + '\''+
			", text='" + text + '\''
			;
	}


























}
