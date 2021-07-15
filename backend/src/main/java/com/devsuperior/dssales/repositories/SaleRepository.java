package com.devsuperior.dssales.repositories;

import com.devsuperior.dssales.dto.SalesByStoreDTO;
import com.devsuperior.dssales.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.devsuperior.dssales.dto.SalesByStoreDTO(obj.store, SUM(obj.total)) FROM Sale obj " +
            "GROUP BY obj.store ")
    List<SalesByStoreDTO> searchByStory();

}
