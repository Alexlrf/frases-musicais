create table artista(
id_artista int not null auto_increment
, nome_artista varchar(50) not null
, genero_musical varchar(30) 
, constraint pk_artista primary key (id_artista)
);


create table verso(
id_verso int not null auto_increment
, id_artista int not null
, frase varchar(300) not null
, musica varchar(50) 
, album varchar(50)
, constraint pk_verso primary key (id_verso)
, constraint fk_verso_artista foreign key (id_artista) references artista  (id_artista)
);