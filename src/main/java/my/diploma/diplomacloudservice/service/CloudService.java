package my.diploma.diplomacloudservice.service;

import my.diploma.diplomacloudservice.entity.File;
import org.springframework.web.multipart.MultipartFile;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public interface CloudService {

    void saveFile(String filename, MultipartFile file) throws SQLIntegrityConstraintViolationException;
    void deleteFile(String filename) throws SQLIntegrityConstraintViolationException;
    File downloadFile(String filename) throws SQLIntegrityConstraintViolationException;
    void editFilename(String filename, String newName) throws SQLIntegrityConstraintViolationException;
    List<File> getFiles(int limit);
}