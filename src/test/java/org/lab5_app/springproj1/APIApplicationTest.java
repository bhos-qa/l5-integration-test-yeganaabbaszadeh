package org.lab5_app.springproj1;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.json.JSONException;
import org.junit.jupiter.api.extension.ExtendWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@SpringBootTest
class APIApplicationTest {

    @Test
    public void getReposTest() throws Exception {
        TestRestTemplate restTemplate = new TestRestTemplate();
        String RepoURL = "https://60a21d3f745cd70017576092.mockapi.io/api/v1/repos";
        String response = restTemplate.getForObject(RepoURL, String.class);
        assertNotNull(response);
    }

    @Test
    public void getBranchesTest() throws Exception {
        TestRestTemplate restTemplate = new TestRestTemplate();
        String BranchURL = "https://60a21d3f745cd70017576092.mockapi.io/api/v1/repos/1/branches";
        String response = restTemplate.getForObject(BranchURL, String.class);
        assertNotNull(response);
    }

    @Test
    public void getCommitsTest() throws Exception {
        TestRestTemplate restTemplate = new TestRestTemplate();
        String CommitURL = "https://60a21d3f745cd70017576092.mockapi.io/api/v1/repos/1/branches/1/commits";
        String response = restTemplate.getForObject(CommitURL, String.class);
        assertNotNull(response);
    }


}