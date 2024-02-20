
/* Project: Lab 2: Git
* Class: UniqueWords.java
* Author: Brandon Khan
* Date: February 20th, 2024
*  This program counts the number of distinct elements in an ArrayList<String>
*/

import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  
	  for (int i = 0; i < list.size(); i++) {
          boolean isUnique = true; 
          for (int j = 0; j < i; j++) { // Check previous elements for duplicates
              if (list.get(i).equals(list.get(j))) { // If duplicate found, set flag to false
                  isUnique = false;
                  break; 
              }
          }
          if (isUnique) {
              count++; 
          }
      }
      return count;
  }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
