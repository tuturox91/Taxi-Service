package org.sniklz.taxi.dao;

import java.util.Optional;
import org.sniklz.taxi.model.Driver;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> findByLogin(String login);
}
