package com.akhilesh.expensetrackerapi.services;

import com.akhilesh.expensetrackerapi.domain.Category;
import com.akhilesh.expensetrackerapi.exceptions.EtBadRequestException;
import com.akhilesh.expensetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryService {

    List<Category> fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void  updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void  removeCategoryWithAllTransaction(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}
