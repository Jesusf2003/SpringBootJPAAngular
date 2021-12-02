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
	codubi char(6) not null references ubigeo(codubi),
	estper char(1) not null
);

-- ALTER TABLE persona ALTER COLUMN codubi TYPE char(6);
-- ALTER TABLE producto RENAME COLUMN stock TO stockpro;

create table producto (
	codprod		serial not null primary key,
	nompro		varchar(60),
	cospro		char(4),
	prepro		decimal(5,2),
	tippro		char(1),
	tampro		char(6),
	stockpro	integer,
	estpro		char(1)
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

INSERT INTO PRODUCTO
	(NOMPRO, COSPRO, PREPRO, TIPPRO, TAMPRO, STOCKPRO, ESTPRO)
VALUES
	('Seco', '2008', 25, 'V', '500 ML', 100, 'A'),
	('Tinto', '2005', 30, 'V', '500 ML', 120, 'A'),
	('Italia', '2007', 40, 'V', '500 ML', 100, 'A'),
	('Mosto Verde', '2010', 60, 'V', '500 ML', 150, 'A'),
	('Manzanillo', '2015', 60, 'V', '500 ML', 150, 'A'),
	('Arrope', '2015', 65, 'V', '500 ML', 150, 'A'),
	('Borgoña Blanca', '2015', 85, 'V', '500 ML', 150, 'A'),
	('Borgoña Negra', '2018', 80, 'V', '500 ML', 150, 'A'),
	('Italia', '2010', 75, 'P', '750 ML', 145, 'A'),
	('Moscatel', '2012', 85, 'P', '750 ML', 150, 'A'),
	('Mosto Verde', '2011', 90, 'P', '750 ML', 150, 'A'),
	('Acholado', '2017', 95, 'P', '750 ML', 160, 'A');

-- Listar tablas
select * from ubigeo;
select * from persona;
select * from producto;