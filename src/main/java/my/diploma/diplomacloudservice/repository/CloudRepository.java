package my.diploma.diplomacloudservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import my.diploma.diplomacloudservice.entity.File;

import java.util.Optional;

@Repository
public interface CloudRepository extends JpaRepository<File, String> {

    Optional<File> findByFilename(String filename);
}