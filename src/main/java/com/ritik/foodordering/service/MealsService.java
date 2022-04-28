package com.ritik.foodordering.service;

import com.ritik.foodordering.entity.Meals;

import java.util.List;

public interface MealsService {

    public List<Meals> findAll();
    
    public Meals save(Meals meals);
}
