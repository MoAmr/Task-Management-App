package com.tasks.application.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by Mohammed Amr on 9/6/2019
 * Related to the Project tasks
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate dueDate;
    private Boolean completed;

}
