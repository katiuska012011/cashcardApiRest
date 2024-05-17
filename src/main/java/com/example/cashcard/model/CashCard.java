package com.example.cashcard.model;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "CASH_CARD")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class CashCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    public Long id() {
        return id;
    }
}
