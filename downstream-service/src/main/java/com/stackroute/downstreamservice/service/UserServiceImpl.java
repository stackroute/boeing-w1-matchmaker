package com.stackroute.downstreamservice.service;

import java.util.ArrayList;
import java.util.List;

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
public class UserServiceImpl implements UserService {

	private UserRepository userRepo;
	// private Optional<User> opt;
	private User user = null;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	public UserServiceImpl(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	/* -------save services for each microservice chicklet-------- */

	@Override
	public void saveCertificate(Certificates certificates) {
		user = userRepo.getByUsername(certificates.getProfileId());
		List<Certificates> list;
		if (user.getCertificates() == null)
			list = new ArrayList<>();
		else
			list = user.getCertificates();

		list.add(certificates);
		user.setCertificates(list);
		userRepo.save(user);
		logger.info(certificates.toString() + " training");
	}

	@Override
	public void saveSkill(Skills skills) {
		user = userRepo.getByUsername(skills.getProfileId());
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
		user = userRepo.getByUsername(project.getProfileId());

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
		user = userRepo.getByUsername(personalInfo.getProfileId());
		user.setPersonalInfo(personalInfo);
		user.setUsername(personalInfo.getProfileId());
		userRepo.save(user);
		logger.info(personalInfo.toString() + " personal info");
		
	}

	@Override
	public void saveLocation(Location location) {
		user = userRepo.getByUsername(location.getProfileId());
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
		user = userRepo.getByUsername(academies.getProfileId());
		List<AcademicQualification> list;
		if (user.getAcademics() == null)
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
		user = userRepo.getByUsername(experience.getProfileId());
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

	/* -------delete services for each microservice chicklet-------- */

	@Override
	public void deleteCertificate(Certificates certificate) {
		user = userRepo.getByUsername(certificate.getProfileId());

		List<Certificates> list = user.getCertificates();
		int index = Integer.parseInt(certificate.getMessage().substring(6));
		list.remove(index);
		user.setCertificates(list);
		// user.setUsername(certificate.getProfileId());
		userRepo.save(user);
		
	}

	@Override
	public void deleteSkill(Skills skill) {
		user = userRepo.getByUsername(skill.getProfileId());
		List<Skills> list = user.getSkills();
		int index = Integer.parseInt(skill.getMessage().substring(6));
		list.remove(index);
		user.setSkills(list);
		userRepo.save(user);
		
	}

	@Override
	public void deleteProject(Projects project) {
		List<Projects> list = user.getProject();
		user = userRepo.getByUsername(project.getProfileId());
		int index = Integer.parseInt(project.getMessage().substring(6));
		list.remove(index);
		user.setProject(list);
		userRepo.save(user);
		
	}

	@Override
	public void deleteLocation(Location location) {
		System.out.println("deleting");
		user = userRepo.getByUsername(location.getProfileId());

		List<Location> list = user.getLocation();
		int index = Integer.parseInt(location.getMessage().substring(6));
		list.remove(index);
		user.setLocation(list);
		userRepo.save(user);
		
	}

	@Override
	public void deleteAcademies(AcademicQualification academies) {
		user = userRepo.getByUsername(academies.getProfileId());
		List<AcademicQualification> list = user.getAcademics();
		int index = Integer.parseInt(academies.getMessage().substring(6));
		list.remove(index);
		user.setAcademics(list);
		logger.info(academies.toString() + " academies");
		userRepo.save(user);
		
	}

	@Override
	public void deleteExperience(Experience experience) {
		user = userRepo.getByUsername(experience.getProfileId());
		List<Experience> list = user.getExperience();
		int index = Integer.parseInt(experience.getMessage().substring(6));
		list.remove(index);
		user.setExperience(list);
		user.setUsername(experience.getProfileId());
		userRepo.save(user);
		
	}

	/* -------update services for each microservice chicklet-------- */

	@Override
	public void updateCertificate(Certificates certificate) {
		logger.info(certificate.toString() + " Certificates");
		user = userRepo.getByUsername(certificate.getProfileId());
		List<Certificates> list = user.getCertificates();
		int index = Integer.parseInt(certificate.getMessage().substring(6));
		list.remove(index);
		certificate.setMessage("save");
		list.add(certificate);
		user.setCertificates(list);
		userRepo.save(user);
		
	}

	@Override
	public void updateSkill(Skills skill) {
		logger.info(skill.toString() + " Skills");
		user = userRepo.getByUsername(skill.getProfileId());
		List<Skills> list = user.getSkills();
		int index = Integer.parseInt(skill.getMessage().substring(6));
		list.remove(index);
		skill.setMessage("save");
		list.add(skill);
		user.setSkills(list);
		userRepo.save(user);
		
	}

	@Override
	public void updateProject(Projects project) {
		List<Projects> list = user.getProject();
		user = userRepo.getByUsername(project.getProfileId());
		int index = Integer.parseInt(project.getMessage().substring(6));
		list.remove(index);
		project.setMessage("save");
		list.add(project);
		user.setProject(list);
		userRepo.save(user);
		
	}

	@Override
	public void updatePersonalInfo(PersonalInfo personalInfo) {
		user.setPersonalInfo(personalInfo);
		user.setUsername(personalInfo.getProfileId());
		userRepo.save(user);

		logger.info(personalInfo.toString() + " personal info");
		
	}

	@Override
	public void updateLocation(Location location) {
		user = userRepo.getByUsername(location.getProfileId());
		List<Location> list = user.getLocation();
		int index = Integer.parseInt(location.getMessage().substring(6));
		list.remove(index);
		location.setMessage("save");
		list.add(location);
		user.setLocation(list);
		userRepo.save(user);
		
	}

	@Override
	public void updateAcademies(AcademicQualification academies) {
		user = userRepo.getByUsername(academies.getProfileId());
		List<AcademicQualification> list = user.getAcademics();
		int index = Integer.parseInt(academies.getMessage().substring(6));
		list.remove(index);
		academies.setMessage("save");
		list.add(academies);
		user.setAcademics(list);
		logger.info(academies.toString() + " academies");
		userRepo.save(user);
		
	}

	@Override
	public void updateExperience(Experience experience) {
		user = userRepo.getByUsername(experience.getProfileId());
		List<Experience> list = user.getExperience();
		int index = Integer.parseInt(experience.getMessage().substring(6));
		list.remove(index);
		experience.setMessage("save");
		list.add(experience);
		user.setExperience(list);
		userRepo.save(user);
		
	}

}
