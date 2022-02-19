package orient.mvctest.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import orient.mvctest.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
