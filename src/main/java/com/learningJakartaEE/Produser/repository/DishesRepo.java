package com.learningJakartaEE.Produser.repository;

import com.learningJakartaEE.Produser.entity.Dish;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import java.util.LinkedList;

public class DishesRepo {

    /**
     * here we produce a linked list of dishes to be injected in the service layer by the @Inject annotation
     * @return
     */
    @Produces
    public LinkedList<Dish> getDishLinkedList() {
        LinkedList<Dish> dishLinkedList = new LinkedList<>();
        dishLinkedList.add(new Dish("Ampesi"));
        dishLinkedList.add(new Dish("Tou zaafi"));
        dishLinkedList.add(new Dish("Banku"));
        return dishLinkedList;
    }


    /**
     * here we make clean up before the list object is destroyed
     * @param dishLinkedList
     */
    public void disposeDishesList(@Disposes LinkedList<Dish> dishLinkedList){
        dishLinkedList = null;
    }

    /*public DishesRepo() {
        dishLinkedList.add(new Dish("Ampesi"));
        dishLinkedList.add(new Dish("Tou zaafi"));
        dishLinkedList.add(new Dish("Banku"));
    }*/

}
