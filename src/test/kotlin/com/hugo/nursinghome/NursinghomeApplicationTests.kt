package com.hugo.nursinghome

import com.hugo.nursinghome.service.UserService
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class NursinghomeApplicationTests {

	@Mock
	private val userService : UserService = TODO();

	@Test
	fun contextLoads() {
	}

	@Test
	fun userService() {
		assert(userService.getUserById() == "Huguis")
	}
}
