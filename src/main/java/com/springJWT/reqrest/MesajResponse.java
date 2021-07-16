package com.springJWT.reqrest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;





public class MesajResponse {
    private String mesaj;

    public String getMesaj() {
        return mesaj;
    }

    public MesajResponse(String mesaj) {
        this.mesaj = mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }
}
