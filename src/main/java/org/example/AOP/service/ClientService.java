package org.example.AOP.service;

import org.example.AOP.annot.AuditCode;
import org.example.AOP.annot.Auditable;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    public void transfer(){
        System.out.println("In public void transfer operation");
    }

    @Auditable(AuditCode.CODE001)
    public String auditable(String value1, String value2){
        System.out.println("Auditable values" + value1+value2);
        return value1 + " "+ value2;
    }
}
