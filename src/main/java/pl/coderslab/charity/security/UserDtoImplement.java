package pl.coderslab.charity.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service("UserDtoImplement")
public class UserDtoImplement implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }

//    private final UserRepository userRepository;
//
//    @Autowired
//    public UserDtoImplement(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    @Transactional
//    public UserDetails loadUserByUsername(String email) {
//        User user = userRepository.findByEmail(email);
//        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), true, true, true, true, Role.USER.getAuthorities());
//    }
}