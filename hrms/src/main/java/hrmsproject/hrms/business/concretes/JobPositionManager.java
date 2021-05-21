package hrmsproject.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import hrmsproject.hrms.business.abstracts.JobPositionService;
import hrmsproject.hrms.dataAccess.abstracts.JobPositionDao;
import hrmsproject.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;
	
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}
	
	@Override
	public List<JobPosition> getAll() {
		return jobPositionDao.findAll();
	}

}
