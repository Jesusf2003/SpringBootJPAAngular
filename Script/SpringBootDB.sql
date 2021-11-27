-- Crear tablas
create table ubigeo (
	codubi char(6) not null primary key,
	depubi varchar(50) not null,
	proubi varchar(50) not null,
	disubi varchar(50) not null
);

create table persona (
	codper serial not null primary key,
	nomper varchar(50) not null,
	apeper varchar(50) not null,
	userper varchar(20) not null,
	pswdper varchar(20) not null,
	dirper varchar(50) not null,
	emaper varchar(50) not null,
	dniper char(8) unique not null,
	celper char(9) unique not null,
	rolper char(1) not null,
	codubi char(50) not null references ubigeo(codubi),
	estper char(1) not null
);

-- Insertar datos
INSERT INTO ubigeo
	(codubi,depubi,proubi,disubi)
values
	('010101', 'Amazonas', 'Chachapoyas', 'Chachapoyas'),
	('010102', 'Amazonas', 'Chachapoyas', 'Asuncion'),
	('010103', 'Amazonas', 'Chachapoyas', 'Balsas'),
	('010104', 'Amazonas', 'Chachapoyas', 'Cheto'),
	('010105', 'Amazonas', 'Chachapoyas', 'Chiliquin');

insert into persona
	(nomper, apeper, userper, pswdper, dirper, emaper, dniper, celper, rolper, codubi, estper)
values
	('Alan Daniel', 'Jacinto Martínez', 'user01', '1234', 'Chachapoyas', 'alan@correo.com', '71546982', '741852963', 'A', '010101', 'A'),
	('Alicia Sara', 'Jesús Mirta', 'user02', '4321', 'Asunción', 'alicia@correo.com', '52415365', '95174858', 'C', '010102', 'A'),
	('Andrea Mariana', 'Josefina Mónica', 'user03', '5623', 'Balsas', 'andrea@correo.com', '58436219', '415124253', 'E', '010103', 'A'),
	('Andrés Jacinto', 'Juan Nicolás', 'user04', '7485', 'Cheto', 'andres@correo.com', '24871563', '963847561', 'C', '010104', 'A'),
	('Belén Felicia', 'Juliana Renzo', 'user05', '9514', 'Chiliquin', 'belen@correo.com', '62541548', '968745123', 'E', '010105', 'A');

-- Listar tablas
select * from ubigeo;
select * from persona;