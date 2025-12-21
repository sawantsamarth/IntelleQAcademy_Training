package com.example.ioc.constinj;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Cert1 {

    int cid;
    String cname;

    @Override
    public String toString() {
        return "Certificate [ Id: "+cid + ", Name: " + cname + " ] ";
    }
}
