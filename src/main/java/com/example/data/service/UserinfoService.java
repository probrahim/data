package com.example.data.service;


import com.example.data.enitys.Userinfo;
import com.example.data.repository.UserinfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserinfoService {

    @Autowired
    private UserinfoRepository userinfoRepository;


    public Userinfo addUser(Userinfo userinfo) {
        return userinfoRepository.save(userinfo);
    }
    public Userinfo editUser(long id , Userinfo userinfo) {
        userinfo.setId(id);
        return userinfoRepository.save(userinfo);
    }
    public void deleteUser(long id) {
        userinfoRepository.deleteById(id);
    }

}
