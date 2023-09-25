package my.diploma.diplomacloudservice.service;

import org.springframework.web.multipart.MultipartFile;
import my.diploma.diplomacloudservice.dto.FileDto;
import my.diploma.diplomacloudservice.dto.FileInfoDto;

import java.util.List;

public interface CloudService {

    void saveFile(String filename, MultipartFile file);
    void deleteFile(String filename);
    FileDto downloadFile(String filename);
    void editFilename(String filename, String newName);
    List<FileInfoDto> getFiles(int limit);
}