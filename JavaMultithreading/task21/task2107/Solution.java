package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
*/
public class Solution implements Cloneable {

    public Object clone() throws CloneNotSupportedException {
        Solution solution = new Solution();
        solution.users = new LinkedHashMap<>(this.users);
        return solution;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable{
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }
        public User() {}

        public Object clone() throws CloneNotSupportedException {
            User user = new User();
            user.name = this.name;
            user.age = this.age;
            return user;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || ! (o instanceof Solution)) return false;
            User user = (User) o;
            return age == user.age && (name == user.name || (name != null && name.equals(user.name)));
        }

        @Override
        public int hashCode() {
            int result = age;
            result += (name != null ? name.hashCode() : 0);
            return result;
        }
    }
}
