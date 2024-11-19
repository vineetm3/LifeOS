package com.example.lifeos;

import com.plaid.client.request.PlaidApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Year;

@RestController
@RequestMapping("/finances-api")
public class MyController {
    private PlaidApi plaidClient;

    @GetMapping("/test")
    public String test_endpoint() {
        return "Test was Successful";
    }


}
