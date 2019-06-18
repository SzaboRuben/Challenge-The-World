package com.CTW.applicant;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantService {

    ApplicantDao applicantDao;

    public ApplicantService(ApplicantDao applicantDao) {
        this.applicantDao = applicantDao;
    }

    public List<Applicant> listAllApplicants() {
        return applicantDao.listAllApplicants();
    }
}
