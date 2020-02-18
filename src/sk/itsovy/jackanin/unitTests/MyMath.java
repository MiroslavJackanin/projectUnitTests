package sk.itsovy.jackanin.unitTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyMath {
    public boolean isPrimeNumber(int x){
        if(x==0|| x==1){
            return false;
        }else{
            for(int i=2;i<=x/2;i++){
                if(x%i==0){
                    return false;
                }
            }
        }
        return false;
    }

    public int minimum(int[] arr){
        List<Integer> list = new ArrayList<Integer>();
        for (int value : arr) {
            list.add(value);
        }
        return Collections.min(list);
    }

    public boolean existTriangle(int a, int b, int c){
        return a + b > c && a + c > b && b + c > a;
    }

    public String convertToBinary(int x){
        //return Integer.toBinaryString(x);
        StringBuilder binary= new StringBuilder();
        while (x > 0)
        {
            binary.insert(0, ((x % 2) == 0 ? "0" : "1"));
            x = x / 2;
        }
        return binary.toString();
    }

    public String reverse(String text){
        //return new StringBuilder().append(text).reverse().toString();
        StringBuilder result = new StringBuilder();
        for (int i = text.length()-1; i >= 0; i--) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }
}
