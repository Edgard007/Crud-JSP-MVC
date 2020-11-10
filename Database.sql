create database inventario2;
use inventario2;

create table proveedor
(
codigoProveedor int primary key,
nombre varchar(50),
direccion varchar(50),
telefono varchar(50)
);

create table producto
(
codigoProducto int primary key,
nombre varchar(50),
categoria varchar(50),
precio double,
anioFabricacion int,
anioVencimiento int,
codigoProveedor int,
foreign key(codigoProveedor) references proveedor(codigoProveedor) on delete cascade on update cascade
);

create table usuarios
(codigoUsuario int primary key not null,
username varchar(50),
clave varchar(50),
nivel int
);


insert into proveedor(codigoProveedor,nombre,direccion,telefono)
values
(1,"Proveedor A","Santa Ana","2525-2564"),
(2,"Proveedor B","San Miguel","2525-2563"),
(3,"Proveedor C","San Salvador","2525-2562");


insert into producto(codigoProducto,nombre,categoria,precio,anioFabricacion,anioVencimiento,codigoProveedor)
values
(1,"Producto A","Ropa",25.25,2015,2018,1),
(2,"Producto B","Alimentos",12.25,2018,2018,3),
(3,"Producto C","Electrodomesticos",985.24,2017,2020,2);

insert into usuarios(codigoUsuario,username,clave,nivel)
values
(1,"Giovanni","123",2),
(2,"Edgard","12345",1);
