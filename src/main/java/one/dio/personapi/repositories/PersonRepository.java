package one.dio.personapi.repositories;

import one.dio.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
