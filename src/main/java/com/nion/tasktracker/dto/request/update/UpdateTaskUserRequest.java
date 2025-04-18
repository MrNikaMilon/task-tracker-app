package com.nion.tasktracker.dto.request.update;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.NonNull;

@Builder
public record UpdateTaskUserRequest(@NonNull @Min(value = 2, message = "Name must be more than 2 characters") @Max(value = 10, message = "Name must be less than 10 characters")
                                String userName,
                                    @NonNull @NotBlank @Pattern(regexp = "^\\S+@\\S+\\.\\S+$", message = "Unsupported email format, please check")
                                String email) { }
