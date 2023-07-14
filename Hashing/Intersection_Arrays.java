package Hashing;

import java.util.HashMap;

public class Intersection_Arrays {
    public static void main(String[] args) {
        int [] a = {1,2,2,1};
        int [] b = {2,2};
        //int [] res = 
        intersection(a,b);
    }

    public static void intersection(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> HM = new HashMap<>();
        for(int ali : nums2){

            int prevFreq = 0;
            if(HM.containsKey(ali)){
                prevFreq = HM.get(ali);
            }
            HM.put(ali, prevFreq+1);
        } 
        System.out.println(HM);
        for(int ali : nums1){
            if(HM.containsKey(ali)){
                System.out.println(ali);
                int prevFreq = HM.get(ali);
                HM.put(ali,prevFreq-1);
            }
        }
    }
}
