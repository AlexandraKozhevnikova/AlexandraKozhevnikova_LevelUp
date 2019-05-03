package homework_7;

import io.qameta.allure.Story;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import lombok.Data;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_7.CreateProjectRequest;
import ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_7.User;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_7.Common.baseUriTest;

public class MantisAPITest {

    private static Header headerAuthOnly = new Header("Authorization", "XNd5tIXXB7U8FV4C8w0nao0WYr5S0nN7");
    private CreateProjectRequest createProjectRequest = new CreateProjectRequest(1554, "KAS_Project", "do api test");



    @Test
    @Story("Создание пользователя")
    public void createUser() {

        User user = new User("KAS", "123", false);


        Response response = given()
                .baseUri(baseUriTest)
                .header(headerAuthOnly)
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post("/users");

        String userCreatedWithId = response.then()
                .statusCode(201)
                .statusLine(containsString("User created with id"))
                .extract().statusLine();

        String[] split = userCreatedWithId.split(" ");
        String id = split[split.length - 1];
        System.out.println("id -> " + id);


    }

    @Test
    @Story("Создание проекта")
    public void createProject() {

        given()
                .baseUri(baseUriTest)
                .header(headerAuthOnly)
                .contentType(ContentType.JSON)
                .body(createProjectRequest)
        .when()
                .post("/api/rest/projects/")
        .then()
                .statusCode(201)



    }


}


//        2. Написать тест, который через API будет создавать проект
//        3. Написать тест, которые через API буде создавать issues с attachements
//        4. Написать тест, который будет удалять заданного пользователя (перед тестом
//        пользователь должен быть создан)
//        5. Написать тест, который создаёт подпроект для проекта
//        6. Написать тест, который обновляет issue
//        7. Написть тест, которые обновляет issue которого не существует
//        8. Написть тест, удаляющий несуществующий проект
//        9. Написть тетс, удаляющий несуществующего пользователя


