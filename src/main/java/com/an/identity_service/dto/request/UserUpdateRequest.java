package com.an.identity_service.dto.request;

import com.an.identity_service.validator.DobConstraint;
import lombok.*;
import lombok.experimental.FieldNameConstants;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants(level = AccessLevel.PRIVATE)
public class UserUpdateRequest {

    String password;
    String firstName;
    String lastName;

    @DobConstraint(min = 8, message = "INVALID_DOB")
    LocalDate dob;
    List<String> roles;
}
