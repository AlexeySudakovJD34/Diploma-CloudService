package my.diploma.diplomacloudservice.utils;

import java.util.UUID;

public class IdGenerator {

    public static int generateId() {
        return Math.abs(
                UUID.randomUUID()
                        .toString()
                        .hashCode()
        );
    }
}