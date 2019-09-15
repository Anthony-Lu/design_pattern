package com.anthony.dp.builder;

/**
 * Created by Anthony on 2019/9/15 16:21
 */
public class User {

    private String name;
    private int age;
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Bulider build() {
        return new Bulider();
    }

    static class Bulider {

        private String name;
        private int age;

        public Bulider() {
        }

        public Bulider name(String name) {
            this.name = name;
            return this;
        }

        public Bulider age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this.name, this.age);
        }
    }

    public static void main(String[] args) {
        User user = new User.Bulider().age(18).name("zhangsan").build();
        System.out.println(user);
    }
}
