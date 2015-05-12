
import java.util.Arrays;

public class Anagrmtest 
{
        public static void main(String[] args)
    {
        System.out.println(" Is Anagram :" + checkAnagram("ababa", "aiseha"));
        System.out.println(" Is Anagram :" + checkAnagram("ababa", "baaab"));
        System.out.println(" Is Anagram :" + checkAnagram("DataStructure", "dstarutctuare"));
        System.out.println(" Is Anagram :" + checkAnagram("ababa", "babaa"));
    }
    public static boolean checkAnagram(String Str, String Str1)
    {        
        char[] temp = new char[Str.length()];
        char[] temp1 = new char[Str1.length()];
        for (int i = 0; i < Str.length(); i++) 
        {
            temp[i] = Str.charAt(i);
        }
        for (int j = 0; j < Str1.length(); j++) 
        {
            temp1[j] = Str1.charAt(j);
        }
        Arrays.sort(temp);
        Arrays.sort(temp1);        
        
        return (Arrays.equals(temp, temp1));        
            }
}

/*
 * 
 ****Is Anagram :false
 ****Is Anagram :true
 ****Is Anagram :false
 ****Is Anagram :true
 *  
 */