package com.Candidate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
public class CandidateProfile {
    @Id
    @GeneratedValue
    private int candidateId;
    private String fname;
    private String mname;
    private String lname;
    private String emailId;
    private long mobileNo;
    private String password;
    private String employment;
    private String photo;
    private String collegeName;
    private String startYear;
    private String passYear;
    private int marks;
    private String projectName;
    private String projectInfo;
    private String patent;
    private String profileSummary;
    private String linkedinLink;
    private String githubLink;
    private String gender;
    private String dateOfBirth;
    private String careerBreak;
    private String resume;
    private String address;

    public CandidateProfile() {}

    public CandidateProfile(String fname, String mname, String lname, String emailId, long mobileNo, String password, String employment, String photo, String collegeName, String startYear, String passYear, int marks, String projectName, String projectInfo, String patent, String profileSummary, String linkedinLink, String githubLink, String gender, String dateOfBirth, String careerBreak, String resume, String address) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.emailId = emailId;
        this.mobileNo = mobileNo;
        this.password = password;
        this.employment = employment;
        this.photo = photo;
        this.collegeName = collegeName;
        this.startYear = startYear;
        this.passYear = passYear;
        this.marks = marks;
        this.projectName = projectName;
        this.projectInfo = projectInfo;
        this.patent = patent;
        this.profileSummary = profileSummary;
        this.linkedinLink = linkedinLink;
        this.githubLink = githubLink;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.careerBreak = careerBreak;
        this.resume = resume;
        this.address = address;
        System.out.println("hello world");
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getPassYear() {
        return passYear;
    }

    public void setPassYear(String passYear) {
        this.passYear = passYear;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectInfo() {
        return projectInfo;
    }

    public void setProjectInfo(String projectInfo) {
        this.projectInfo = projectInfo;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public String getProfileSummary() {
        return profileSummary;
    }

    public void setProfileSummary(String profileSummary) {
        this.profileSummary = profileSummary;
    }

    public String getLinkedinLink() {
        return linkedinLink;
    }

    public void setLinkedinLink(String linkedinLink) {
        this.linkedinLink = linkedinLink;
    }

    public String getGithubLink() {
        return githubLink;
    }

    public void setGithubLink(String githubLink) {
        this.githubLink = githubLink;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCareerBreak() {
        return careerBreak;
    }

    public void setCareerBreak(String careerBreak) {
        this.careerBreak = careerBreak;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandidateProfile that = (CandidateProfile) o;
        return candidateId == that.candidateId && mobileNo == that.mobileNo && marks == that.marks && Objects.equals(fname, that.fname) && Objects.equals(mname, that.mname) && Objects.equals(lname, that.lname) && Objects.equals(emailId, that.emailId) && Objects.equals(password, that.password) && Objects.equals(employment, that.employment) && Objects.equals(photo, that.photo) && Objects.equals(collegeName, that.collegeName) && Objects.equals(startYear, that.startYear) && Objects.equals(passYear, that.passYear) && Objects.equals(projectName, that.projectName) && Objects.equals(projectInfo, that.projectInfo) && Objects.equals(patent, that.patent) && Objects.equals(profileSummary, that.profileSummary) && Objects.equals(linkedinLink, that.linkedinLink) && Objects.equals(githubLink, that.githubLink) && Objects.equals(gender, that.gender) && Objects.equals(dateOfBirth, that.dateOfBirth) && Objects.equals(careerBreak, that.careerBreak) && Objects.equals(resume, that.resume) && Objects.equals(address, that.address);
    }

    @Override
    public String toString() {
        return "CandidateProfile{" +
                "candidateId=" + candidateId +
                ", fname='" + fname + '\'' +
                ", mname='" + mname + '\'' +
                ", lname='" + lname + '\'' +
                ", emailId='" + emailId + '\'' +
                ", mobileNo=" + mobileNo +
                ", password='" + password + '\'' +
                ", employment='" + employment + '\'' +
                ", photo='" + photo + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", startYear='" + startYear + '\'' +
                ", passYear='" + passYear + '\'' +
                ", marks=" + marks +
                ", projectName='" + projectName + '\'' +
                ", projectInfo='" + projectInfo + '\'' +
                ", patent='" + patent + '\'' +
                ", profileSummary='" + profileSummary + '\'' +
                ", linkedinLink='" + linkedinLink + '\'' +
                ", githubLink='" + githubLink + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", careerBreak='" + careerBreak + '\'' +
                ", resume='" + resume + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
