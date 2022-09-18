package com.shopee.tinytools.impl;


import com.shopee.tinytools.model.Customenum;
import com.shopee.tinytools.model.Title;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;
import service.TitleService;
import service.customRandomDate;

import java.util.*;


import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
import static service.customRandomDate.randBetween;

@Slf4j
@Service("TitleService")
public class TitleServiceImpl implements TitleService {

   public List<String> GetrankSystem(){
       ArrayList<String> rankSystem = new ArrayList<>();
       rankSystem.add(Customenum.Shopee.getName());
       rankSystem.add(Customenum.Labs.getName());
       rankSystem.add(Customenum.Garena.getName());
       rankSystem.add(Customenum.Finance.getName());
       return  rankSystem;
   }

   public List<String> Getrank(){
        ArrayList<String> rank = new ArrayList<>();
        rank.add(Customenum.Manager.getName());
        rank.add(Customenum.SeniorEngineer.getName());
        rank.add(Customenum.SeniorDirector.getName());
        rank.add(Customenum.SeniorProductManagementAssociateIII.getName());
        return rank;
   }

   public List<String> getDepartment(){
       ArrayList<String> department = new ArrayList<>();
       department.add(Customenum.department1.getName());
       department.add(Customenum.department2.getName());
       return department;
   }

   public List<String> getFunction(){
       ArrayList<String> function = new ArrayList<>();
       function.add(Customenum.functionCOR.getName());
       function.add(Customenum.functionBL.getName());
       function.add(Customenum.functionGA.getName());
       return function;
   }
   public List<String> getStatus(){
       ArrayList<String> status = new ArrayList<>();
       status.add(Customenum.Active.getName());
       status.add(Customenum.Inactive.getName());
       return status;
   }

   public List<String> getBusinessUnit(){
       ArrayList<String> businessunit = new ArrayList<>();
       businessunit.add(Customenum.businessUnit2.getName());
       businessunit.add(Customenum.businessUnit1.getName());
       businessunit.add(Customenum.businessUnit3.getName());
       return businessunit;
   }

   public List<String> getProduct(){
       ArrayList<String> product = new ArrayList<>();
       product.add(Customenum.product1.getName());
       product.add(Customenum.product2.getName());
       product.add(Customenum.product3.getName());
       return product;
   }

   public List<String> getlegalentity(){
       ArrayList<String> legalentity = new ArrayList<>();
       legalentity.add(Customenum.legalentity1.getName());
       legalentity.add(Customenum.legalentity2.getName());
       legalentity.add(Customenum.legalentity3.getName());
       return legalentity;
   }


