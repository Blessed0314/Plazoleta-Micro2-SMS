package com.pragma.microservice2.adapters.driving.http.mapper;

import com.pragma.microservice2.adapters.driving.http.dto.response.RestaurantResponse;
import com.pragma.microservice2.domain.model.Restaurant;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IRestaurantResponseMapper {
    List<RestaurantResponse> toRestaurantResponseList(List<Restaurant> restaurants);
}