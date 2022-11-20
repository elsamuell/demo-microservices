package com.merchant.persistence.merchant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "merchant_table")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class MerchantEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String merchantName;
}
