package com.example.ToDoList.filter;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.example.ToDoList.repository.IUsers;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Base64;

@Component
public class FilterTasks extends OncePerRequestFilter {
    @Autowired
    IUsers userDB;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        var pathFilter = request.getServletPath();

        if (pathFilter.startsWith("/tasks")) {
            var authorization = request.getHeader("Authorization");

            var authorizationInfo = authorization.substring("Basic".length()).trim();

            byte[] authorizationByte = Base64.getDecoder().decode(authorizationInfo);

            var authorizationString = new String(authorizationByte);

            String[] authArrayString = authorizationString.split(":");
            var authUser = authArrayString[0];
            var authPassword = authArrayString[1];

            var user = this.userDB.findByUserName(authUser);
            if (user == null) {
                response.sendError(401);
            } else {
                var password = BCrypt.verifyer().verify(authPassword.toCharArray(), user.getPassword());

                if (password.verified) {
                    request.setAttribute("idUser", user.getId());
                    filterChain.doFilter(request, response);
                } else {
                    response.sendError(401);
                }
            }
        } else {
            filterChain.doFilter(request, response);
        }
    }
}
