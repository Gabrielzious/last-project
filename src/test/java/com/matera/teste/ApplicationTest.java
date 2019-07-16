/*
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.matera.teste;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import com.matera.model.Funcionario;
import com.matera.controller.Controller;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import java.util.*;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = Controller.class)
public class ApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testaNomeDoFunc(){
        Funcionario f1 = new Funcionario("Gabriel",25,"gabrielfurlan11@hotmail.com");
        Assert.assertEquals("Gabriel",f1.getNome());
    }


    @Test
    public void testaArray(){
        Funcionario p1 = new Funcionario("Joao",30,"joao@hotmail.com");
        Funcionario p2 = new Funcionario("Pedro",45,"pedro@hotmail.com");
        Funcionario p3 = new Funcionario("Antonio",63,"antonio@hotmail.com");
        Funcionario p4 = new Funcionario("Paulo",35,"paulo@hotmail.com");
        Funcionario p5 = new Funcionario("Marcos",25,"marcos@hotmail.com");
        Funcionario p6 = new Funcionario("Ruan",18,"ruan@hotmail.com");
        Funcionario p7 = new Funcionario("Carlos",22,"carlos@hotmail.com");



        List<Funcionario> listaFunc = new ArrayList<>();
        listaFunc.add(p1);
        listaFunc.add(p2);
        listaFunc.add(p3);
        listaFunc.add(p4);
        listaFunc.add(p5);
        listaFunc.add(p6);
        listaFunc.add(p7);


        System.out.println(listaFunc.get(4));

        p5.setIdade(25);

        String temp = "O valor é: " + listaFunc.get(4);
        System.out.println(temp);
        Assert.assertEquals("O valor é: Funcionario{idade=25, matricula=555355, nome='Marcos'}",temp);
    }




//    @Test
//    public void homePage() throws Exception {
//            // N.B. jsoup can be useful for asserting HTML content
//            mockMvc.perform(get("/index.html"))
//                    .andExpect(content().string(containsString("Get your greeting")));
//        }
//
//        @Test
//        public void greeting() throws Exception {
//            mockMvc.perform(get("/greeting"))
//                    .andExpect(content().string(containsString("Hello, World!")));
//        }
//
//        @Test
//        public void greetingWithUser() throws Exception {
//            mockMvc.perform(get("/greeting").param("name", "Greg"))
//                    .andExpect(content().string(containsString("Hello, Greg!")));
//    }

}
