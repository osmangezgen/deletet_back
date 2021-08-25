package com.deletet.deletet3.Applications;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;



@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class Application {


        @Id
        @SequenceGenerator(name="application_squence",sequenceName= "application_sequence", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE,
                generator = "application_sequence")
        private Long id;
        private Long applicantId;
        private String companyName;
        private String companyLocation;
        private String companyIcon;
        private String companyDesc;
        private String applicationDate;
        private String wayOfWorking;
        private String advertsTitle;
        private String advertsDescription;
        private int status;

        public Application(Long id, Long applicantId,String companyName, String companyLocation, String companyIcon, String companyDesc, String applicationDate, String wayOfWorking, String advertsTitle, String advertsDescription, int status) {
            this.id = id;
            this.applicantId = applicantId;
            this.companyName = companyName;
            this.companyLocation = companyLocation;
            this.companyIcon = companyIcon;
            this.companyDesc = companyDesc;
            this.applicationDate = applicationDate;
            this.wayOfWorking = wayOfWorking;
            this.advertsTitle = advertsTitle;
            this.advertsDescription = advertsDescription;
            this.status = status;
        }
    }

