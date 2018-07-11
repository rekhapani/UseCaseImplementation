package com.reference.order.entity;
import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.Data;
@Data
public class OrderEntity {
	
@Id
private Integer orderId;
private Integer corporateAccountId;
private Integer lineOfBusinessId;
private String businessUnit;
private String serviceOffering;
private String originArea;
private String destinationArea;
private Date pickupDate;
}
