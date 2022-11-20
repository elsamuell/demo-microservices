package com.merchant.persistence.merchant;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MerchantRepository extends JpaRepository<MerchantEntity,Long> {
    Optional<MerchantEntity> findByMerchantName(String name);
}
