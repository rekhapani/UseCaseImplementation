
package com.reference.commitment.entity;
import java.io.Serializable;

import java.time.OffsetDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * The persistent class for the commitment database table.
 * 
 */
@Data
@Entity
@Table(name = "\"commitment\"", schema = "CMT")
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Commitment implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commitmentid", nullable = false)
	private Integer commitmentID;
	
	@Column(name = "nationalaccountid", nullable = false)
	private Integer nationalAccountID;
	
	@Column(name = "financebusinessunitcode", nullable = false)
	private String financeBusinessUnitCode;
	
	@Column(name = "serviceofferingcode", nullable = false)
	private String serviceOfferingCode;
	
	@Column(name = "businesslineid")
	private Integer businessLineID;
	
	@Column(name = "origincapacityareaid", nullable = false)
	private Integer originCapacityAreaID;
	
	@Column(name = "destinationcapacityareaid")
	private Integer destinationCapacityAreaID;
	
	@Column(name = "originlocationid", nullable = false)
	private Integer originLocationID;
	
	@Column(name = "billingpartyid", nullable = false)
	private Integer billToID;
	
	@Column(name = "effectivetimestamp", nullable = false)
	private OffsetDateTime effectiveTimestamp;
	
	@Column(name = "expirationtimestamp", nullable = false)
	private OffsetDateTime expirationTimestamp;	
	
}
