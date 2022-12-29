package org.sniklz.taxi.service;

import org.sniklz.taxi.exception.AuthenticationException;
import org.sniklz.taxi.model.Driver;

public interface AuthenticationService {
    Driver login(String login, String password) throws AuthenticationException;
}
