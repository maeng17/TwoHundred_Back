package org.duckdns.bidbuy.app.offer.repository;

import org.duckdns.bidbuy.app.offer.domain.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfferRepository extends JpaRepository<Offer, Long>{
    List<Offer> findByArticleId(Long articleId);
}