    @Override
    public List<Title> getAllData(){
        List<Title> list = new ArrayList<>();
        for(int i =0;i<140000;i++) {
            Title title = new Title();
            customRandomDate getDate = new customRandomDate();
            String randomdate = getDate.getrandomDate();
            int age = randBetween(20, 60);
            int num = randBetween(0,100);
            //randomstring
            String randomString20 = RandomStringUtils.randomAlphanumeric(20);
            String randomstring3 = RandomStringUtils.randomAlphanumeric(3);
            String randomstring10 = RandomStringUtils.randomAlphanumeric(10);
            String randomstring5 = RandomStringUtils.randomAlphanumeric(5);
            String randomnum5 = RandomStringUtils.randomNumeric(5);
            String randomnum11 = RandomStringUtils.randomNumeric(11);

            // id,staffid,
            title.setId("AutoRePerid" + randomnum5);
            log.info(randomnum5);
            title.setStaffId("AutoRePerSid" + randomnum5);

            //ranksystem,rank,baseyear,seniority,
            List rankSystemtmp = GetrankSystem();
            List ranktmp = Getrank();
            Collections.shuffle(rankSystemtmp);
            Collections.shuffle(ranktmp);
            String rankSystem = rankSystemtmp.get(0).toString();
            title.setRankSystem(rankSystem);
            title.setRank(ranktmp.get(0).toString());
            if (rankSystem.equals(Customenum.Labs.getName())) {
                title.setBaseYear("1.01");
                title.setSeniority("1.02");
            } else {
                title.setBaseYear("");
                title.setSeniority("");
            }

            //full name,displayname,team in org chart,email,cellphone
            //Title,
            title.setFullName(randomString20);
            title.setDisplayName(randomString20);
            title.setTeamInOrgChart("New Garena Thailand > AirPay > Ground Sales > Upper Northeast");
            title.setEmail(randomstring10 + "@shopee.com");
            title.setCellPhoneNo(randomnum11);
            title.setTitle(randomstring10);
            title.setReportingManager(randomstring10);
            title.setReportingManagerStaffId(randomnum5);
            title.setDayTODayManager(randomstring10);
            title.setDayTODayManagerStaffId(randomnum5);
            title.setFirstName(randomstring5);
            title.setSurname(randomstring5);
            title.setPersonalEmail(randomstring10 + "@google.com");
            title.setFullNameLocalLanguage(randomstring10);
            title.setScheme(randomstring5);
            title.setGender(randomstring3);
            title.setMarriageStatus(randomstring3);
            title.setNationality(randomstring3);
            title.setNRICFIN(randomnum11);
            title.setPassport(randomnum11);
            title.setContactAddress(randomString20);
            title.setCountry(randomstring5);
            title.setPostalCode(randomnum5);
            title.setRole(randomstring3);
            title.setHRM(randomstring10);
            title.setHR(randomstring10);
            title.setOtherHR(randomstring10);
            title.setPhoto(randomstring5);
            title.setProjectPurchaseCompany(randomString20);
            title.setClaimApprovalManager(randomstring10);
            title.setProcurementApprovalManager(randomstring10);
            title.setICType(randomnum5);
            title.setICIssueDate(randomdate);
            title.setProbationEndDate(randomdate);
            title.setContractExpiryDate(randomdate);
            title.setAge(age);
            title.setRace(randomstring5);
            title.setBankName(randomstring5);
            title.setBankBranchName(randomstring5);
            title.setAccountNo(randomnum5);
            title.setAccountHolderName(randomstring5);
            title.setBankSWIFTCode(randomstring5);
            title.setBankBranchSWIFTCode(randomstring5);
            title.setTradingPreclearanceRequired("No");
            title.setCostCenterTeam(randomstring5);
            title.setTaxID(randomnum5);
            title.setSocialSecurityID(randomnum5);
            title.setFamilyCertificateID(randomnum11);
            title.setReligion(randomstring5);
            title.setNumberofChildren(age);
            title.setEmploymentType(randomstring3);
            title.setEmploymentDuration("1 year and above");
            title.setMailingAddress(randomstring10);
            title.setNickname(randomstring10);
            title.setShiftWorker("No");
            title.setOffice(randomstring10);
            title.setFullName(randomstring10);
            title.setReportingLine(randomstring10);
            title.setLeavingReason(randomstring3);
            title.setRemarks("");
            title.setNoticePeriod(randomstring5);
            title.setResignReasons(randomstring3);
            title.setLinkedID(randomstring5);
            title.setCoverRange("");
            title.setOtherEmails("");
            title.setLevel(randomnum5);
            title.setLastEmail("");
            title.setShopeeUserID(randomstring5);
            title.setDirectSubordinates(num);
            title.setDirectandIndirectSubordinates(num);
            title.setTenureinSeaGroup(num);


            //status
            List status = getStatus();
            Collections.shuffle(status);
            title.setStatus(status.get(0).toString());

            //department
            List department = getDepartment();
            Collections.shuffle(department);
            title.setDepartment(department.get(0).toString());

            //businessunit
            List businessUnit = getBusinessUnit();
            Collections.shuffle(businessUnit);
            title.setBussinessUnit(businessUnit.get(0).toString());

            //function
            List function = getFunction();
            Collections.shuffle(function);
            title.setFunction(function.get(0).toString());

            //product
            List product = getProduct();
            Collections.shuffle(product);
            title.setProduct(product.get(0).toString());

            //department code,Segment Code,legal entity code,

            title.setDepartmentCode(randomstring3);
            title.setSegmentCode(randomstring3);
            title.setProductCode(randomstring10);
            title.setLegalEntityCode(randomstring3);

            //region
            String randomstring2 = RandomStringUtils.randomAlphabetic(2);
            title.setRegion(randomstring2);

            //legal entity
            List legalentity = getlegalentity();
            Collections.shuffle(legalentity);
            title.setLegalEntity(legalentity.get(0).toString());

            //date of join,premergerjoindate,lastday
            title.setDateOfJoin(randomdate);
            title.setPremergerJoiningDate(randomdate);
            title.setLastDay(randomdate);
            title.setDateOfBirth(randomdate);
            title.setLastContractRenewalDate(randomdate);
            title.setPassportExpiryDate(randomdate);
            title.setGroupLastDay(randomdate);
            title.setGroupJoiningDate(randomdate);

            //education
            title.setEducationInfo1EducationRegion(randomstring5);
            title.setEducationInfo1School(randomstring5);
            title.setEducationInfo1FieldofStudy1(randomstring5);
            title.setEducationInfo1FieldofStudy2(randomstring5);
            title.setEducationInfo1FieldofStudy3(randomstring5);
            title.setEducationInfo1LevelofEducation(randomstring5);
            title.setEducationInfo1YearofGraduation(randomdate);
            //education
            title.setEducationInfo2EducationRegion(randomstring5);
            title.setEducationInfo2School(randomstring5);
            title.setEducationInfo2FieldofStudy1(randomstring5);
            title.setEducationInfo2FieldofStudy2(randomstring5);
            title.setEducationInfo2FieldofStudy3(randomstring5);
            title.setEducationInfo2LevelofEducation(randomstring5);
            title.setEducationInfo2YearofGraduation(randomdate);
            //education
            title.setEducationInfo3EducationRegion(randomstring5);
            title.setEducationInfo3School(randomstring5);
            title.setEducationInfo3FieldofStudy1(randomstring5);
            title.setEducationInfo3FieldofStudy2(randomstring5);
            title.setEducationInfo3FieldofStudy3(randomstring5);
            title.setEducationInfo3LevelofEducation(randomstring5);
            title.setEducationInfo3YearofGraduation(randomdate);
            //education
            title.setEducationInfo4EducationRegion(randomstring5);
            title.setEducationInfo4School(randomstring5);
            title.setEducationInfo4FieldofStudy1(randomstring5);
            title.setEducationInfo4FieldofStudy2(randomstring5);
            title.setEducationInfo4FieldofStudy3(randomstring5);
            title.setEducationInfo4LevelofEducation(randomstring5);
            title.setEducationInfo4YearofGraduation(randomdate);
            //education
            title.setEducationInfo5EducationRegion(randomstring5);
            title.setEducationInfo5School(randomstring5);
            title.setEducationInfo5FieldofStudy1(randomstring5);
            title.setEducationInfo5FieldofStudy2(randomstring5);
            title.setEducationInfo5FieldofStudy3(randomstring5);
            title.setEducationInfo5LevelofEducation(randomstring5);
            title.setEducationInfo5YearofGraduation(randomdate);
            //education
            title.setEducationInfo6EducationRegion(randomstring5);
            title.setEducationInfo6School(randomstring5);
            title.setEducationInfo6FieldofStudy1(randomstring5);
            title.setEducationInfo6FieldofStudy2(randomstring5);
            title.setEducationInfo6FieldofStudy3(randomstring5);
            title.setEducationInfo6LevelofEducation(randomstring5);
            title.setEducationInfo6YearofGraduation(randomdate);
            //education
            title.setEducationInfo7EducationRegion(randomstring5);
            title.setEducationInfo7School(randomstring5);
            title.setEducationInfo7FieldofStudy1(randomstring5);
            title.setEducationInfo7FieldofStudy2(randomstring5);
            title.setEducationInfo7FieldofStudy3(randomstring5);
            title.setEducationInfo7LevelofEducation(randomstring5);
            title.setEducationInfo7YearofGraduation(randomdate);
            //education
            title.setEducationInfo8EducationRegion(randomstring5);
            title.setEducationInfo8School(randomstring5);
            title.setEducationInfo8FieldofStudy1(randomstring5);
            title.setEducationInfo8FieldofStudy2(randomstring5);
            title.setEducationInfo8FieldofStudy3(randomstring5);
            title.setEducationInfo8LevelofEducation(randomstring5);
            title.setEducationInfo8YearofGraduation(randomdate);
            //education
            title.setEducationInfo9EducationRegion(randomstring5);
            title.setEducationInfo9School(randomstring5);
            title.setEducationInfo9FieldofStudy1(randomstring5);
            title.setEducationInfo9FieldofStudy2(randomstring5);
            title.setEducationInfo9FieldofStudy3(randomstring5);
            title.setEducationInfo9LevelofEducation(randomstring5);
            title.setEducationInfo9YearofGraduation(randomdate);
            //education
            title.setEducationInfo10EducationRegion(randomstring5);
            title.setEducationInfo10School(randomstring5);
            title.setEducationInfo10FieldofStudy1(randomstring5);
            title.setEducationInfo10FieldofStudy2(randomstring5);
            title.setEducationInfo10FieldofStudy3(randomstring5);
            title.setEducationInfo10LevelofEducation(randomstring5);
            title.setEducationInfo10YearofGraduation(randomdate);

            list.add(title);
        }
        return list;
    }


}
