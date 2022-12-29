package org.sniklz.taxi.service;

import java.util.Optional;
import org.sniklz.taxi.model.Driver;

public interface DriverService extends GenericService<Driver> {
    Optional<Driver> findByLogin(String login);
}
