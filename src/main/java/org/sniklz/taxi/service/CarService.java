package org.sniklz.taxi.service;

import java.util.List;
import org.sniklz.taxi.model.Car;
import org.sniklz.taxi.model.Driver;

public interface CarService extends GenericService<Car> {
    void addDriverToCar(Driver driver, Car car);

    void removeDriverFromCar(Driver driver, Car car);

    List<Car> getAllByDriver(Long driverId);
}
