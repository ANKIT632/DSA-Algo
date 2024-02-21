package Others;

import java.util.*;

class PriorityQ{

    // by default implement min heap.
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();

        int arr[]={6,4,2,5,7,22,1,56};
        int sort[]=new int [arr.length];


        for(var val:arr){
            pq.add(val);
        }

        int i=0;
        while(!pq.isEmpty()){
           sort[i++]=pq.poll();
        }

        for(int val:sort){
            System.out.print(val+" ");
        }
    }
}