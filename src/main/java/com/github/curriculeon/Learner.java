package com.github.curriculeon;

public interface LearnerInterface {
    long getId();
    String getName();
    void learn(double numberOfHours);
    Double getTotalStudyTime();
//    String getAddress();
//    Long getPhoneNumber();
//    Double getBasicSalary();
//    Double getSpecialAllowance();
//    Double getHealthReimbursementAccount();
    void setName(String name);
//    void setAddress(String address);
//    void setPhoneNumber(Long phoneNumber);
//    void setBasicSalary(Double basicSalary);
//    void setSpecialAllowance(Double specialAllowance);
//    void setHealthReimbursementAccount(Double healthReimbursementAccount);
//    Double calculateSalary();

}