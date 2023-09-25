package my.diploma.diplomacloudservice.dto;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonProperty;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginDto {

    @JsonProperty("auth-token")
    private String authToken;
}