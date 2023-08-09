package com.xuan;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/6/25 11:06
 * @introduction:
 */
public class Girl {
    public void feed(Pet pet){
        pet.coquetry();
    }

    public static void main(String[] args) {
        Girl girl = new Girl();
        Pet pet = new Pet();
        Pet dog = new Dog();
        Pet cat = new Cat();

        girl.feed(pet);
        girl.feed(dog);
        girl.feed(cat);


    }
}
