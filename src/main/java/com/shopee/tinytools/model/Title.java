package com.shopee.tinytools.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.format.NumberFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

import java.util.Date;

@Data
public class Title {

    @ExcelProperty("ID")
    @ColumnWidth(20)
    private String id;

    @ExcelProperty("Staff ID")
    @ColumnWidth(20)
    private String staffId;

    @ExcelProperty("Full name (English)")
    @ColumnWidth(20)
    private String fullNameEnglish;

    @ExcelProperty("Status")
    @ColumnWidth(20)
    private String status;

    @ExcelProperty("Function")
    @ColumnWidth(20)
    private String function;

    @ExcelProperty("Department")
    @ColumnWidth(20)
    private String department;

    @ExcelProperty("Department Code")
    @ColumnWidth(20)
    private String departmentCode;

    @ExcelProperty("Bussiness Unit")
    @ColumnWidth(20)
    private String bussinessUnit;

    @ExcelProperty("Segment Code")
    @ColumnWidth(20)
    private String segmentCode;

    @ExcelProperty("Product")
    @ColumnWidth(20)
    private String product;

    @ExcelProperty("Product Code")
    @ColumnWidth(20)
    private String productCode;

    @ExcelProperty("Region")
    @ColumnWidth(20)
    private String region;

    @ExcelProperty("Legal Entity")
    @ColumnWidth(20)
    private String legalEntity;

    @ExcelProperty("Legal Entity Code")
    @ColumnWidth(20)
    private String legalEntityCode;

    @ExcelProperty("Date of Join")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy/MM/dd")
    private String dateOfJoin;

    @ExcelProperty("Premerger Joining Date")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy/MM/dd")
    private String premergerJoiningDate;

    @ExcelProperty("Base year")
    @ColumnWidth(20)
    private String baseYear;

    @ExcelProperty("Seniority")
    @ColumnWidth(20)
    private String seniority;

    @ExcelProperty("Last Day")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy/MM/dd")
    private String lastDay;

    @ExcelProperty("Display Name")
    @ColumnWidth(20)
    private String displayName;

    @ExcelProperty("Team in Org chart")
    @ColumnWidth(20)
    private String teamInOrgChart;

    @ExcelProperty("Email")
    @ColumnWidth(20)
    private String email;

    @ExcelProperty("CellPhone NO.")
    @ColumnWidth(20)
    private String cellPhoneNo;

    @ExcelProperty("Rank")
    @ColumnWidth(20)
    private String rank;

    @ExcelProperty("Rank System")
    @ColumnWidth(20)
    private String rankSystem;

    @ExcelProperty("Title")
    @ColumnWidth(20)
    private String title;

    @ExcelProperty("Reporting Manager")
    @ColumnWidth(20)
    private String reportingManager;

    @ExcelProperty("Reporting Manager Staff ID")
    @ColumnWidth(20)
    private String reportingManagerStaffId;

    @ExcelProperty("Day-to-Day Manager")
    @ColumnWidth(20)
    private String dayTODayManager;

    @ExcelProperty("Day-to-Day Manager Staff ID")
    @ColumnWidth(20)
    private String dayTODayManagerStaffId;

    @ExcelProperty("First Name")
    @ColumnWidth(20)
    private String firstName;

    @ExcelProperty("Surname")
    @ColumnWidth(20)
    private String surname;

    @ExcelProperty("PersonalEmail")
    @ColumnWidth(20)
    private String personalEmail;

    @ExcelProperty("Full Name (Local Language)")
    @ColumnWidth(20)
    private String fullNameLocalLanguage;

    @ExcelProperty("Scheme")
    @ColumnWidth(20)
    private String scheme;

    @ExcelProperty("Date of Birth")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy/MM/dd")
    private String dateOfBirth;

    @ExcelProperty("Gender")
    @ColumnWidth(20)
    private String gender;

    @ExcelProperty("Marriage Status")
    @ColumnWidth(20)
    private String marriageStatus;

    @ExcelProperty("Nationality")
    @ColumnWidth(20)
    private String nationality;

