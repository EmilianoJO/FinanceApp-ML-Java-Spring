package com.FinanceTrack.FinanceAppML.Auth;

import org.springframework.stereotype.Service;

import com.FinanceTrack.FinanceAppML.Jwt.JwtService;
import com.FinanceTrack.FinanceAppML.User.Role;
import com.FinanceTrack.FinanceAppML.User.User;
import com.FinanceTrack.FinanceAppML.User.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final JwtService jwtService;

    public AuthResponse login(LoginRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    public AuthResponse register(RegisterRequest request) {
        User user = User.builder().username(request.getUsername())
                .password(request.getPassword()).firstname(request.getFirstname()).lastname(request.getLastname())
                .role(Role.USER).build();

        userRepository.save(user);
        return AuthResponse.builder().token(jwtService.getToken(user)).build();
    }

}
