package factorpattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        Set<Integer> retList = new HashSet<Integer>();
        List<String> wordsList = Arrays.asList(words);
        int wLength = words[0].length();

        for(String word:wordsList)
        {
            int stIdx = 0;
            int totalWordProcessed = 0;
            List<String> cloned_list = new ArrayList<String>(wordsList);
           
            while(s.indexOf(word,stIdx) != -1)
            {
               int indexOf = s.indexOf(word,stIdx);
               System.out.println(indexOf);
               int resultIndx = s.indexOf(word,stIdx);
               totalWordProcessed++;
               int arrST = indexOf + wLength;
               int arrEnd = indexOf + 2 * wLength;
               cloned_list.remove(word);
               boolean flag = false;
               while(s.length() >= indexOf + 2 * wLength && cloned_list.contains(s.substring(arrST,arrEnd)))
               {
                    System.out.println("Substring word "+s.substring(arrST,arrEnd));
                    indexOf = indexOf + wLength;
                    totalWordProcessed++;
                    if(totalWordProcessed == words.length)
                    {
                        flag = true;
                        System.out.println("Result---");
                        System.out.println(indexOf);
                        retList.add(resultIndx);
                        break;
                    }    
                    cloned_list.remove(s.substring(arrST,arrEnd));
                    arrST = indexOf + wLength;
                    arrEnd = indexOf + 2 * wLength;
               }
               if(!flag  && totalWordProcessed == words.length)
                {
                        
                        System.out.println("Result---");
                        System.out.println(indexOf);
                        retList.add(resultIndx);
                        
                } 
            stIdx = resultIndx+ 1;
            totalWordProcessed = 0;
            cloned_list = new ArrayList<String>(wordsList);
            System.out.println(word);

            }
            
        }
        List<Integer> mainList = new ArrayList<Integer>();
        mainList.addAll(retList);
        System.out.println("---------------------------------");
        mainList.stream().forEach(System.out::println);
        return mainList;
    }
    public static void main(String[] args) {

        new Solution().findSubstring("mississippi", new String[]{"is"});
    }
}
