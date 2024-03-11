package com.revelup.funding.model.dto;

import com.revelup.pay.model.dto.PayDTO;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class DeliveryDTO implements java.io.Serializable {

    private PayDTO plgCode;
    private String delivStat;
    private String trackingNo;


}
