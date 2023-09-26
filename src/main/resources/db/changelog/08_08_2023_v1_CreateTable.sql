CREATE TABLE   user_t (
     id SERIAL primary key,
     name VARCHAR,
     age INT,
     password VARCHAR);
CREATE TABLE   house_t (
    id SERIAL primary key,
    adress VARCHAR,
    id_master INT, foreign key (id_master) references user_t(id));
CREATE  TABLE house_user(
     id  SERIAL primary key,
     id_house INT,  foreign key (id_house) references house_t(id),
     id_user INT, foreign key (id_user) references user_t(id));
