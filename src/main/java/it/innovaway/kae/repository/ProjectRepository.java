package it.innovaway.kae.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.innovaway.kae.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
