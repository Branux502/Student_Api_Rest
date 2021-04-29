package com.demo.student;

import static org.assertj.core.api.Assertions.assertThat;
import com.demo.student.Student.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentApplicationTests {

	@Autowired
	private StudentController stdControler;


	@Test
	void contextLoads() throws Exception{
		assertThat(stdControler).isNotNull();

	}

}
