package com.deletet.deletet3.Profile;


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
public class Profile {

    @Id
    @SequenceGenerator(name = "profile_squence", sequenceName = "profile_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "profile_sequence")
    private Long id;
    private Long userId;
    private String imageUrl;
    private String fullName;
    @Column(columnDefinition = "TEXT")
    private String about;
    private String tckn;
    private String address;
    private String website;
    private String phoneNumber;
    private String email;
    private String university;
    @Column(columnDefinition = "TEXT")
    private String experiences;
    private String followingTitles;
    private int profilePoints;
    private int forumPoints;

    public Profile(Long id, Long userId, String imageUrl, String fullName, String about, String tckn, String address, String website, String phoneNumber, String email, String university, String experiences, String followingTitles, int profilePoints, int forumPoints) {
        this.id = id;
        this.userId = userId;
        this.imageUrl = imageUrl;
        this.fullName = fullName;
        this.about = about;
        this.tckn = tckn;
        this.address = address;
        this.website = website;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.university = university;
        this.experiences = experiences;
        this.followingTitles = followingTitles;
        this.profilePoints = profilePoints;
        this.forumPoints = forumPoints;
    }

    public Profile(Long userId, String fullName,String email)
    {
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
    }


    public Profile(String imageUrl, String fullName, String about, String tckn, String address, String website, String phoneNumber, String email, String university, String experiences, String followingTitles) {
        this.imageUrl = imageUrl;
        this.fullName = fullName;
        this.about = about;
        this.tckn = tckn;
        this.address = address;
        this.website = website;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.university = university;
        this.experiences = experiences;
        this.followingTitles = followingTitles;
    }
}
