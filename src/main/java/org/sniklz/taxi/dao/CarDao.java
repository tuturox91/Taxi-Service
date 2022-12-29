package org.sniklz.taxi.dao;

import java.util.List;
import org.sniklz.taxi.model.Car;

public interface CarDao extends GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);
}
