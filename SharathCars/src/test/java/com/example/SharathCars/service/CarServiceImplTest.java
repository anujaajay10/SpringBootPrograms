package com.example.SharathCars.service;

import com.example.SharathCars.entity.Car;
import com.example.SharathCars.repository.CarRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CarServiceImplTest {

    private CarServiceImpl carServiceImplUnderTest;

    @BeforeEach
    void setUp() {
        carServiceImplUnderTest = new CarServiceImpl();
        carServiceImplUnderTest.carRepository = mock(CarRepository.class);
    }

    @Test
    void testAddcar() {
        // Setup
        final Car cars = new Car(0, "date", "carname", "price", "brand", "color", 0);
        final Car expectedResult = new Car(0, "date", "carname", "price", "brand", "color", 0);

        // Configure CarRepository.save(...).
        final Car car = new Car(0, "date", "carname", "price", "brand", "color", 0);
        when(carServiceImplUnderTest.carRepository.save(
                new Car(0, "date", "carname", "price", "brand", "color", 0))).thenReturn(car);

        // Run the test
        final Car result = carServiceImplUnderTest.addcar(cars);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetAllCars() {
        // Setup
        final List<Car> expectedResult = List.of(new Car(0, "date", "carname", "price", "brand", "color", 0));

        // Configure CarRepository.findAll(...).
        final List<Car> cars = List.of(new Car(0, "date", "carname", "price", "brand", "color", 0));
        when(carServiceImplUnderTest.carRepository.findAll()).thenReturn(cars);

        // Run the test
        final List<Car> result = carServiceImplUnderTest.getAllCars();

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetAllCars_CarRepositoryReturnsNoItems() {
        // Setup
        when(carServiceImplUnderTest.carRepository.findAll()).thenReturn(Collections.emptyList());

        // Run the test
        final List<Car> result = carServiceImplUnderTest.getAllCars();

        // Verify the results
        assertThat(result).isEqualTo(Collections.emptyList());
    }

    @Test
    void testGetCarsByDate() {
        // Setup
        final List<Car> expectedResult = List.of(new Car(0, "date", "carname", "price", "brand", "color", 0));

        // Configure CarRepository.findByDate(...).
        final List<Car> cars = List.of(new Car(0, "date", "carname", "price", "brand", "color", 0));
        when(carServiceImplUnderTest.carRepository.findByDate("date")).thenReturn(cars);

        // Run the test
        final List<Car> result = carServiceImplUnderTest.getCarsByDate("date");

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetCarsByDate_CarRepositoryReturnsNoItems() {
        // Setup
        when(carServiceImplUnderTest.carRepository.findByDate("date")).thenReturn(Collections.emptyList());

        // Run the test
        final List<Car> result = carServiceImplUnderTest.getCarsByDate("date");

        // Verify the results
        assertThat(result).isEqualTo(Collections.emptyList());
    }
}