    @ExcelProperty("NRIC/FIN")
    @ColumnWidth(20)
    private String NRICFIN;

    @ExcelProperty("Passport")
    @ColumnWidth(20)
    private String Passport;

    @ExcelProperty("Contact Address")
    @ColumnWidth(20)
    private String ContactAddress;

    @ExcelProperty("Country")
    @ColumnWidth(20)
    private String Country;

    @ExcelProperty("Postal Code")
    @ColumnWidth(20)
    private String PostalCode;

    @ExcelProperty("Role")
    @ColumnWidth(20)
    private String Role;

    @ExcelProperty("HRM")
    @ColumnWidth(20)
    private String HRM;

    @ExcelProperty("HR")
    @ColumnWidth(20)
    private String HR;

    @ExcelProperty("Other HR")
    @ColumnWidth(20)
    private String OtherHR;

    @ExcelProperty("Photo")
    @ColumnWidth(20)
    private String Photo;

    @ExcelProperty("Project/Purchase Company")
    @ColumnWidth(20)
    private String ProjectPurchaseCompany;

    @ExcelProperty("Claim Approval Manager")
    @ColumnWidth(20)
    private String ClaimApprovalManager;

    @ExcelProperty("Procurement Approval Manager")
    @ColumnWidth(20)
    private String ProcurementApprovalManager;

    @ExcelProperty("IC Type")
    @ColumnWidth(20)
    private String ICType;

    @ExcelProperty("IC Issue Date")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy/MM/dd")
    private String ICIssueDate;

    @ExcelProperty("Probation End Date")
    @ColumnWidth(20)
    private String ProbationEndDate;

    @ExcelProperty("Contract Expiry Date")
    @ColumnWidth(20)
    private String ContractExpiryDate;

    @ExcelProperty("Age")
    @ColumnWidth(20)
    private int Age;

    @ExcelProperty("Race")
    @ColumnWidth(20)
    private String Race;

    @ExcelProperty("Bank Name")
    @ColumnWidth(20)
    private String BankName;

    @ExcelProperty("Bank Branch Name")
    @ColumnWidth(20)
    private String BankBranchName;

    @ExcelProperty("Account No.")
    @ColumnWidth(20)
    private String AccountNo;

    @ExcelProperty("Account Holder Name")
    @ColumnWidth(20)
    private String AccountHolderName;

    @ExcelProperty("Bank SWIFT Code")
    @ColumnWidth(20)
    private String BankSWIFTCode;

    @ExcelProperty("Bank Branch SWIFT Code")
    @ColumnWidth(20)
    private String BankBranchSWIFTCode;

    @ExcelProperty("Trading Pre-clearance Required")
    @ColumnWidth(20)
    private String TradingPreclearanceRequired;

    @ExcelProperty("Cost Center Team")
    @ColumnWidth(20)
    private String CostCenterTeam;

    @ExcelProperty("Tax ID")
    @ColumnWidth(20)
    private String TaxID;

    @ExcelProperty("Social Security ID")
    @ColumnWidth(20)
    private String SocialSecurityID;

    @ExcelProperty("Family Certificate ID")
    @ColumnWidth(20)
    private String FamilyCertificateID;

    @ExcelProperty("Religion")
    @ColumnWidth(20)
    private String Religion;

    @ExcelProperty("Number of Children")
    @ColumnWidth(20)
    private int NumberofChildren;

    @ExcelProperty("Employment Type")
    @ColumnWidth(20)
    private String EmploymentType;

    @ExcelProperty("Employment Duration")
    @ColumnWidth(20)
    private String EmploymentDuration;

    @ExcelProperty("Last Contract Renewal Date")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy/MM/dd")
    private String LastContractRenewalDate;

    @ExcelProperty("Mailing Address")
    @ColumnWidth(20)
    private String MailingAddress;

    @ExcelProperty("Nickname")
    @ColumnWidth(20)
    private String Nickname;

    @ExcelProperty("Passport Expiry Date")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy/MM/dd")
    private String PassportExpiryDate;

