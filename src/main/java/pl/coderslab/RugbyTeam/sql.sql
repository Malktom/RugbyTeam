Insert INTO users (id, email, login, password, role)
VALUES  (1,'tomek@o2.pl','tomek','password',1),
        (2,'adam@o2.pl','adam','password',2),
        (3,'karol@o2.pl','karol','password',1),
        (4,'ania@o2.pl','ania','password',1);

Insert INTO coaches (id, name, surname)
VALUES  (1,'Łukasz','Kowalski'),
        (2,'Paweł','Nowak');

INSERT INTO events (id, description, name, event_type_id, coach_id)
VALUES (1,'training1 description','training1',1,1),
         (2,'sportPicnic description','sportPicnc',2,2),
         (3,'sparring description', 'sparring',3,1);

INSERT INTO players (id, height,weight, medical_check_date, name,surname, position, presence_statistic, ready_to_play)
VALUES (1, 185, 100, '2022-08-17','Adam','Gracz','forwards',80.4,true),
        (2, 192, 112, '2022-08-17','Jan','Wysoki','forwards',80.4,true),
        (3, 164, 74, '2022-08-17','Edek','Szybki','backs',80.4,true);

INSERT INTO event_type (id,name,description)
VALUES  (1,'training','training description'),
         (2,'picnic','picnic description'),
         (3,'sparring','sparring description');