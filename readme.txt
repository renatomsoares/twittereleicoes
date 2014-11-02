- Criar database mysql:
CREATE DATABASE tweet

- Criar tabela:
CREATE TABLE tweet (number INTEGER NOT NULL AUTO_INCREMENT, id INTEGER NOT NULL UNIQUE, user TEXT CHARACTER SET utf8, text TEXT CHARACTER SET utf8, ss VARCHAR(50), location TEXT CHARACTER SET utf8, favoriteds INTEGER, retweeteds INTEGER, PRIMARY KEY (number)) ENGINE=MyISAM DEFAULT CHARSET=utf8;

- Colocar .jars:
twitter4j
mysql-connector