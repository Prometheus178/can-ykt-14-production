package com.realestate.site.repositories.new_building;

import com.realestate.site.models.new_building.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ApartmentRepository extends JpaRepository<Apartment,Long> {


    List<Apartment> findAllApartmentByAddress_Id(Long id);


}
