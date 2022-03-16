package it.innovaway.kae.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.innovaway.kae.model.WageLevel;

@Repository
public interface WageLevelRepository extends JpaRepository<WageLevel, Long> {

}
