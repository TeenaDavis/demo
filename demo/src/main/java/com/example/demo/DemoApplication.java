package com.example.demo;

import com.example.demo.data.Question;
import com.example.demo.model.Type;
import com.example.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public void run(String... args) throws Exception {

		Question question = new Question();
		question.setqText("Can you confirm that your treatment is [surgery]?");
		question.setType(Type.CASE);
		questionRepository.save(question);


		Question question1 = new Question();
		question1.setqText("Can you confirm your surgery will be done at [hospital] by Dr.[doctor name]?");
		question1.setType(Type.CASE);
		questionRepository.save(question1);

		Question question2 = new Question();
		question2.setqText("Will someone be accompanying you during the surgery? (An attendant is required)");
		question2.setType(Type.CASE);
		questionRepository.save(question2);

		Question question3 = new Question();
		question3.setqText("Do you understand that the insurance covers everything from admission to discharge, and you only need to handle discharge medicines?");
		question3.setType(Type.INSURANCE);
		questionRepository.save(question3);

		Question question4 = new Question();
		question4.setqText("Has your doctor informed you about fasting 6-8 hrs before your surgery?");
		question4.setType(Type.CASE);
		questionRepository.save(question4);

		Question question5 = new Question();
		question5.setqText("Do you know that for insurance cases, the discharge starts 24 hours after admission, and you can leave within 60 minutes of getting the final approval letter?");
		question5.setType(Type.INSURANCE);
		questionRepository.save(question5);

		Question question6 = new Question();
		question6.setqText("Are you prepared to pay any applicable copay or deductions at discharge?");
		question6.setType(Type.INSURANCE);
		questionRepository.save(question6);

		Question question7 = new Question();
		question7.setqText("Are you familiar with the treatment package?");
		question7.setType(Type.INSURANCE);
		questionRepository.save(question7);


	}




	}


