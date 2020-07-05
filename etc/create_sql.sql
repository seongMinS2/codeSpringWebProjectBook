-- create table tbl_board(
-- bno int(10) not null auto_increment,
-- title varchar(200) not null,
-- content varchar(2000) not null,
-- writer varchar(50) not null,
-- regdate TIMESTAMP DEFAULT NOW(),
-- updatedate TIMESTAMP DEFAULT NOW(),
-- constraint pk_board primary key(bno)
-- );


insert into tbl_board(title, content, writer)
values ('테스트 제목', '테스트 내용', 'user00');

SELECT * FROM book_ex.tbl_board;

SELECT @@AUTOCOMMIT;
set autocommit = 0;



