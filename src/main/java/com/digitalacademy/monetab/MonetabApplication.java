package com.digitalacademy.monetab;

import com.digitalacademy.monetab.models.*;
import com.digitalacademy.monetab.repositories.StudentRepositories;
import com.digitalacademy.monetab.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.time.Year;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@SpringBootApplication
public class MonetabApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private AdresseService adresseService;

	@Autowired
	private TeacherService teacherService;

	@Autowired
	private FicheNoteService ficheNoteService;


	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {

		SpringApplication.run(MonetabApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//nouvelle adresse en passant par le construct sans param pour modifier les champs qu'on veut
		//par defaut ils sont tous a null

//		Adresse adresse = new Adresse();
//		adresse.setPays("CI");
//		adresse.setVille("Abijdan");
//		adresse.setRue("Koweit");
////
//		adresseService.save(adresse);
////
////
//		Adresse adresse1 = new Adresse();
//		adresse1.setPays("ML");
//		adresse1.setVille("Man");
//		adresse1.setRue("Niangon");
//
//		adresseService.save(adresse1);
////
//		//creation de nouveaux users
//		User user = new User(null, "Bakus", "123456789", Instant.now(),adresse);
//		User user1 = new User(null, "manno", "000000000", Instant.now(),adresse1);
//
//		userService.save(user);
//		userService.save(user1);

//

//			// Création de nouvelles fiches de note
//			FicheNote ficheNote1 = new FicheNote();
//			ficheNote1.setNote(12.0);
//			ficheNote1.setYear(Year.of(2024));
//
//		FicheNote ficheNote2 = new FicheNote();
//		ficheNote2.setNote(16.0);
//		ficheNote2.setYear(Year.of(2025));
//
//// Création d'un nouvel enseignant
//		Teacher teacher = new Teacher();
//		teacher.setMatiere("Java");
//		teacher.setFirstName("COULIBALY");
//
//// Associer le Teacher aux fiches de note
//		ficheNote1.setTeacher(teacher);
//		ficheNote2.setTeacher(teacher);
//
//// Sauvegarder d'abord le Teacher
//		teacherService.save(teacher);
//
//// Ensuite, sauvegarder les fiches de note
//		ficheNoteService.save(ficheNote1);
//		ficheNoteService.save(ficheNote2);

//// Optionnellement, si tu veux afficher les fiches de note associées
//		Set<FicheNote> ficheNotes = new HashSet<>();
//		ficheNotes.add(ficheNote1);
//		ficheNotes.add(ficheNote2);
//
//// Mettre à jour l'ensemble des fiches de note dans le Teacher
//		teacher.setFicheNotes(ficheNotes);
//		teacherService.save(teacher);








//		System.out.println(userService.findAll());
//
//
//		List<Teacher> teachers = teacherService.findAll();
//		System.out.println(teachers);
//
//		Set<FicheNote> notes = teachers.get(0).getFicheNotes();
//		System.out.println(notes);


//
//		Student student1 = new Student();
//		student1.setMatricule("AB-001");
//		student1.setFirstName("cool");
//		student1.setLastName("mesmer");
//
//
//		Student student2 = new Student();
//		student2.setMatricule("AB-002");
//		student2.setFirstName("coly");
//		student2.setLastName("sdjg");


		//Ajout de professeur

//		Teacher teacher1 = new Teacher();
//		teacher1.setFirstName("Silué");
//		teacher1.setLastName("Kolo");
//		teacher1.setMatiere("français");
//
//		Teacher teacher2 = new Teacher();
//		teacher2.setFirstName("aka");
//		teacher2.setLastName("Erwann");
//		teacher2.setMatiere("math");






//		Student student3 = new Student();
//		student3.setMatricule("AB-003");
//		student3.setEmail("mesmerfgd@gmail");
//		student3.setFirstName("cooluejv");
//		student3.setLastName("mesmervjvdj");

//		Set<Student> students = new HashSet<>();
//		students.add(student1);
//		students.add(student2);
//		students.add(student3);
//

//		studentService.save(student1);
//		studentService.save(student2);
//
//
//		teacherService.save(teacher1);
//		teacherService.save(teacher2);





	}
}
