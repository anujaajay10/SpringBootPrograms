package com.example.SharathCars.controllerTest;

import com.example.SharathCars.controller.CarController;
import com.example.SharathCars.entity.Car;
import com.example.SharathCars.service.CarService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.mockito.Mockito.when;


    @WebMvcTest(CarController.class)
    public class CarTestController {
        @Autowired
        private MockMvc mockMvc;
        @MockBean
        private CarService carservice;
        private Car car;

        @BeforeEach
        void setup() {

            car = new Car(1, "22-03-2023", "Amaze", "500000", "Hyundai", "Grey", 5);
        }
        @Test
        void testGetAllCars() throws Exception {

            final List<Car> car = List.of(new Car(1, "22-03-2023", "Amaze", "500000", "Hyundai", "Grey", 5));
            when(carservice.getAllCars()).thenReturn(car);

            // Run the test
            final MockHttpServletResponse response = mockMvc.perform(get("/cars/allcars")
                            .accept(MediaType.APPLICATION_JSON))
                    .andReturn().getResponse();

            // Verify the results
            assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
//        assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
        }
        @Test
        void testGetCarsByDate() throws Exception {
            // Setup
            // Configure StudentService.getStudentByName(...).
            final List<Car> car = List.of(new Car(2, "4-08-2023", "Swift", "27783624", "Maruti", "Black", 6));
            when(carservice.getCarsByDate("date")).thenReturn(car);

            // Run the test
            final MockHttpServletResponse response = mockMvc.perform(get("/cars/car/{date}", "date")
                            .accept(MediaType.APPLICATION_JSON))
                    .andReturn().getResponse();

            // Verify the results
            assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        }
    }



