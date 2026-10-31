package com.hackathon.cardapprovalservices.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "card_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardType {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String cardId;
    private String creditCardType;
    private double limit;
    private String status;

}
