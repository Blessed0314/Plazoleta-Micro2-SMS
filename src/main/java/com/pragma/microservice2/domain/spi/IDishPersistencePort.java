package com.pragma.microservice2.domain.spi;

import com.pragma.microservice2.domain.model.Dish;

public interface IDishPersistencePort {
    void saveDish(Dish dish);
}