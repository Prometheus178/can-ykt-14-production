package com.realestate.site.repositories.post;


import com.realestate.site.models.post.Post;
import com.realestate.site.models.post.enums.*;
import com.realestate.site.models.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByDealTypeAndLivingAndNumberOfRoomsAndBuildingTypeAndAccountTypeAndPriceBetweenOrderByDateTimeDesc(DealType dealType, Living living, NumberOfRooms numberOfRooms, BuildingType buildingType, AccountType accountType, int from , int to);
    List<Post> findAllByUserOrderByDateTimeDesc(User user);
    Page<Post> findAllByOrderByDateTimeDesc(Pageable pageable);
    Page<Post> findAllByDealTypeOrderByDateTimeDesc(Pageable pageable, DealType dealType);

}
