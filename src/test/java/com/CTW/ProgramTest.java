package com.CTW;

import com.CTW.program.Program;
import com.CTW.program.ProgramController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProgramTest {


    @Autowired
    ProgramController programController;

    @Test
    public void testListPrograms() {
        List<Program> programList = programController.listPrograms();
        assertEquals(programList.size(), 3);
    }
}
