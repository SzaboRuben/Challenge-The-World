package com.CTW.applicant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicantController {

    ApplicantService applicantService;

    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @GetMapping("/applicants")
    public List<Applicant> listAllApplicants(){
        return applicantService.listAllApplicants();
    }
}
