package it.innovaway.kae.repository;

import it.innovaway.kae.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    @Query("SELECT p from Project p where p.name= ?1")
    Optional<Project> findProjectByName(String name);
    //Boolean existByName(String name);
}
