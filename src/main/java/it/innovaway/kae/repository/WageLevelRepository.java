package it.innovaway.kae.repository;

import it.innovaway.kae.model.WageLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WageLevelRepository extends JpaRepository<WageLevel, Long> {
}
