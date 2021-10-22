package com.scg.employee.audit;

import java.time.LocalDateTime;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.scg.employee.entity.EmployeeAudit;

public class EmployeeAuditListener {

	@PrePersist
	public void addAuditDetailsInsert(final EmployeeAuditable employeeAuditable) {
		final EmployeeAudit audit = new EmployeeAudit();
		employeeAuditable.setAudit(audit);
		audit.setCreatedBy(125L);
		audit.setCreatedTimestamp(LocalDateTime.now());
		audit.setRecordVersionNo(1);

	}

	@PreUpdate
	public void setAuditFieldsOnUpdate(final EmployeeAuditable employeeAuditable) {

		final EmployeeAudit audit = employeeAuditable.getAudit();
		audit.setLastUpdatedBy(250L);
		audit.setLastUpdatedTimestamp(LocalDateTime.now());
		audit.setRecordVersionNo(audit.getRecordVersionNo() + 1);
	}

}
