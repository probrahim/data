package com.example.data.controller;


import com.example.data.enitys.Userinfo;
import com.example.data.service.UserinfoService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("api/users")
public class UserinfoController {
    @Autowired
    private UserinfoService userinfoService;

    @PostMapping
    public Userinfo createuser(@RequestBody Userinfo userinfo) {
        return userinfoService.addUser(userinfo);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Userinfo> deleteuser(@PathVariable long id) {
        userinfoService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }


}
/*

 */