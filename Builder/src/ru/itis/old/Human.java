package ru.itis.old;

/**
 * 10.10.2017
 * Human
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Human {
    private String name;
    private int age;
    private String color;
    private double height;
    private double weight;
    private boolean isHuman;
    private String religion;

    public Human(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.color = builder.color;
        this.height = builder.height;
        this.weight = builder.weight;
        this.isHuman = builder.isHuman;
        this.religion = builder.religion;
    }

    public static Builder builder() {
        return new Builder();
    }
    
    public static class Builder {
        private String name;
        private int age;
        private String color;
        private double height;
        private double weight;
        private boolean isHuman;
        private String religion;
        
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder height(double height) {
            this.height = height;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder isHuman(boolean isHuman) {
            this.isHuman = isHuman;
            return this;
        }

        public Builder religion(String religion) {
            this.religion = religion;
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public String getReligion() {
        return religion;
    }
}
