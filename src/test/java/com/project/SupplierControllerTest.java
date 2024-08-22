package com.project;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class SupplierControllerTest {
	@Autowired
    private MockMvc mockMvc;

    @Test
    public void testQuerySuppliers() throws Exception {
        mockMvc.perform(post("/api/supplier/query")
            .param("location", "India")
            .param("natureOfBusiness", "small_scale")
            .param("manufacturingProcesses", "3d_printing")
            .param("page", "0")
            .param("size", "10"))
            .andExpect(status().isOk());
    }
}
