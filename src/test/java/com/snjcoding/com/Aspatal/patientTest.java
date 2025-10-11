package com.snjcoding.com.Aspatal;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.snjcoding.com.Aspatal.modal.patient;
import com.snjcoding.com.Aspatal.repository.patientRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class patientTest {
    @Autowired
    private patientRepo patientRepo;

    @Test
    public void patientrepoTest(){
        List<patient> p1 = patientRepo.findAll();
        System.out.println(p1);
    }
}

