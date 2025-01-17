package com.ninos;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;   // tone: professional, basic, ...
}
