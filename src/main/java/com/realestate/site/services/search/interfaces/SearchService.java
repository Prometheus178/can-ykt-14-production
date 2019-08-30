package com.realestate.site.services.search.interfaces;

import com.realestate.site.models.post.Post;
import com.realestate.site.models.post.enums.*;

import java.util.List;

public interface SearchService {

    List<Post> findAllByQuery(DealType dealType,Living living, NumberOfRooms numberOfRooms,BuildingType buildingType, AccountType accountType, int from , int to);
}
