package java_programs;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums1){
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums2){
            if(map.get(i) != null && map.get(i) > 0){
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] ret = new int[list.size()];
        for(int i = 0; i < list.size();i++){
            ret[i] = list.get(i);
        }
        return ret;
    }

    public static void main(String[] args) {
        Intersection i = new Intersection();
        int[] nums1 = {9,4,9,4,5};
        int[] nums2 = {9,4,3};
        int[] ret = i.intersect(nums1, nums2);
        for(int j : ret){
            System.out.println(j);
        }
    }
}


