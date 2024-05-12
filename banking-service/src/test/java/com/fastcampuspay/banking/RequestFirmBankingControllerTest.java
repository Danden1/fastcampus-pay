package com.fastcampuspay.banking;

import com.fastcampuspay.banking.adapter.in.web.RequestFirmbankingRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class RequestFirmBankingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;


    @Test
    public void testReqeustFirmBanking() throws Exception {
        RequestFirmbankingRequest request = new RequestFirmbankingRequest(
                "testBank",
                "050-505-050",
                "myBank",
                "123-123-123",
                10000
        );


        mockMvc.perform(
                        MockMvcRequestBuilders.post("/banking/firmbanking/request/")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(mapper.writeValueAsString(request))
                )
                .andExpect(MockMvcResultMatchers.status().isOk());
//                .andExpect(MockMvcResultMatchers.content().string(mapper.writeValueAsString(expect)));
    }
}