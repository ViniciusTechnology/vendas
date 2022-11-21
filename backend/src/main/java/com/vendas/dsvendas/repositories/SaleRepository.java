package com.vendas.dsvendas.repositories;

import com.vendas.dsvendas.entities.Sale;
import com.vendas.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
}
