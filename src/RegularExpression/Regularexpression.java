package RegularExpression;

import java.util.regex.Pattern;
//Demonstration of regular expression

public class Regularexpression {
	public static void main(String[] args) {

		//[] represents only one valid character from the set
		//[^] represents 10 character from this set
	/*
System.out.println(Pattern.matches("[acd]","a"));    // true
System.out.println(Pattern.matches("[acd]","c"));    // true
System.out.println(Pattern.matches("[acd]","d"));    // true
System.out.println(Pattern.matches("[acd]","e"));    // false
System.out.println(Pattern.matches("[acd]","ac"));   // false
System.out.println(Pattern.matches("[acd]","acd"));  // false
System.out.println(Pattern.matches("[acd]","mnoa")); // false
System.out.println(Pattern.matches("[^acd]","m"));   // true
System.out.println(Pattern.matches("[^acd]","a"));   // false
    */

	/*
System.out.println(Pattern.matches("[a-z A-S]","U"));  // false
System.out.println(Pattern.matches("[a-z A-S]","B"));  // true
System.out.println(Pattern.matches("[a-z A-S]","z"));  // true
System.out.println(Pattern.matches("[^a-z A-S]","z")); // false
	*/
		
	/*
//{5}; Quantifier

System.out.println(Pattern.matches("[SM][onali]{5}","Sonali")); // true
System.out.println(Pattern.matches("[SM][onali]{5}","Monali")); // true
System.out.println(Pattern.matches("[SM][onali]{5}","Donali")); // false
System.out.println(Pattern.matches("[SM][abcde]{5}","Sabcde")); // true
System.out.println(Pattern.matches("[SM][onali]{5}","Milalo")); // true
System.out.println(Pattern.matches("[SM][onali]{5}","Mliiii")); // true
System.out.println(Pattern.matches("[SM][onali]{5}","Mzzzzz")); // false
	*/
		
    /*
// ? : represents zero or one character

System.out.println(Pattern.matches("[xyz]?","x")); // true
System.out.println(Pattern.matches("[xyz]?","")); // true
System.out.println(Pattern.matches("[xyz]?","y")); // true
System.out.println(Pattern.matches("[xyz]?","z")); // true
System.out.println(Pattern.matches("[xyz]?","xy")); // false
System.out.println(Pattern.matches("[xyz]?","xx")); // false
		 */

		/*
// + represent ONE or more character
 * 
System.out.println(Pattern.matches("[xyz]+","x")); // true
System.out.println(Pattern.matches("[xyz]+","xx")); // true
System.out.println(Pattern.matches("[xyz]+","xyz")); // true
System.out.println(Pattern.matches("[xyz]+","xxyyzz")); // true
System.out.println(Pattern.matches("[xyz]+","xya")); // false
System.out.println(Pattern.matches("[xyz]+","")); // false
		 */
		
		/*
// zero or more characters

System.out.println(Pattern.matches("[xyz]*","xyzy")); // true
System.out.println(Pattern.matches("[xyz]*","yyyyy")); // true
System.out.println(Pattern.matches("[xyz]*","zzzz")); // true
System.out.println(Pattern.matches("[xyz]*","xxyyzz")); // true
System.out.println(Pattern.matches("[xyz]*","")); // true
System.out.println(Pattern.matches("[xyz]*","xxdyyzz")); // false
		 */

		/*
// Metacharacter [0-9]

System.out.println(Pattern.matches("\\d","8")); // true
System.out.println(Pattern.matches("\\d{2}","45")); // true
System.out.println(Pattern.matches("\\d{2}","56")); // true
System.out.println(Pattern.matches("[0-9]{2}","56")); // true
System.out.println(Pattern.matches("[0-9]{2}","65")); // true
System.out.println(Pattern.matches("\\d{2}","562")); // false
System.out.println(Pattern.matches("\\d","a6")); // false

		 */

		/*

//\\ represents [0-9]

System.out.println(Pattern.matches("\\d{1,3}","1")); // true
System.out.println(Pattern.matches("\\d{1,3}","23")); // true
System.out.println(Pattern.matches("\\d{1,3}","567")); // true
System.out.println(Pattern.matches("\\d{1,3}","8768")); // false
System.out.println(Pattern.matches("\\d{1,5}","98765")); // true
System.out.println(Pattern.matches("\\d{1,5}","9")); // true
System.out.println(Pattern.matches("\\d{1,5}",",")); // false
System.out.println(Pattern.matches("\\d{0,5}","")); // true
		 */

		/*
//w: [a-z A-Z0-9]

System.out.println(Pattern.matches("\\w{1,3}","a")); // true
System.out.println(Pattern.matches("\\w{1,5}","abc1a")); // true
System.out.println(Pattern.matches("\\w{1,3}","abAB1")); // false
System.out.println(Pattern.matches("\\w{1,3}","345")); // true
System.out.println(Pattern.matches("\\w{1,3}","abcde")); // false
System.out.println(Pattern.matches("\\w{1,3}","abl")); // true
System.out.println(Pattern.matches("\\w{1,3}","123")); // true
System.out.println(Pattern.matches("\\w{1,3}","ABC")); // true
System.out.println(Pattern.matches("\\w{1,3}","abcd")); // false
System.out.println(Pattern.matches("\\w{1,3}","ab$")); // false
		 */

		/*
//\\D: [a-z A-Z]

System.out.println(Pattern.matches("\\D","1")); // false
System.out.println(Pattern.matches("\\D","12")); // false
System.out.println(Pattern.matches("\\D","A")); // true
System.out.println(Pattern.matches("\\D","a")); // true
System.out.println(Pattern.matches("\\D{1,3}","ab")); // true
System.out.println(Pattern.matches("\\D{1,3}","")); // false
System.out.println(Pattern.matches("\\D{1,3}","abcd")); // false
		 */

		/*
//represents a single character

System.out.println(Pattern.matches("..m","alm")); // true
System.out.println(Pattern.matches("alm","alm")); // true
System.out.println(Pattern.matches("alm","apq")); // false
System.out.println(Pattern.matches("...","apq")); // true
System.out.println(Pattern.matches("...","AFD")); // true
System.out.println(Pattern.matches("...","%$#")); // true
System.out.println(Pattern.matches("...","876")); // true
		 */

		/*
System.out.println(Pattern.matches(".o","monali")); // false
System.out.println(Pattern.matches("[mo][onali]{5}","monali")); // true
System.out.println(Pattern.matches(".o[nali]{4}","monali")); // true
System.out.println(Pattern.matches(".o[nali]{5}","monali")); // false
System.out.println(Pattern.matches(".o[nali]{5}","Soiilal")); // true

		 */

		/*
System.out.println(Pattern.matches("[xyz]?","")); // true
System.out.println(Pattern.matches("[xyz]?","xxx")); // false
System.out.println(Pattern.matches("[xyz]?","x")); // true
System.out.println(Pattern.matches("[xyz]?","a")); // false
System.out.println(Pattern.matches("[xyz]?","y")); // true
System.out.println(Pattern.matches("[xyz]?","z")); // true
System.out.println(Pattern.matches("[xyz]?","xy")); // false
		 */

		/*

//* represents 0 or more characters

System.out.println(Pattern.matches("[xyz]*","x")); // true
System.out.println(Pattern.matches("[xyz]*","xx")); // true
System.out.println(Pattern.matches("[xyz]*","xxyyzz")); // true
System.out.println(Pattern.matches("[xyz]*","xyxzyx")); // true
System.out.println(Pattern.matches("[xyz]*", "")); // true
System.out.println(Pattern.matches("[xyz]?","xy")); // false
		 */

	//Write a program to validate a mobile no which is of 10 digits and starts either 7/8/9

		/*

//7/8/9 552588168

System.out.println(Pattern.matches("[789][0-9]{9}","7552588168")); // true
System.out.println(Pattern.matches("[789][0-9]{9}","8552588168")); // true
System.out.println(Pattern.matches("[789][0-9]{9}","9525881681")); // true
System.out.println(Pattern.matches("[789][0-9]{9}","1552588168")); // false
System.out.println(Pattern.matches("[789][0-9]{9}","955258"));     // false
System.out.println(Pattern.matches("[789][0-9]{9}","9552581234455555")); // false
		 */
		//eg: 197-267-3345
		/*
System.out.println(Pattern.matches("[0-9]{3}[-]{1} [0-9]{3}[-]{1}[0-9]{4}","955-258-8764")); // true
System.out.println(Pattern.matches("[0-9]{3}[-]{2} [0-9]{3}[-]{1}[0-9]{4}","955-258-876")); //false
System.out.println(Pattern.matches("[0-9]{3}[-]{2} [0-9]{3}[-]{1}[0-9]{4}","955-258-8765")); //true
		 */
		/*

//find character (Upper case alphabet) and contains lower case alphabet,only one digit allowed in between
//[A-Z] [a-z]*[0-9][a*z]*

System.out.println(Pattern.matches("[A-Z][a-z]*[0-9][a-z]*","Bcyber4success")); // true
System.out.println(Pattern.matches("[A-Z][a-z]*[0-9][a-z]*","Bcybersuccess")); // false
System.out.println(Pattern.matches("[A-Z][a-z]*[0-9][a-z]*","Acyber4success")); // true
System.out.println(Pattern.matches("[A-Z][a-z]*[0-9][a-z]*","ABcyber4success")); // false
		 */

		//validation of an email
		//sonali789@gmail.com or monali@gmail.org or cybersuccess@gmail.edu

		System.out.println(Pattern.matches("a-z A-z 0-9]+[@]{1}gmail\\.[com|org|edu]*","sonali123@gmail.com")); // true
		System.out.println(Pattern.matches("a-z A-z 0-9]+[@]{1}gmail\\.[com|org|edu]+","sonali123@gmail.com")); // true
		System.out.println(Pattern.matches("a-z A-z 0-9]+[@]{1}gmail\\.[com|org|edu]?","sonali123@gmail.com")); // true
		System.out.println(Pattern.matches("a-z A-z 0-9]+[@]{1}gmail\\.[com|org|edu]+","sonali123@gmail.com")); // true
		System.out.println(Pattern.matches("a-z A-z 0-9]+[@]{1}gmail\\.[com|org|edu]+","sonali123@gmail.com")); // true

		System.out.println(Pattern.matches("a-z A-z 0-9]+[@]{1}gmail\\.[com|org|edu]+","sonali123@gmail.com")); // true
		System.out.println(Pattern.matches("a-z A-z 0-9]+[@]{1}gmail\\.[com|org|edu]+","sonali123@gmail.com")); // true
		System.out.println(Pattern.matches("a-z A-z 0-9]+[@]{1}gmail\\.[com|org|edu]+","sonali123@gmail.com")); // true
		System.out.println(Pattern.matches("a-z A-z 0-9]+[@]{1}gmail\\.[com|org|edu]+","sonali123@gmail.com")); // true
		System.out.println(Pattern.matches("a-z A-z 0-9]+[@]{1}gmail\\.[com|org|edu]+","sonali123@gmail.com")); // true
		System.out.println(Pattern.matches("a-z A-z 0-9]+[@]{1}gmail\\.[com|org|edu]+","sonali123@gmail.com")); // true

		System.out.println(Pattern.matches("a-z A-z 0-9]+[@]{1}gmail\\.[com|org|edu]+","sonali123@gmail.com")); // true
		System.out.println(Pattern.matches("a-z A-z 0-9]+[@]{1}gmail\\.[com|org|edu]+","sonali123@gmail.com")); // true

	}
}  

