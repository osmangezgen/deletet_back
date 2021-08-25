package com.deletet.deletet3.Adverts;


import com.deletet.deletet3.appuser.AppUserRole;
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
public class Adverts {

    @Id
    @SequenceGenerator(name="advert_squence",sequenceName= "advert_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "advert_sequence")
    private Long id;
    private Long categoryId;
    private String companyName;
    private String companyLocation;
    private String companyIcon;
    private String companyDesc;
    private String advertsDate;
    private String wayOfWorking;
    private String advertsAbout;
    private String advertsTitle;
    private String advertsDescription;

    public Adverts(Long id, Long categoryId,String companyName, String companyLocation, String companyIcon, String companyDesc, String advertsDate, String wayOfWorking, String advertsAbout, String advertsTitle, String advertsDescription) {
        this.id = id;
        this.categoryId = categoryId;
        this.companyName = companyName;
        this.companyLocation = companyLocation;
        this.companyIcon = companyIcon;
        this.companyDesc = companyDesc;
        this.advertsDate = advertsDate;
        this.wayOfWorking = wayOfWorking;
        this.advertsAbout = advertsAbout;
        this.advertsTitle = advertsTitle;
        this.advertsDescription = advertsDescription;
    }
}