    @ExcelProperty("Shift Worker")
    @ColumnWidth(20)
    private String ShiftWorker;

    @ExcelProperty("Office")
    @ColumnWidth(20)
    private String Office;

    @ExcelProperty("BOD Tag")
    @ColumnWidth(20)
    private String BODTag;

    @ExcelProperty("Full Name")
    @ColumnWidth(20)
    private String FullName;

    @ExcelProperty("Reporting Line")
    @ColumnWidth(20)
    private String ReportingLine;

    @ExcelProperty("Leaving Reason")
    @ColumnWidth(20)
    private String LeavingReason;

    @ExcelProperty("Remarks")
    @ColumnWidth(20)
    private String Remarks;

    @ExcelProperty("Notice Period")
    @ColumnWidth(20)
    private String NoticePeriod;

    @ExcelProperty("Resign Reasons")
    @ColumnWidth(20)
    private String ResignReasons;

    @ExcelProperty("Group Last Day")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy/MM/dd")
    private String GroupLastDay;

    @ExcelProperty("Group Joining Date")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy/MM/dd")
    private String GroupJoiningDate;


    @ExcelProperty("Linked ID")
    @ColumnWidth(20)
    private String LinkedID;

    @ExcelProperty("Cover Range")
    @ColumnWidth(20)
    private String CoverRange;

    @ExcelProperty("Other Emails")
    @ColumnWidth(20)
    private String OtherEmails;

    @ExcelProperty("Level")
    @ColumnWidth(20)
    private String Level;

    @ExcelProperty("Last Email")
    @ColumnWidth(20)
    private String LastEmail;

    @ExcelProperty("Shopee User ID")
    @ColumnWidth(20)
    private String ShopeeUserID;


    @ExcelProperty("Direct Subordinates")
    @ColumnWidth(20)
    private int DirectSubordinates;

    @ExcelProperty("Direct and Indirect Subordinates")
    @ColumnWidth(20)
    private int DirectandIndirectSubordinates;

    @ExcelProperty("Tenure in Sea Group")
    @ColumnWidth(20)
    private int TenureinSeaGroup;

    @ExcelProperty("Education Info 1 - Education Region")
    @ColumnWidth(20)
    private String EducationInfo1EducationRegion;

    @ExcelProperty("Education Info 1 - School")
    @ColumnWidth(20)
    private String EducationInfo1School;

    @ExcelProperty("Education Info 1 - Level of Education")
    @ColumnWidth(20)
    private String EducationInfo1LevelofEducation;

    @ExcelProperty("Education Info 1 - Field of Study(1)")
    @ColumnWidth(20)
    private String EducationInfo1FieldofStudy1;

    @ExcelProperty("Education Info 1 - Field of Study(2)")
    @ColumnWidth(20)
    private String EducationInfo1FieldofStudy2;

    @ExcelProperty("Education Info 1 - Field of Study(3)")
    @ColumnWidth(20)
    private String EducationInfo1FieldofStudy3;

    @ExcelProperty("Education Info 1 - Year of Graduation")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy")
    private String EducationInfo1YearofGraduation;

    @ExcelProperty("Education Info 2 - Education Region")
    @ColumnWidth(20)
    private String EducationInfo2EducationRegion;

    @ExcelProperty("Education Info 2 - School")
    @ColumnWidth(20)
    private String EducationInfo2School;

    @ExcelProperty("Education Info 2 - Level of Education")
    @ColumnWidth(20)
    private String EducationInfo2LevelofEducation;

    @ExcelProperty("Education Info 2 - Field of Study(1)")
    @ColumnWidth(20)
    private String EducationInfo2FieldofStudy1;

    @ExcelProperty("Education Info 2 - Field of Study(2)")
    @ColumnWidth(20)
    private String EducationInfo2FieldofStudy2;

    @ExcelProperty("Education Info 2 - Field of Study(3)")
    @ColumnWidth(20)
    private String EducationInfo2FieldofStudy3;

