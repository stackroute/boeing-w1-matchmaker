docker exec -it cassandra cqlsh -e "CREATE KEYSPACE matchmaker
  WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 3 };"

echo "KEYSPACE CREATED"   

docker exec -it cassandra cqlsh -e "CREATE TABLE matchmaker.experience (
profileId text, 
organizationName text, 
role text, 
startDate text,
endDate text,
PRIMARY KEY (profileId, startDate) );"

echo "CREATED experience table"   

docker exec -it cassandra cqlsh -e "CREATE TABLE matchmaker.skills (
profileId text, 
skill text, 
level text, 
noOfMonths text,
furtherUsage text,
PRIMARY KEY (profileId, skill) );"

echo "CREATED skills table"   

docker exec -it cassandra cqlsh -e "CREATE TABLE matchmaker.project (
profileId text, 
projectId text, 
projectAt text, 
role text,
department text,
projectLocation text, 
technologies text, 
projectTitle text, 
projectFrom text,
projectTo text,
synopsis text,
url text,
demoURL text, 
skills text,
PRIMARY KEY (profileId, projectId) );"


echo "CREATED project table"   


docker exec -it cassandra cqlsh -e "CREATE TABLE matchmaker.training (
profileId text, 
trainingId text, 
trainingName text, 
authority text,
duration text,
skillsTested text,
PRIMARY KEY (profileId, trainingId) );"

echo "CREATED training table"   


docker exec -it cassandra cqlsh -e "CREATE TABLE matchmaker.academics (
profileId text, 
qualification text, 
instituteName text, 
yearOfJoining text,
yearOfCompletion text,
stream text,
marks text,
PRIMARY KEY (profileId, yearOfJoining) );"


echo "CREATED academics table"   


docker exec -it cassandra cqlsh -e "CREATE TABLE matchmaker.location (
profileId text, 
address text, 
city text, 
pin text,
state text,
country text,
PRIMARY KEY (profileId) );"


echo "CREATED location table"   

docker exec -it cassandra cqlsh -e "CREATE TABLE matchmaker.user (
username text, 
email text,
PRIMARY KEY (email) );"

echo "CREATED user table"   


docker exec -it cassandra cqlsh -e "CREATE TABLE matchmaker.personalinfo (
profileId text, 
name text, 
picture text, 
dob text,
age text,
gender text,
mobile text,
email text,
facebook text,
linkedin text,
github text,
bloodGroup text,
PRIMARY KEY (profileId) );"

echo "CREATED personalinfo table"   
