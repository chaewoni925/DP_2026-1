package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 작은 순서(오름차순)
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // s1과 s2를 비교
                return s1.compareTo(s2); // s1이 더 클 때 양수가 리턴되고, 위치가 바뀌게 됨 => 큰 게 뒤로 가게 됨 => 오름차순 
            }

        } ); // Comparator
        System.out.println(list);

        list.sort((s1, s2) -> s1.compareTo(s2)); //람다식

        // 사전순으로 큰 순서(내림차순) 
        list.sort( new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // s1과 s2를 비교
                return s2.compareTo(s1); // s2가 더 클 때 양수가 리턴되고, 위치가 바뀌게 됨 => 큰 게 뒤로 가게 됨 => 내림차순 
            }

        } ); // Comparator
        System.out.println(list);
    }
}