    @ExcelProperty("Education Info 2 - Year of Graduation")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy")
    private String EducationInfo2YearofGraduation;

    @ExcelProperty("Education Info 3 - Education Region")
    @ColumnWidth(20)
    private String EducationInfo3EducationRegion;

    @ExcelProperty("Education Info 3 - School")
    @ColumnWidth(20)
    private String EducationInfo3School;

    @ExcelProperty("Education Info 3 - Level of Education")
    @ColumnWidth(20)
    private String EducationInfo3LevelofEducation;

    @ExcelProperty("Education Info 3 - Field of Study(1)")
    @ColumnWidth(20)
    private String EducationInfo3FieldofStudy1;

    @ExcelProperty("Education Info 3 - Field of Study(2)")
    @ColumnWidth(20)
    private String EducationInfo3FieldofStudy2;

    @ExcelProperty("Education Info 3 - Field of Study(3)")
    @ColumnWidth(20)
    private String EducationInfo3FieldofStudy3;

    @ExcelProperty("Education Info 3 - Year of Graduation")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy")
    private String EducationInfo3YearofGraduation;

    @ExcelProperty("Education Info 4 - Education Region")
    @ColumnWidth(20)
    private String EducationInfo4EducationRegion;

    @ExcelProperty("Education Info 4 - School")
    @ColumnWidth(20)
    private String EducationInfo4School;

    @ExcelProperty("Education Info 4 - Level of Education")
    @ColumnWidth(20)
    private String EducationInfo4LevelofEducation;

    @ExcelProperty("Education Info 4 - Field of Study(1)")
    @ColumnWidth(20)
    private String EducationInfo4FieldofStudy1;

    @ExcelProperty("Education Info 4 - Field of Study(2)")
    @ColumnWidth(20)
    private String EducationInfo4FieldofStudy2;

    @ExcelProperty("Education Info 4 - Field of Study(3)")
    @ColumnWidth(20)
    private String EducationInfo4FieldofStudy3;

    @ExcelProperty("Education Info 4 - Year of Graduation")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy")
    private String EducationInfo4YearofGraduation;

    @ExcelProperty("Education Info 5 - Education Region")
    @ColumnWidth(20)
    private String EducationInfo5EducationRegion;

    @ExcelProperty("Education Info 5 - School")
    @ColumnWidth(20)
    private String EducationInfo5School;

    @ExcelProperty("Education Info 5 - Level of Education")
    @ColumnWidth(20)
    private String EducationInfo5LevelofEducation;

    @ExcelProperty("Education Info 5 - Field of Study(1)")
    @ColumnWidth(20)
    private String EducationInfo5FieldofStudy1;

    @ExcelProperty("Education Info 5 - Field of Study(2)")
    @ColumnWidth(20)
    private String EducationInfo5FieldofStudy2;

    @ExcelProperty("Education Info 5 - Field of Study(3)")
    @ColumnWidth(20)
    private String EducationInfo5FieldofStudy3;

    @ExcelProperty("Education Info 5 - Year of Graduation")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy")
    private String EducationInfo5YearofGraduation;

    @ExcelProperty("Education Info 6 - Education Region")
    @ColumnWidth(20)
    private String EducationInfo6EducationRegion;

    @ExcelProperty("Education Info 6 - School")
    @ColumnWidth(20)
    private String EducationInfo6School;

    @ExcelProperty("Education Info 6 - Level of Education")
    @ColumnWidth(20)
    private String EducationInfo6LevelofEducation;

    @ExcelProperty("Education Info 6 - Field of Study(1)")
    @ColumnWidth(20)
    private String EducationInfo6FieldofStudy1;

    @ExcelProperty("Education Info 6 - Field of Study(2)")
    @ColumnWidth(20)
    private String EducationInfo6FieldofStudy2;

    @ExcelProperty("Education Info 6 - Field of Study(3)")
    @ColumnWidth(20)
    private String EducationInfo6FieldofStudy3;

    @ExcelProperty("Education Info 6 - Year of Graduation")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy")
    private String EducationInfo6YearofGraduation;

