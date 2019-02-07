package com.equifax.syntheticid.resource;

/**
 * Created by brian.aabel on 2/6/2019.
 */
public class AlertFlags {

    private String finalAssessment;
    private String auv;
    private String idDiscrepancy;
    private Integer activeAuthorizedUsers;
    private Integer terminatedUsers;
    private String inp;
    private String sharedSsn;
    private String ssnVerified;
    private String invalidSsn;
    private String sharedAddress;
    private String deathMasterHit;
    private String nctueHit;
    private String property;

    public String getFinalAssessment() {
        return finalAssessment;
    }

    public void setFinalAssessment(String finalAssessment) {
        this.finalAssessment = finalAssessment;
    }

    public String getAuv() {
        return auv;
    }

    public void setAuv(String auv) {
        this.auv = auv;
    }

    public String getIdDiscrepancy() {
        return idDiscrepancy;
    }

    public void setIdDiscrepancy(String idDiscrepancy) {
        this.idDiscrepancy = idDiscrepancy;
    }

    public Integer getActiveAuthorizedUsers() {
        return activeAuthorizedUsers;
    }

    public void setActiveAuthorizedUsers(Integer activeAuthorizedUsers) {
        this.activeAuthorizedUsers = activeAuthorizedUsers;
    }

    public Integer getTerminatedUsers() {
        return terminatedUsers;
    }

    public void setTerminatedUsers(Integer terminatedUsers) {
        this.terminatedUsers = terminatedUsers;
    }

    public String getInp() {
        return inp;
    }

    public void setInp(String inp) {
        this.inp = inp;
    }

    public String getSharedSsn() {
        return sharedSsn;
    }

    public void setSharedSsn(String sharedSsn) {
        this.sharedSsn = sharedSsn;
    }

    public String getSsnVerified() {
        return ssnVerified;
    }

    public void setSsnVerified(String ssnVerified) {
        this.ssnVerified = ssnVerified;
    }

    public String getInvalidSsn() {
        return invalidSsn;
    }

    public void setInvalidSsn(String invalidSsn) {
        this.invalidSsn = invalidSsn;
    }

    public String getSharedAddress() {
        return sharedAddress;
    }

    public void setSharedAddress(String sharedAddress) {
        this.sharedAddress = sharedAddress;
    }

    public String getDeathMasterHit() {
        return deathMasterHit;
    }

    public void setDeathMasterHit(String deathMasterHit) {
        this.deathMasterHit = deathMasterHit;
    }

    public String getNctueHit() {
        return nctueHit;
    }

    public void setNctueHit(String nctueHit) {
        this.nctueHit = nctueHit;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public String getInqFlag1() {
        return inqFlag1;
    }

    public void setInqFlag1(String inqFlag1) {
        this.inqFlag1 = inqFlag1;
    }

    public String getInqFlag2() {
        return inqFlag2;
    }

    public void setInqFlag2(String inqFlag2) {
        this.inqFlag2 = inqFlag2;
    }

    public String getAdditionalProp1() {
        return additionalProp1;
    }

    public void setAdditionalProp1(String additionalProp1) {
        this.additionalProp1 = additionalProp1;
    }

    public String getAdditionalProp2() {
        return additionalProp2;
    }

    public void setAdditionalProp2(String additionalProp2) {
        this.additionalProp2 = additionalProp2;
    }

    public String getAdditionalProp3() {
        return additionalProp3;
    }

    public void setAdditionalProp3(String additionalProp3) {
        this.additionalProp3 = additionalProp3;
    }

    private String dm;
    private String inqFlag1;
    private String inqFlag2;
    private String additionalProp1;
    private String additionalProp2;
    private String additionalProp3;



}
