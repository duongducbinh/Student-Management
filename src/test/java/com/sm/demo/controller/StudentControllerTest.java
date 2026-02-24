//package com.sm.demo.controller;
//
//import com.sm.demo.service.StudentService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.bean.override.mockito.MockitoBean;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest(StudentController.class)
//class StudentControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockitoBean   // ⭐ QUAN TRỌNG
//    private StudentService studentService;
//
//    @Test
//    void addStudentTest() throws Exception {
//
//        String json = """
//        {
//            "id":1,
//            "name":"Binh",
//            "age":22
//        }
//        """;
//
//        mockMvc.perform(post("/")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(json))
//                .andExpect(status().isOk());
//    }
//}