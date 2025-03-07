package com.XCLONE.Backend_Venue.Service;
import com.XCLONE.Backend_Venue.Entity.Users;
import com.XCLONE.Backend_Venue.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    public boolean saveNewUser(Users user){
        try {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            user.setRoles(Arrays.asList("USER"));
            userRepository.save(user);
            return true;
        } catch (Exception e){
            System.out.println("Exception: "+ e);
            return false;
        }
    }

    public void saveNewAdmin(Users user){
        try {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            if (user.getRoles() == null) {
                user.setRoles(new ArrayList<>());
            }
            user.getRoles().clear();
            user.getRoles().addAll(Arrays.asList("USER", "ADMIN"));
            userRepository.save(user);
        } catch (Exception e){
            System.out.println("Exception: "+ e);
        }
    }
    public void saveSeller(Users user){
        try {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            user.setRoles(Arrays.asList("USER","SELLER"));
            userRepository.save(user);
        } catch (Exception e){
            System.out.println("Exception: "+ e);
        }
    }

    public void saveUser(Users user){
        try {
            userRepository.save(user);
        } catch (Exception e){
            System.out.println("Exception: "+ e);
        }
    }

    public List<Users> getAll(){
        return userRepository.findAll();
    }

    public Optional<Users> findById(Long id){
        return userRepository.findById(id);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

    public Users findByUserName(String username){
        return userRepository.findByUserName(username);
    }
}
