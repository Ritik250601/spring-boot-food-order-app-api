package com.ritik.foodordering.service;

import com.ritik.foodordering.dao.MealsDAO;
import com.ritik.foodordering.entity.Meals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealsServiceImpl implements MealsService{

    @Autowired
    private MealsDAO mealsDAO;

    @Override
    public List<Meals> findAll() {
        return mealsDAO.findAll();
    }

	@Override
	public Meals save(Meals meals) {
		// TODO Auto-generated method stub
		return mealsDAO.save(meals);
	}
}
