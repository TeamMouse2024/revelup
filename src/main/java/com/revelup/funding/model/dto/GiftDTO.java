package com.revelup.funding.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class GiftDTO implements java.io.Serializable {

    private FundingInfoDTO fndCode;
    private int giftPrice;
    private String giftName;
    private int giftProdQty;


}
