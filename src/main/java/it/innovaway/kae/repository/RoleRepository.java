package it.innovaway.kae.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.innovaway.kae.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
