package com.forms.dao;
 
import java.util.List;
 
import com.forms.entity.Applicant;
import com.forms.model.ApplicantInfo;
 
public interface ApplicantDAO {
 
    public Applicant findApplicant(String id);
 
    public List<ApplicantInfo> listApplicantInfos();
 
    public void saveApplicant(ApplicantInfo applicantInfo);
 
    public ApplicantInfo findApplicantInfo(String id);
 
    public void deleteApplicant(String id);
    
}