CREATE TABLE IF NOT EXISTS Homework
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(50),
    description TEXT
    );


CREATE TABLE IF NOT EXISTS Lesson
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(50),
    updatedAt   DATE,
    homework_id INT,
    FOREIGN KEY (homework_id) REFERENCES Homework (id)
    );


CREATE TABLE IF NOT EXISTS Schedule
(
    id        SERIAL PRIMARY KEY,
    name      VARCHAR(50),
    updatedAt DATE,
    lessons   INT,
    FOREIGN KEY (lessons) REFERENCES Lesson (id)
    );

CREATE TABLE IF NOT EXISTS ScheduleLesson
(
    schedule_id INT,
    lesson_id   INT,
    PRIMARY KEY (schedule_id, lesson_id),
    FOREIGN KEY (schedule_id) REFERENCES Schedule (id),
    FOREIGN KEY (lesson_id) REFERENCES Lesson (id)
    );

INSERT INTO homework (name, description)
VALUES ('homework1', 'Task2'),
       ('homework2', 'Task3'),
       ('homework3', 'Task4'),
       ('homework4', 'Task1'),
       ('homework5', 'Task5');

INSERT INTO lesson (name, updatedat, homework_id)
VALUES ('lesson1', '28/11/23', 1),
       ('lesson2', '28/11/23', 2),
       ('lesson3', '28/11/23', 3),
       ('lesson4', '28/11/23', 4),
       ('lesson5', '28/11/23', 5);

INSERT INTO schedule (name, updatedat, lessons)
VALUES ('schedule1', '28/11/23', 1),
       ('schedule2', '28/11/23', 2),
       ('schedule1', '28/11/23', 3),
       ('schedule2', '28/11/23', 4),
       ('schedule2', '28/11/23', 5);
