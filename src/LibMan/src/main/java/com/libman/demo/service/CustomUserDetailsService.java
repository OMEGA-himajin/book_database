package com.libman.demo.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.libman.demo.model.Staff;
import com.libman.demo.repository.StaffRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final StaffRepository staffRepository;

    public CustomUserDetailsService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Staff staff = staffRepository.findByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return User.builder()
                .username(staff.getUserName())
                .password(staff.getPassword())
                .roles("USER")  // 必要に応じてロールを設定
                .build();
    }
}