    @ExcelProperty("Education Info 7 - Education Region")
    @ColumnWidth(20)
    private String EducationInfo7EducationRegion;

    @ExcelProperty("Education Info 7 - School")
    @ColumnWidth(20)
    private String EducationInfo7School;

    @ExcelProperty("Education Info 7 - Level of Education")
    @ColumnWidth(20)
    private String EducationInfo7LevelofEducation;

    @ExcelProperty("Education Info 7 - Field of Study(1)")
    @ColumnWidth(20)
    private String EducationInfo7FieldofStudy1;

    @ExcelProperty("Education Info 7 - Field of Study(2)")
    @ColumnWidth(20)
    private String EducationInfo7FieldofStudy2;

    @ExcelProperty("Education Info 1 - Field of Study(3)")
    @ColumnWidth(20)
    private String EducationInfo7FieldofStudy3;

    @ExcelProperty("Education Info 7 - Year of Graduation")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy")
    private String EducationInfo7YearofGraduation;

    @ExcelProperty("Education Info 8 - Education Region")
    @ColumnWidth(20)
    private String EducationInfo8EducationRegion;

    @ExcelProperty("Education Info 8 - School")
    @ColumnWidth(20)
    private String EducationInfo8School;

    @ExcelProperty("Education Info 8 - Level of Education")
    @ColumnWidth(20)
    private String EducationInfo8LevelofEducation;

    @ExcelProperty("Education Info 8 - Field of Study(1)")
    @ColumnWidth(20)
    private String EducationInfo8FieldofStudy1;

    @ExcelProperty("Education Info 8 - Field of Study(2)")
    @ColumnWidth(20)
    private String EducationInfo8FieldofStudy2;

    @ExcelProperty("Education Info 8 - Field of Study(3)")
    @ColumnWidth(20)
    private String EducationInfo8FieldofStudy3;

    @ExcelProperty("Education Info 8 - Year of Graduation")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy")
    private String EducationInfo8YearofGraduation;

    @ExcelProperty("Education Info 1 - Education Region")
    @ColumnWidth(20)
    private String EducationInfo9EducationRegion;

    @ExcelProperty("Education Info 9 - School")
    @ColumnWidth(20)
    private String EducationInfo9School;

    @ExcelProperty("Education Info 9 - Level of Education")
    @ColumnWidth(20)
    private String EducationInfo9LevelofEducation;

    @ExcelProperty("Education Info 9 - Field of Study(1)")
    @ColumnWidth(20)
    private String EducationInfo9FieldofStudy1;

    @ExcelProperty("Education Info 9 - Field of Study(2)")
    @ColumnWidth(20)
    private String EducationInfo9FieldofStudy2;

    @ExcelProperty("Education Info 9 - Field of Study(3)")
    @ColumnWidth(20)
    private String EducationInfo9FieldofStudy3;

    @ExcelProperty("Education Info 9 - Year of Graduation")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy")
    private String EducationInfo9YearofGraduation;

    @ExcelProperty("Education Info 10 - Education Region")
    @ColumnWidth(20)
    private String EducationInfo10EducationRegion;

    @ExcelProperty("Education Info 10 - School")
    @ColumnWidth(20)
    private String EducationInfo10School;

    @ExcelProperty("Education Info 10 - Level of Education")
    @ColumnWidth(20)
    private String EducationInfo10LevelofEducation;

    @ExcelProperty("Education Info 10 - Field of Study(1)")
    @ColumnWidth(20)
    private String EducationInfo10FieldofStudy1;

    @ExcelProperty("Education Info 10 - Field of Study(2)")
    @ColumnWidth(20)
    private String EducationInfo10FieldofStudy2;

    @ExcelProperty("Education Info 10 - Field of Study(3)")
    @ColumnWidth(20)
    private String EducationInfo10FieldofStudy3;

    @ExcelProperty("Education Info 10 - Year of Graduation")
    @ColumnWidth(20)
    //@DateTimeFormat("yyyy")
    private String EducationInfo10YearofGraduation;
}
