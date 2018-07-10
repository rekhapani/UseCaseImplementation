package com.reference.commitment.dto;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import lombok.Data;
@Data
public class CommitmentDTO {
		private Integer commitmentID;
		private Integer nationalAccountID;
		private Integer billToID;
		
		private Integer businessLineID;
		private String businessLineCode;
		private String financeBusinessUnitCode;
		private String serviceOfferingCode;
		private Integer originCapacityAreaID;
		private String originCapacityAreaCode;
		private Integer destinationCapacityAreaID;
		private String destinationCapacityAreaCode;
		private Integer originLocationID;
		
		private OffsetDateTime effectiveTimestamp;
		private OffsetDateTime expirationTimestamp;
		private LocalDateTime createTimestamp;
		private String createUserID;
		private String createProgramName;
		private LocalDateTime lastUpdateTimestamp;
		private String lastUpdateUserID;
		private String lastUpdateProgramName;
		
		
}
