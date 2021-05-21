package hrmsproject.hrms.business.abstracts;

import java.util.List;

import hrmsproject.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();

}
