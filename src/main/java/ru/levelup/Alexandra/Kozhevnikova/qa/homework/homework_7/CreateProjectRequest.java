package ru.levelup.Alexandra.Kozhevnikova.qa.homework.homework_7;

import lombok.Data;

@Data
public class CreateProjectRequest {

    private int idProject;
    private String nameProject;
    private String descriptionProject;

    public CreateProjectRequest(int idProject, String nameProject, String descriptionProject) {
        this.idProject = idProject;
        this.nameProject = nameProject;
        this.descriptionProject = descriptionProject;
    }
}
