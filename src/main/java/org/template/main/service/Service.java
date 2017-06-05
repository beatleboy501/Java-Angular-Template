package org.template.main.service;

import org.template.main.domain.Domain;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Service {

    public Domain getDefaultDomain() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(
            "/resource.txt")));
        String serviceText = br.readLine();
        return new Domain(serviceText);
    }
}
