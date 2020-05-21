package com.learningJakartaEE.Produser.service;

import com.learningJakartaEE.Produser.entity.Dish;
import com.learningJakartaEE.Produser.repository.DishesRepo;

import javax.inject.Inject;
import java.util.LinkedList;
import java.util.Random;

public class DishesServiceImpl implements DishesService {

    private final LinkedList<Dish> dishLinkedList;
    private final Random random = new Random();

    @Inject
    public DishesServiceImpl(LinkedList<Dish> dishLinkedList) {
        this.dishLinkedList = dishLinkedList;
    }

    @Override
    public Dish getLuckyDish() {
        return dishLinkedList.get(random.nextInt(8));
    }
}
