package com.vendas.dsvendas.services;

import com.vendas.dsvendas.dto.SaleDTO;
import com.vendas.dsvendas.dto.SellerDTO;
import com.vendas.dsvendas.entities.Sale;
import com.vendas.dsvendas.entities.Seller;
import com.vendas.dsvendas.repositories.SaleRepository;
import com.vendas.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {

    @Autowired
    SaleRepository repository;

    @Autowired
    SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }
}
