package com.naja;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ValidationResult {
    private List<String> errors = new ArrayList<>();
    private String errorReasonCode;
    private String errorReasonDescription;

    private String validMessage;


    public void addError(String error) {
        errors.add(error);
    }

    public boolean isValid() {
        return errors.isEmpty();
    }

    public List<String> getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        return "ValidationResult{" +
                "errors=" + errors +
                ", errorReasonCode='" + errorReasonCode + '\'' +
                ", errorReasonDescription='" + errorReasonDescription + '\'' +
                ", validMessage='" + validMessage + '\'' +
                '}';
    }
}