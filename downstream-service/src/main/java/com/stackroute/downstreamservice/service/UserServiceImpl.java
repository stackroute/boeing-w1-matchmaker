package com.stackroute.downstreamservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.downstreamservice.model.AcademicQualification;
import com.stackroute.downstreamservice.model.Certificates;
import com.stackroute.downstreamservice.model.Experience;
import com.stackroute.downstreamservice.model.Location;
import com.stackroute.downstreamservice.model.PersonalInfo;
import com.stackroute.downstreamservice.model.Projects;
import com.stackroute.downstreamservice.model.Skills;
import com.stackroute.downstreamservice.model.User;
import com.stackroute.downstreamservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepo;
	private Optional<User> opt;
	private User user;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	public UserServiceImpl(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}
	
/*	-------save services for each microservice chicklet--------*/
	
	@Override
	public void saveCertificate(Certificates certificates) {
		opt = userRepo.findById(certificates.getProfileId());
		user = opt.get();
		List<Certificates> list;
		if (user.getCertificates() == null)
			list = new ArrayList<>();
		else
			list = user.getCertificates();

		list.add(certificates);
		user.setCertificates(list);
		user.setUsername(certificates.getProfileId());
		userRepo.save(user);

		logger.info(certificates.toString() + " training");
	}

	@Override
	public void saveSkill(Skills skills) {
		opt = userRepo.findById(skills.getProfileId());
		user = opt.get();
		List<Skills> list;
		if (user.getSkills() == null)
			list = new ArrayList<>();
		else
			list = user.getSkills();

		list.add(skills);
		user.setSkills(list);
		userRepo.save(user);

		logger.info(skills.toString() + " skills");
	}

	@Override
	public void saveProject(Projects project) {
		List<Projects> list;
		opt = userRepo.findById(project.getProfileId());
		user = opt.get();

		if (user.getProject() == null)
			list = new ArrayList<>();
		else
			list = user.getProject();

		list.add(project);
		user.setProject(list);
		userRepo.save(user);
		logger.info(project.toString() + " project");
	}

	@Override
	public void savePersonalInfo(PersonalInfo personalInfo) {
		user.setPersonalInfo(personalInfo);
		user.setUsername(personalInfo.getProfileId());
		userRepo.save(user);

		logger.info(personalInfo.toString() + " personal info");
	}

	@Override
	public void saveLocation(Location location) {
		opt = userRepo.findById(location.getProfileId());
		user = opt.get();
		List<Location> list;
		if (user.getLocation() == null)
			list = new ArrayList<>();
		else
			list = user.getLocation();

		list.add(location);
		user.setLocation(list);
		userRepo.save(user);

		logger.info(location.toString() + " location");
	}

	@Override
	public void saveAcademies(AcademicQualification academies) {
		opt = userRepo.findById(academies.getProfileId());
		user = opt.get();
		List<AcademicQualification> list;
		if (user.getExperience() == null)
			list = new ArrayList<>();
		else
			list = user.getAcademics();
		list.add(academies);
		user.setAcademics(list);
		logger.info(academies.toString() + " academies");
		userRepo.save(user);
	}

	@Override
	public void saveExperience(Experience experience) {
		opt = userRepo.findById(experience.getProfileId());
		user = opt.get();
		List<Experience> list;
		if (user.getExperience() == null)
			list = new ArrayList<>();
		else
			list = user.getExperience();
		list.add(experience);
		user.setExperience(list);
		user.setUsername(experience.getProfileId());
		userRepo.save(user);
	}
	
	/*	-------delete services for each microservice chicklet--------*/

	@Override
	public void deleteCertificate(Certificates certificate) {
		opt = userRepo.findById(certificate.getProfileId());
		user = opt.get();
		List<Certificates> list;
		if (user.getCertificates() == null)
			list = new ArrayList<>();
		else
			list = user.getCertificates();

		list.remove(certificate);
		user.setCertificates(list);
		user.setUsername(certificate.getProfileId());
		userRepo.save(user);	}

	@Override
	public void deleteSkill(Skills skill) {
		opt = userRepo.findById(skill.getProfileId());
		user = opt.get();
		List<Skills> list;
		if (user.getSkills() == null)
			list = new ArrayList<>();
		else
			list = user.getSkills();

		list.remove(skill);
		user.setSkills(list);
		userRepo.save(user);
	}

	@Override
	public void deleteProject(Projects project) {
		List<Projects> list;
		opt = userRepo.findById(project.getProfileId());
		user = opt.get();

		if (user.getProject() == null)
			list = new ArrayList<>();
		else
			list = user.getProject();

		list.remove(project);
		user.setProject(list);
		userRepo.save(user);
	}

	@Override
	public void deleteLocation(Location location) {
		opt = userRepo.findById(location.getProfileId());
		user = opt.get();
		List<Location> list;
		if (user.getLocation() == null)
			list = new ArrayList<>();
		else
			list = user.getLocation();

		list.remove(location);
		user.setLocation(list);
		userRepo.save(user);
	}

	@Override
	public void deleteAcademies(AcademicQualification academies) {
		opt = userRepo.findById(academies.getProfileId());
		user = opt.get();
		List<AcademicQualification> list;
		if (user.getExperience() == null)
			list = new ArrayList<>();
		else
			list = user.getAcademics();
		list.remove(academies);
		user.setAcademics(list);
		logger.info(academies.toString() + " academies");
		userRepo.save(user);
		
	}

	@Override
	public void deleteExperience(Experience experience) {
		opt = userRepo.findById(experience.getProfileId());
		user = opt.get();
		List<Experience> list;
		if (user.getExperience() == null)
			list = new ArrayList<>();
		else
			list = user.getExperience();
		list.remove(experience);
		user.setExperience(list);
		user.setUsername(experience.getProfileId());
		userRepo.save(user);
	}

	/*	-------update services for each microservice chicklet--------*/

//	@Override
//	public User updateEntry(User user, String username) {
//			user.setUsername(username);
//			return userRepo.save(user);
//	}
	
	@Override
	public void updateCertificate(Certificates certificate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSkill(Skills skills) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProject(Projects project) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePersonalInfo(PersonalInfo personalInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateLocation(Location location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAcademies(AcademicQualification academies) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateExperience(Experience experience) {
		// TODO Auto-generated method stub
		
	}

	
}
