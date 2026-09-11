package DSpractice;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static void main(String[] args){
        int[] people = {1,3,2,2,1,2};
        int i=0;
        int j =0;
        int limit =3;

        Arrays.sort(people);
       int left =0;
       int right = people.length-1;
       int count =0;
      while(left<=right){
          int weight = people[left]+people[right];
           if(weight <= limit){
              left++;
          }else{
               count++;
           right--;
          }
       }
      System.out.println("count: "+count);
        }

    }

