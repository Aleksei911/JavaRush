package com.javarush.task.task21.task2105;

import java.util.HashSet;
import java.util.Set;

/* 
Исправить ошибку. Сравнение объектов
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public int hashCode() {
        int result;
        if (first == null && last !=null) result = last.hashCode();
        else if (first != null && last ==null) result = first.hashCode();
        else if (first == null && last ==null) result =0;
        else result = first.hashCode() + last.hashCode();
        return result;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Solution)) return false;
        Solution sol = (Solution) o;

        if (first != null ? !first.equals(sol.first):sol.first != null) return false;

        return (last != null ? last.equals(sol.last):sol.last == null);
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
