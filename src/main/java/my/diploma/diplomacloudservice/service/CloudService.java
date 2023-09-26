package my.diploma.diplomacloudservice.service;

import my.diploma.diplomacloudservice.entity.File;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

public interface CloudService {

    void saveFile(String filename, MultipartFile file);
    void deleteFile(String filename);
    File downloadFile(String filename);
    void editFilename(String filename, String newName);
    List<File> getFiles(int limit);
}