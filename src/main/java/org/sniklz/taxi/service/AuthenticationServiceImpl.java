package org.sniklz.taxi.service;

import java.util.Optional;
import org.sniklz.taxi.exception.AuthenticationException;
import org.sniklz.taxi.lib.Inject;
import org.sniklz.taxi.lib.Service;
import org.sniklz.taxi.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Inject
    private DriverService driverDao;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driver = driverDao.findByLogin(login);
        if (driver.isEmpty()) {
            throw new AuthenticationException("Login or password was incorrect.");
        }
        if (driver.get().getPassword().equals(password)) {
            return driver.get();
        }
        throw new AuthenticationException("Login or password was incorrect.");
    }
}
