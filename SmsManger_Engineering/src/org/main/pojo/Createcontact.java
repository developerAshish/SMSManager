package org.main.pojo;
// Generated Feb 18, 2017 2:36:46 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Createcontact generated by hbm2java
 */
@Entity
@Table(name="createcontact"
    ,catalog="sms_managerengg"
)
public class Createcontact  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String details;
     private Date entrydate;
     private Character active;

    public Createcontact() {
    }

    public Createcontact(String name, String details, Date entrydate, Character active) {
       this.name = name;
       this.details = details;
       this.entrydate = entrydate;
       this.active = active;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="name", length=65535)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="details", length=65535)
    public String getDetails() {
        return this.details;
    }
    
    public void setDetails(String details) {
        this.details = details;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="entrydate", length=10)
    public Date getEntrydate() {
        return this.entrydate;
    }
    
    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    
    @Column(name="active", length=1)
    public Character getActive() {
        return this.active;
    }
    
    public void setActive(Character active) {
        this.active = active;
    }




}


