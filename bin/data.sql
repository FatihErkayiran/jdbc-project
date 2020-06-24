drop database if exists university;
​
create database university;
use university;
​
##################
#   DEPARTMENT   #
##################
​
create table department
(
	dept_id int auto_increment,
    dept_name varchar(30) unique,
    dept_phone char(10),
    primary key (dept_id)
);
alter table department auto_increment = 10000;
​
insert into department values(null, 'Accounting', '1234567890');
insert into department values(null, 'Astronomy', '1234567891');
insert into department values(null, 'Biology', '1234567892');
insert into department values(null, 'Chemistry', '1234567893');
insert into department values(null, 'Computer Science', '1234567894');
insert into department values(null, 'Economics', '1234567895');
insert into department values(null, 'English', '1234567896');
insert into department values(null, 'Finance', '1234567897');
insert into department values(null, 'Graphic Design', '1234567898');
insert into department values(null, 'History', '1234567899');
insert into department values(null, 'Journalism', '1234567810');
insert into department values(null, 'Linguistics', '1234567811');
insert into department values(null, 'Marketing', '1234567812');
insert into department values(null, 'Mathematics', '1234567813');
insert into department values(null, 'Music', '1234567814');
insert into department values(null, 'Nursing', '1234567815');
insert into department values(null, 'Political Science', '1234567816');
insert into department values(null, 'Statistics', '1234567817');
insert into department values(null, 'Women\'s Studies', '1234567818');
​
# select * from department;
# truncate table department;
​
​
​
​
​
​
​
##############
#   COURSE   #
##############
​
create table course 
(
	course_id int auto_increment,
    course_name varchar(50) not null unique,
    course_desc varchar(200),
    dept_id int not null,
    primary key (course_id),
    foreign key (dept_id) references department(dept_id)
);
alter table course auto_increment = 10000;
​
-- -------------- Accounting -------------- --
insert into course values (null, 'Introduction to Auditing', 
    'Intro to the conceptual framework of auditing.', 10000);
