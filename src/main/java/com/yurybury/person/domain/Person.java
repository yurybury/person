package com.yurybury.person.domain;

import java.net.URI;
import java.time.OffsetDateTime;

public class Person {

    private String id;
    private URI href;
    private String status;
    private OffsetDateTime creationDate;
    private OffsetDateTime lastUpdate;
    private OffsetDateTime fromDate;
    private OffsetDateTime toDate;
    private String namePrefix;
    private String givenName;
    private String middleName;
    private String familyName;
    private String nickname;
    private String gender;
    private String eMailAddress;
    private String workPhone;
    private String privatePhone;
    private String webHomePage;

    // Getters and setters

    public String getId() {
      return id;
    }
    
    public void setId(String id) {
      this.id = id;
    }

    //
    public URI getHref() {
      return href;
    }
    
    public void setHref(URI href) {
      this.href = href;
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
         
}
