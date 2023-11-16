package com.xuan.singleton;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/8/11 10:16
 * @Description: TODO
 */
public class Party {

    public void paly(Dog dog){
        System.out.println("狂欢");
    }
    public void paly(Pet pet){
        pet.paly();
        System.out.println("狂欢2");
    }

    public static void main(String[] args) {
        Party party = new Party();
        Pet dog = new Dog();
        dog.paly();

        party.paly(new Dog(){
            @Override
            public void paly() {
                System.out.println("撒娇");
            }
        });


}
}
