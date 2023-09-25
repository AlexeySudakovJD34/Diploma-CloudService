package my.diploma.diplomacloudservice.mapper;

import org.mapstruct.Mapper;
import my.diploma.diplomacloudservice.dto.FileInfoDto;
import my.diploma.diplomacloudservice.entity.File;

@Mapper(componentModel = "spring")
public interface FileInfoMapper {

    FileInfoDto fileToFileInfoDto(File file);
    File fileInfoDTOToFile(FileInfoDto fileInfoDTO);
}