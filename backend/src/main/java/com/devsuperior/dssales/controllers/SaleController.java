package com.devsuperior.dssales.controllers;

import com.devsuperior.dssales.dto.SalesByStoreDTO;
import com.devsuperior.dssales.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping(value = "/by-store")
    public ResponseEntity<List<SalesByStoreDTO>> searchByStore() {
        return ResponseEntity.ok().body(service.searchByStory());
    }
}