insert into course values (null, 'Accounting in the Global Economy', 
    'Financial reporting issues in a global environment and accounting and 
    managerial issues faced by multinational corporations.', 10000);
-- -------------- Astronomy -------------- --
insert into course values (null, 'Stars, Galaxies, and Cosmology',
	'A survey of astronomy with a focus on the universe beyond our 
    solar system', 10001);
insert into course values (null, 'Stellar Astrophysics',
	'Looking into the interior structure and atmospheric properties of stars.', 10001);
insert into course values (null, 'Galactic Astronomy',
	'Overall structure of our Galaxy and the interstellar medium', 10001);
-- -------------- Biology -------------- --
insert into course values (null, 'Introductory Biology I',
	'Presentation of basic biological principles as well as topics and issues 
    of current human interest.', 10002);
insert into course values (null, 'Introductory Biology II',
	'Continuation of Intro to Bio I, continuation of basic biological 
    principles and topics.', 10002);
insert into course values (null, 'Biodiversity',
	'Survey of the major groups of organisms and biological systems.', 10002);
insert into course values (null, 'Plants and People',
	'Uses of plants and fungi by humans and the importance of plants in the past, 
    present, and future.', 10002);
insert into course values (null, 'Herpetology',
	'Biology, ecology, and evolution of amphibians (salamanders, frogs, caecilians) 
    and reptiles (lizards, snakes, tuatara, turtles, crocodilians).', 10002);    
insert into course values (null, 'Aquatic Ecology',
	'Structure and function of aquatic ecosystems with application to fishery 
    and pollution problems.', 10002);
-- -------------- Chemistry -------------- --
insert into course values (null, 'General Chemistry I',
	'The first semester of a two semester sequence which explores chemistry 
    at a greater depth and with more emphasis on concepts, problems, and 
    calculations.', 10003);
insert into course values (null, 'Laboratory in General Chemistry I',
	'Laboratory to accompany General Chemistry I.', 10003);
insert into course values (null, 'General Chemistry II',
	'Continuation of General Chemistry II.', 10003);
insert into course values (null, 'Laboratory in General Chemistry II',
	'Laboratory to accompany General Chemistry II.', 10003);
-- -------------- Computer Science -------------- --
insert into course values (null, 'Introduction to Web Programming',
	'Fundamentals of developing web pages using a comprehensive web 
    development life cycle.', 10004);
insert into course values (null, 'Fundamentals of Computer Science',
	'An introduction to computer programming using an object-oriented programming 
    language. Emphasis on the basics of good programming techniques and style.', 10004);
insert into course values (null, 'Linux Operating System Essentials',
	'Introduction to installation, utilization, and administration of 
    Linux systems.', 10004);
insert into course values (null, 'Software System Safety',
	'An introduction to the hazard analysis, safety requirements, design, and 
    testing of software for safety-critical and high-dependability systems.', 10004);
insert into course values (null, 'Computer Game and Media Programming',
	'Students will learn video game programming using current game engine interfaces 
    with real hardwaree.', 10004);
-- -------------- Economics -------------- --
insert into course values (null, 'Principles of Microeconomics',
	'Resource allocation, opportunity cost, comparative and absolute advantage.', 10005);
insert into course values (null, 'Economies of China and India',
	'The economic development of China and India within the larger historical, 
    political, and socioeconomic contexts.', 10005);
-- -------------- English -------------- --
insert into course values (null, 'Survey of Film History',
	'A survey of the history of film, both U.S. and international, from the 
    beginnings in the late nineteenth century to the present.', 10006);
insert into course values (null, 'Language and Society',
	'Introduction to variation in language use in society.', 10006);
insert into course values (null, 'Myth and Fairytale',
	'Study of traditional fairytales, myths, and legends from diverse cultures.', 10006);
insert into course values (null, 'Language as Data',
	'Methods of discovering language patterns in text documents solve practical 
    text analysis problems in the disciplines.', 10006);
-- -------------- Finance -------------- --
insert into course values (null, 'Investments',
	'Introduction to securities and markets from the viewpoint of the individual 
    investor.', 10007);
insert into course values (null, 'Fixed Income Securities',
	'Valuation of fixed income securities, including pricing conventions, term 
    structure of interest rates, default, duration, and hedging of interest rate 
    risk with derivatives.', 10007);
insert into course values (null, 'Real Estate Principles',
	'Legal, economic, social and financial aspects of real estate.', 10007);
insert into course values (null, 'Risk Management Derivatives',
	'Advanced models for options and bond pricing.', 10007);
-- -------------- Graphic Design -------------- --
insert into course values (null, 'Digital Imaging',
	'Studio in experimental techniques using the digital drawing tablet combined with 
    manual drawing mediums.', 10008);
insert into course values (null, 'Multimedia Design',
	'The design of visual, aural and textual communication for electronic media.', 10008);
insert into course values (null, 'Advanced Typography',
	'Typographic theory exploring traditional and non-traditional forms, both historical 
    and contemporary typographic achievements.', 10008);
insert into course values (null, 'Wayfinding Design',
	'Study of the navigational challenges of built environments and outdoor spaces, 
    including site analysis, development of navigational plans, and design of 
    wayfinding sign systems.', 10008);
-- -------------- History -------------- --
insert into course values (null, 'American Popular Culture',
	'Social practices, beliefs and material traits of everyday life in America from 
    the mid-19th century to the present. Includes literature, music, theater and other 
    entertainments.', 10009);
insert into course values (null, 'Mexican American History',
	'History of the Mexican American community in the U.S. from the 1820s to 
    the present.', 10009);
insert into course values (null, 'Greek Civilization',
	'Ancient Greece from the Bronze Age to the Hellenistic period.', 10009);
insert into course values (null, 'Civil Rights and Ethnic Power',
	'Comparative history of the civil rights and ethnic power movements (African 
    American, Chicano, American Indian, Puerto Rican, among others) in the U.S. 
    from World War II to the present.', 10009);
-- -------------- Journalism -------------- --
insert into course values (null, 'Principles of Journalism',
	'Analysis of journalism industry and specific audiences served by print, 
    electronic, visual and digital media.', 10010);
insert into course values (null, 'Broadcast Media Production',
	'Introduction to studio production using professional equipment.', 10010);
insert into course values (null, 'Mass Communication Theory',
	'Theory and research in mass communication processes and effects; the 
    scientific process; methods of measuring, evaluating and reporting mass 
    communication research.', 10010);
insert into course values (null, 'Communication Technology and Social Change',
	'Examination of historical and current communication technologies, including how 
    they shape and are shaped by the cultural and social practices into which they 
    are introduced.', 10010);
-- -------------- Linguistics -------------- --
insert into course values (null, 'Computers and Language',
	'Introduction to the use of linguistic knowledge in computer applications today and 
    the basic computational techniques used in such applications.', 10011);
insert into course values (null, 'The Use of Language in Society',
	'Introduction to variation in language use in society.', 10011);
insert into course values (null, 'Phonetics and Phonology',
	'Terminology, theory, research, and applications of the science of the sounds 
    of spoken language.', 10011);
insert into course values (null, 'Second Language Acquisition',
	'Theory, methods, and results of second language acquisition research with emphasis 
    on approaches relevant to second language teaching.', 10011);
insert into course values (null, 'Sociolinguistics',
	'Theories and methods of examining language in its social setting.', 10011);
insert into course values (null, 'Discourse Analysis',
	'Methods and theoretical foundations for linguistic approaches to discourse 
    analysis.', 10011);
-- -------------- Marketing -------------- --
insert into course values (null, 'Promotional Strategy',
	'Principles, concepts, and problems involved in the development and 
    implementation of promotional strategies.', 10012);
insert into course values (null, 'Marketing Research',
	'Marketing research techniques: problem formulation, research design, 
    questionnaire construction, etc.', 10012);
insert into course values (null, 'Consumer Behavior',
	'Study of how consumers select, purchase, use, and dispose of goods and 
    services.', 10012);
insert into course values (null, 'Advanced Professional Selling',
	'Analysis of the theory and practice of personal selling with the context of 
    relationship marketing and salesforce automation.', 10012);
insert into course values (null, 'Brand Management',
	'Examines the role of brands and branding in market environments characterized 
    by intense competition and consumer power.', 10012);
-- -------------- Mathematics -------------- --
insert into course values (null, 'Applied Trigonometry',
	'Mathematical ideas regarding the conception of space.', 10013);
insert into course values (null, 'Calculus I',
	'Differential calculus, applications of the derivative, introduction to 
    integral calculus.', 10013);
insert into course values (null, 'Calculus II',
	'Integral calculus, applications of the integral, infinite series, parametric 
    curves and polar coordinates.', 10013);
insert into course values (null, 'Matrices and Linear Algebra',
	'Systems of linear equations, determinants, vector spaces, linear transformations, 
    orthogonality, least-squares methods, eigenvalues and eige...