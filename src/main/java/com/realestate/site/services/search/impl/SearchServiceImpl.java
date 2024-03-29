package com.realestate.site.services.search.impl;

import com.realestate.site.models.post.Post;
import com.realestate.site.models.post.enums.*;
import com.realestate.site.repositories.post.PostRepository;
import com.realestate.site.services.search.interfaces.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> findAllByQuery(DealType dealType, Living living, NumberOfRooms numberOfRooms,BuildingType buildingType, AccountType accountType, int from, int to ) {


        return postRepository.findByDealTypeAndLivingAndNumberOfRoomsAndBuildingTypeAndAccountTypeAndPriceBetweenOrderByDateTimeDesc(dealType,living,numberOfRooms,buildingType,accountType, from, to);
    }
}
