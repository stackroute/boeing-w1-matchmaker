package com.stackroute.downstreamservice.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

import com.stackroute.downstreamservice.model.Academics;
import com.stackroute.downstreamservice.model.Experience;
import com.stackroute.downstreamservice.model.Location;
import com.stackroute.downstreamservice.model.PersonalInfo;
import com.stackroute.downstreamservice.model.Project;
import com.stackroute.downstreamservice.model.Skills;
import com.stackroute.downstreamservice.model.Training;
import com.stackroute.downstreamservice.model.User;
import com.stackroute.downstreamservice.repository.AcademiesRepository;
import com.stackroute.downstreamservice.repository.ExperienceRepository;
import com.stackroute.downstreamservice.repository.LocationRepository;
import com.stackroute.downstreamservice.repository.PersonalInfoRepository;
import com.stackroute.downstreamservice.repository.ProjectRepository;
import com.stackroute.downstreamservice.repository.SkillsRepository;
import com.stackroute.downstreamservice.repository.TrainingRepository;
import com.stackroute.downstreamservice.repository.UserRepository;
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
 * @author simran 
 * This class is to bind the listener to all the different
 *         streams.
 */
@NoArgsConstructor
@EnableBinding({ AcademiesStream.class, ExperienceStream.class, LocationStream.class, PersonalInfoStream.class,
		ProjectStream.class, SkillsStream.class, TrainingStream.class, UserStream.class })
public class DownStreamListener {

	// Logger object
	private final  Logger logger = LoggerFactory.getLogger(this.getClass());

	// all the repository
	private AcademiesRepository academiesRepository;
	private ExperienceRepository experienceRepository;
	private LocationRepository locationRepository;
	private PersonalInfoRepository personalInfoRepository;
	private ProjectRepository projectRepository;
	private SkillsRepository skillsRepository;
	private TrainingRepository trainingRepository;
	private UserRepository userRepository;

	@Autowired
	public DownStreamListener(AcademiesRepository academiesRepository, ExperienceRepository experienceRepository,
			LocationRepository locationRepository, PersonalInfoRepository personalInfoRepository,
			ProjectRepository projectRepository, SkillsRepository skillsRepository,
			TrainingRepository trainingRepository, UserRepository userRepository) {

		this.academiesRepository = academiesRepository;
		this.experienceRepository = experienceRepository;
		this.locationRepository = locationRepository;
		this.personalInfoRepository = personalInfoRepository;
		this.projectRepository = projectRepository;
		this.skillsRepository = skillsRepository;
		this.trainingRepository = trainingRepository;
		this.userRepository = userRepository;
	}

	@StreamListener(ExperienceStream.INPUT)
	public void experiencePost(@Payload Experience experience) {
		try {
			experienceRepository.save(experience);
		} catch (Exception e) {
			logger.info("Error in saving");
		}
		logger.info(experience.toString() + " experience");
	}

	@StreamListener(AcademiesStream.INPUT)
	public void academiesPost(@Payload Academics academies) {
		try {
			academiesRepository.save(academies);
		} catch (Exception e) {
			logger.info("Error in saving");
		}
		logger.info(academies.toString() + " academies");
	}

	@StreamListener(LocationStream.INPUT)
	public void locationPost(@Payload Location location) {
		try {
			locationRepository.save(location);
		} catch (Exception e) {
			logger.info("Error in saving");
		}
		logger.info(location.toString() + " location");
	}

	@StreamListener(PersonalInfoStream.INPUT)
	public void personalInfoPost(@Payload PersonalInfo personalInfo) {
		try {
			personalInfoRepository.save(personalInfo);
		} catch (Exception e) {
			logger.info("Error in saving");
		}
		logger.info(personalInfo.toString() + " personal info");
	}

	@StreamListener(ProjectStream.INPUT)
	public void projectPost(@Payload Project project) {
		try {
			projectRepository.save(project);
		} catch (Exception e) {
			logger.info("Error in saving");
		}
		logger.info(project.toString() + " project");
	}

	@StreamListener(SkillsStream.INPUT)
	public void skillsPost(@Payload Skills skills) {
		try {
			skillsRepository.save(skills);
		} catch (Exception e) {
			logger.info("Error in saving");
		}
		logger.info(skills.toString() + " skills");
	}

	@StreamListener(TrainingStream.INPUT)
	public void TrainingPost(@Payload Training training) {
		try {
			trainingRepository.save(training);
		} catch (Exception e) {
			logger.info("Error in saving");
		}
		logger.info(training.toString() + " training");
	}

	@StreamListener(UserStream.INPUT)
	public void userPost(@Payload User user) {
		try {
			userRepository.save(user);
		} catch (Exception e) {
			logger.info("Error in saving");
		}
		logger.info(user.toString() + " user");
	}

}
