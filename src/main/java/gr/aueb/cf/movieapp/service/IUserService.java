package gr.aueb.cf.movieapp.service;

import gr.aueb.cf.movieapp.dto.UserDto;
import gr.aueb.cf.movieapp.model.User;
import gr.aueb.cf.movieapp.service.exceptions.EntityNotFoundException;

import javax.management.InstanceAlreadyExistsException;
import java.math.BigInteger;
import java.util.List;

public interface IUserService {
    User registerUser(UserDto userDto) throws InstanceAlreadyExistsException;

    void addFavoriteMovie(User user, String imdbId) throws InstanceAlreadyExistsException;
    void removeFavoriteMovie(User user, String imdbId) throws Exception;
    List<User> getAllUsers();
    User getUserByUsername(String username);
    User getById(String id);
    User updateUser(UserDto dto) throws EntityNotFoundException;

}
