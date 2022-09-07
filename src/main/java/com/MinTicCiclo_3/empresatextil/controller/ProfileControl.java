package com.MinTicCiclo_3.empresatextil.controller;

import com.MinTicCiclo_3.empresatextil.entity.Profile;
import com.MinTicCiclo_3.empresatextil.services.ProfileServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfileControl {
    @Autowired
    private ProfileServ profileServ;

    @GetMapping("/profile")
    public List<Profile> getProfileById() {

        return profileServ.getAllProfiles();
    }

    @PostMapping("/profile")
    public Profile createProfile(@RequestBody Profile profile) {
        return profileServ.createProfile(profile);
    }

}
