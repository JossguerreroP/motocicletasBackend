package com.motorbikezone.app;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import com.motorbikezone.app.services.BikeService;
import com.motorbikezone.app.web.control.BikeControl;
import com.motorbikezone.app.web.modelo.BikeDTO;

@WebMvcTest(BikeControl.class)
class MotobikezoneApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private BikeService bikeService;

    @Test
    void testBikes() throws Exception {
        var bikes = List.of(
            new BikeDTO(1, "Yamaha R1", 299, 20000, "yamaha.jpg", "Yamaha", "R1")
        );

        when(bikeService.getBikes()).thenReturn(bikes);

        mockMvc.perform(get("/bikes"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$[0].name").value("Yamaha R1"));
    }
}



