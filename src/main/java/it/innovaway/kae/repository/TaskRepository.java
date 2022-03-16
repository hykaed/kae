package it.innovaway.kae.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.innovaway.kae.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
