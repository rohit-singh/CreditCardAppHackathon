package com.hackathon.cardapprovalservices.repo;

import com.hackathon.cardapprovalservices.model.CardType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardTypeRepo extends JpaRepository<CardType, Long> {
}
