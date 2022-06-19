package com.yurybury.person.domain;

import java.net.URI;
import java.time.OffsetDateTime;

import javax.persistence.*;


@Entity
@Table(name = "Person")
public class Person {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column(name = "status")
    private String status;
    @Column(name = "creationDate")
    private OffsetDateTime creationDate;
    @Column(name = "lastUpdate")
    private OffsetDateTime lastUpdate;
    @Column(name = "fromDate")
    private OffsetDateTime fromDate;
    @Column(name = "toDate")
    private OffsetDateTime toDate;
    @Column(name = "namePrefix")
    private String namePrefix;
    @Column(name = "givenName")
    private String givenName;
    @Column(name = "middleName")
    private String middleName;
    @Column(name = "familyName")
    private String familyName;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "gender")
    private String gender;
    @Column(name = "eMailAddress")
    private String eMailAddress;
    @Column(name = "workPhone")
    private String workPhone;
    @Column(name = "privatePhone")
    private String privatePhone;
    @Column(name = "webHomePage")
    private String webHomePage;

    /*
    public Person(String id, String status, OffsetDateTime creationDate, OffsetDateTime lastUpdate, OffsetDateTime fromDate,
        OffsetDateTime toDate, String namePrefix, String givenName, String middleName, String familyName, String nickname,
        String gender, String eMailAddress, String workPhone, String privatePhone, String webHomePage) {
      this.id = id;
      this.status = status;
      this.creationDate = creationDate;
      this.lastUpdate = lastUpdate;
      this.fromDate = fromDate;
      this.toDate = toDate;
      this.namePrefix = namePrefix;
      this.givenName = givenName;
      this.middleName = middleName;
      this.familyName = familyName;
      this.nickname = nickname;
      this.gender = gender;
      this.eMailAddress = eMailAddress;
      this.workPhone = workPhone;
      this.privatePhone = privatePhone;
      this.webHomePage = webHomePage;
    }
    */

    // Getters and setters

    public String getId() {
      return id;
    }
    
    public void setId(String id) {
      this.id = id;
    }

    //
    public String getStatus() {
      return status;
    }
    
    public void setStatus(String status) {
      this.status = status;
    }

    //
    public OffsetDateTime getCreationDate() {
      return creationDate;
    }
    
    public void setCreationDate(OffsetDateTime creationDate) {
      this.creationDate = creationDate;
    }

    //
    public OffsetDateTime getLastUpdate() {
      return lastUpdate;
    }
    
    public void setLastUpdate(OffsetDateTime lastUpdate) {
      this.lastUpdate = lastUpdate;
    }

    //
    public OffsetDateTime getFromDate() {
      return fromDate;
    }
    
    public void setFromDate(OffsetDateTime fromDate) {
      this.fromDate = fromDate;
    }

    //
    public OffsetDateTime getToDate() {
      return toDate;
    }
    
    public void setToDate(OffsetDateTime toDate) {
      this.toDate = toDate;
    }

    //
    public String getNamePrefix() {
      return namePrefix;
    }
    
    public void setNamePrefix(String namePrefix) {
      this.namePrefix = namePrefix;
    }

    //
    public String getGivenName() {
      return givenName;
    }
    
    public void setGivenName(String givenName) {
      this.givenName = givenName;
    }

    //
    public String getMiddleName() {
      return middleName;
    }
    
    public void setMiddleName(String middleName) {
      this.middleName = middleName;
    }

    //
    public String getFamilyName() {
      return familyName;
    }
    
    public void setFamilyName(String familyName) {
      this.familyName = familyName;
    }

    //
    public String getNickname() {
      return nickname;
    }
    
    public void setNickname(String nickname) {
      this.nickname = nickname;
    }

    //
    public String getGender() {
      return gender;
    }
    
    public void setGender(String gender) {
      this.gender = gender;
    }

    //
    public String geteMailAddress() {
      return eMailAddress;
    }
    
    public void seteMailAddress(String eMailAddress) {
      this.eMailAddress = eMailAddress;
    }

    //
    public String getWorkPhone() {
      return workPhone;
    }
    
    public void setWorkPhone(String workPhone) {
      this.workPhone = workPhone;
    }

    //
    public String getPrivatePhone() {
      return privatePhone;
    }
    
    public void setPrivatePhone(String privatePhone) {
      this.privatePhone = privatePhone;
    }

    //
    public String getWebHomePage() {
      return webHomePage;
    }
    
    public void setWebHomePage(String webHomePage) {
      this.webHomePage = webHomePage;
    }
         
    /*
    @Override
    public String toString() {
      return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
    */
}
