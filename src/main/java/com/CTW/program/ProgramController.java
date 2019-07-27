package com.CTW.program;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProgramController {

    private ProgramService programService;

    public ProgramController(ProgramService programService) {
        this.programService = programService;
    }

    @GetMapping("/programs/{address}")
    public Program getProgram(@PathVariable String address) {
        return programService.listPrograms().stream().filter( p -> (p.getAddress().equals(address))).findFirst().get();
    }

    @GetMapping("/programs")
    public List<Program> listPrograms() {
        return programService.listPrograms();
    }

    @PostMapping("/programs")
    public void saveProductAndGetId(@RequestBody Program program) {
        programService.saveProgramAndGetId(program);
    }
}