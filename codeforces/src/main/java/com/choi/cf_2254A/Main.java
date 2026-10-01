package com.choi.cf_2254A;

import java.util.*;

public class Main {
    private static int findRound(int[] arr){
        int round = 0;

        while(true){
            //정렬
            Arrays.sort(arr);
            Set<Integer> set = new HashSet<>();
            for(var n : arr){
                if(set.contains(n)) return round;
                set.add(n);
            }

            arr[0]++;
            arr[2]--;
            round++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        //most -> few
        for(int i = 0; i < n; i++){
            int[] arr = new int[3];
            for(int j = 0; j < 3; j++){
                int num = sc.nextInt();
                arr[j] = num;
            }

            System.out.println(findRound(arr));
        }

    }
}
