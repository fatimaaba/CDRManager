package ir.mci.cdrmanagertesti;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import org.apache.kafka.common.protocol.types.Field;

import java.io.Serializable;

//@Data
//@NoArgsConstructor


@AllArgsConstructor
@Data
@NoArgsConstructor


public class Mt {

    @JsonProperty("dcs")
    private int dcs;
    @JsonProperty("isPre")
    private Boolean isPre;
    @JsonProperty("ch")
    private String ch;
    @JsonProperty("gw")
    private String gw;
    @JsonProperty("st")
    private Long st;
    @JsonProperty("l")
    private int l;
    @JsonProperty("stp")
    private String stp;
    @JsonProperty("sst")
    private String sst;
    @JsonProperty("sid")
    private String sid;
    @JsonProperty("sfee")
    private int sfee;
    @JsonProperty("tx")
    private boolean tx;
    @JsonProperty("scat")
    private String scat;



}

