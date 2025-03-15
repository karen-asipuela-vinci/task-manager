package taskmanager.backend.repositories;

import taskmanager.backend.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
  /* commandes automatiques :
  Task save(Task task);
  void deleteById(Long id);
  List<Task> findAll();
  Optional<Task> findById(Long id);
  ... check others in JpaRepository documentation
   */
}
