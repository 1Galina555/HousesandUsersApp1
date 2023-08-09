CREATE TABLE user_t (
    id INT primary key,
     name VARCHAR,
     age INT,
     password VARCHAR,
     foreign key(id_house) references house_t(id));
CREATE TABLE house_t (
    id INT primary key,
    adress VARCHAR,
    foreign key(id_master) references user_t(id));