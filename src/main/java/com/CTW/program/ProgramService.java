package com.CTW.program;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramService {

    private ProgramDao programDao;

    public ProgramService(ProgramDao programDao) {
        this.programDao = programDao;
    }

    public List<Program> listPrograms() {
        return programDao.listPrograms();
    }
}
