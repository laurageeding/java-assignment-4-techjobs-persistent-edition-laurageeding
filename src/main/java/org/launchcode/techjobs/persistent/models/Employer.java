package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min=2, max=100, message="Location must be at least 2 characters")
    private String location;

    public Employer(@Size(min=2, max=100, message="Location must be at least 2 characters") String location){
        this.location = location;
    }

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
