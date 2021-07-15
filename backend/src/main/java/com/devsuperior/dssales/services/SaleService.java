package com.devsuperior.dssales.services;

import com.devsuperior.dssales.dto.SalesByStoreDTO;
import com.devsuperior.dssales.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Transactional(readOnly = true)
    public List<SalesByStoreDTO> searchByStory() {
        return repository.searchByStory();
    }
}
