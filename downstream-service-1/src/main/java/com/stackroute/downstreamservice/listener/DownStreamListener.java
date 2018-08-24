package com.stackroute.downstreamservice.listener;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

import com.stackroute.downstreamservice.model.AcademicQualification;
import com.stackroute.downstreamservice.model.Certificates;
import com.stackroute.downstreamservice.model.Experience;
import com.stackroute.downstreamservice.model.Location;
import com.stackroute.downstreamservice.model.PersonalInfo;
import com.stackroute.downstreamservice.model.Projects;
import com.stackroute.downstreamservice.model.Skills;
import com.stackroute.downstreamservice.model.User;
import com.stackroute.downstreamservice.repository.UserRepository;
import com.stackroute.downstreamservice.service.UserService;
import com.stackroute.downstreamservice.stream.AcademiesStream;
import com.stackroute.downstreamservice.stream.ExperienceStream;
import com.stackroute.downstreamservice.stream.LocationStream;
import com.stackroute.downstreamservice.stream.PersonalInfoStream;
import com.stackroute.downstreamservice.stream.ProjectStream;
import com.stackroute.downstreamservice.stream.SkillsStream;
import com.stackroute.downstreamservice.stream.TrainingStream;
import com.stackroute.downstreamservice.stream.UserStream;

import lombok.NoArgsConstructor;

/**
 * 
 * @author simran This class is to bind the listener to all the different
 *         streams.
 */
@NoArgsConstructor
@EnableBinding({ AcademiesStream.class, ExperienceStream.class, LocationStream.class, PersonalInfoStream.class,
		ProjectStream.class, SkillsStream.class, TrainingStream.class, UserStream.class })
public class DownStreamListener {

	// Logger object
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	// all the repository
	/*
	 * private AcademiesRepository academiesRepository; private ExperienceRepository
	 * experienceRepository; private LocationRepository locationRepository; private
	 * PersonalInfoRepository personalInfoRepository; private ProjectRepository
	 * projectRepository; private SkillsRepository skillsRepository; private
	 * TrainingRepository trainingRepository;
	 */
	private UserService userService;
	private UserRepository userRepo;


	/*
	 * @Autowired public DownStreamListener(AcademiesRepository academiesRepository,
	 * ExperienceRepository experienceRepository, LocationRepository
	 * locationRepository, PersonalInfoRepository personalInfoRepository,
	 * ProjectRepository projectRepository, SkillsRepository skillsRepository,
	 * TrainingRepository trainingRepository, UserRepository userRepository, User
	 * user) {
	 * 
	 * this.academiesRepository = academiesRepository; this.experienceRepository =
	 * experienceRepository; this.locationRepository = locationRepository;
	 * this.personalInfoRepository = personalInfoRepository; this.projectRepository
	 * = projectRepository; this.skillsRepository = skillsRepository;
	 * this.trainingRepository = trainingRepository; this.userRepository =
	 * userRepository; this.user = user; }
	 */
	@Autowired
	public DownStreamListener(UserRepository userRepo,UserService userService) {
		this.userRepo = userRepo;
		this.userService = userService;
	}

	@StreamListener(ExperienceStream.INPUT)
	public void experiencePost(@Payload Experience experience) {
		if(experience.getMessage().equals("save")) {
			userService.saveExperience(experience);
		}
		else if(experience.getMessage().equals("delete")) {
			userService.deleteExperience(experience);
		}
		else if(experience.getMessage().equals("update")) {
			userService.updateExperience(experience);
		}
	}

	@StreamListener(AcademiesStream.INPUT)
	public void academiesPost(@Payload AcademicQualification academies) {
		/*
		 * try { academiesRepository.save(academies); } catch (Exception e) {
		 * logger.info("Error in saving"); }
		 */
		if(academies.getMessage().equals("save")) {
			userService.saveAcademies(academies);
		}
		else if(academies.getMessage().equals("delete")) {
			userService.deleteAcademies(academies);
		}
		else if(academies.getMessage().equals("update")) {
			userService.updateAcademies(academies);
		}
	}

	@StreamListener(LocationStream.INPUT)
	public void locationPost(@Payload Location location) {
		/*
		 * try { locationRepository.save(location); } catch (Exception e) {
		 * logger.info("Error in saving"); }
		 */
		if(location.getMessage().equals("save")) {
			userService.saveLocation(location);
		}
		else if(location.getMessage().equals("delete")) {
			userService.deleteLocation(location);
		}
		else if(location.getMessage().equals("update")) {
			userService.updateLocation(location);
		}
	}

	@StreamListener(PersonalInfoStream.INPUT)
	public void personalInfoPost(@Payload PersonalInfo personalInfo) {
		/*
		 * try { personalInfoRepository.save(personalInfo); } catch (Exception e) {
		 * logger.info("Error in saving"); }
		 */
		if(personalInfo.getMessage().equals("save")) {
			userService.savePersonalInfo(personalInfo);
		}
		else if(personalInfo.getMessage().equals("update")) {
			userService.updatePersonalInfo(personalInfo);
		}
	}

	@StreamListener(ProjectStream.INPUT)
	public void projectPost(@Payload Projects project) {
		/*
		 * try { projectRepository.save(project); } catch (Exception e) {
		 * logger.info("Error in saving"); }
		 */
		if(project.getMessage().equals("save")) {
			userService.saveProject(project);
		}
		else if(project.getMessage().equals("delete")){
			userService.deleteProject(project);
		}
		else if(project.getMessage().equals("update")) {
			userService.updateProject(project);
		}
	}

	@StreamListener(SkillsStream.INPUT)
	public void skillsPost(@Payload Skills skills) {
		/*
		 * try { skillsRepository.save(skills); } catch (Exception e) {
		 * logger.info("Error in saving"); }
		 */
		if(skills.getMessage().equals("save")) {
			userService.saveSkill(skills);
		}
		else if(skills.getMessage().equals("delete")) {
			userService.deleteSkill(skills);
		}
		else if(skills.getMessage().equals("update")) {
			userService.updateSkill(skills);
		}
		
	}

	@StreamListener(TrainingStream.INPUT)
	public void TrainingPost(@Payload Certificates certificates) {
		/*
		 * try { trainingRepository.save(training); } catch (Exception e) {
		 * logger.info("Error in saving"); }
		 */
		if(certificates.getMessage().equals("save")) {
			userService.saveCertificate(certificates);
		}	
		else if(certificates.getMessage().equals("delete")) {
			userService.deleteCertificate(certificates);
		}
		else if(certificates.getMessage().equals("update")) {
			userService.updateCertificate(certificates);
		}
	}
	
	@StreamListener(UserStream.INPUT)
	public void userPost(@Payload User user) {
		/*
		 * try { userRepository.save(user); } catch (Exception e) {
		 * logger.info("Error in saving"); }
		 */
		userRepo.save(user);
		logger.info(user.toString() + " user");
	}
}
