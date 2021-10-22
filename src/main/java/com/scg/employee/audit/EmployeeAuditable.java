package com.scg.employee.audit;

import com.scg.employee.entity.EmployeeAudit;

public interface EmployeeAuditable {

	EmployeeAudit getAudit();

	void setAudit(EmployeeAudit audit);

}
