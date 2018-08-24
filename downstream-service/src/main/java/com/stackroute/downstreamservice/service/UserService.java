package com.stackroute.downstreamservice.service;

import com.stackroute.downstreamservice.model.AcademicQualification;
import com.stackroute.downstreamservice.model.Certificates;
import com.stackroute.downstreamservice.model.Experience;
import com.stackroute.downstreamservice.model.Location;
import com.stackroute.downstreamservice.model.PersonalInfo;
import com.stackroute.downstreamservice.model.Projects;
import com.stackroute.downstreamservice.model.Skills;
import com.stackroute.downstreamservice.model.User;

public interface UserService {
	public void saveCertificate(Certificates certificates);
	public void saveSkill(Skills skills);
	public void saveProject(Projects project);
	public void savePersonalInfo(PersonalInfo personalInfo);
	public void saveLocation(Location location);
	public void saveAcademies(AcademicQualification academies);
	public void saveExperience(Experience experience);
	
	public void deleteCertificate(Certificates certificate);
	public void deleteSkill(Skills skill);
	public void deleteProject(Projects project);
	public void deleteLocation(Location location);
	public void deleteAcademies(AcademicQualification academies);
	public void deleteExperience(Experience experience);
	
	public void updateCertificate(Certificates certificate);
	public void updateSkill(Skills skills);
	public void updateProject(Projects project);
	public void updatePersonalInfo(PersonalInfo personalInfo);
	public void updateLocation(Location location);
	public void updateAcademies(AcademicQualification academies);
	public void updateExperience(Experience experience);
}
