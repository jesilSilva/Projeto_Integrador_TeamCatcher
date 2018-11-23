-- MySQL Workbench Synchronization
-- Generated: 2018-11-08 10:22
-- Model: Sakila Full
-- Version: 2.0
-- Project: Name of the project
-- Author: Mike

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `TeamCatcher` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;

CREATE TABLE IF NOT EXISTS `TeamCatcher`.`Usuario` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `nome` VARCHAR(60) NOT NULL COMMENT '',
  `cpf` VARCHAR(15) NULL DEFAULT NULL COMMENT '',
  `telefone` VARCHAR(15) NOT NULL COMMENT '',
  `dataNasc` DATE NOT NULL COMMENT '',
  `email` VARCHAR(30) NOT NULL COMMENT '',
  `senha` VARCHAR(15) NOT NULL COMMENT '',
  PRIMARY KEY (`codigo`)  COMMENT '')
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci;

CREATE TABLE IF NOT EXISTS `TeamCatcher`.`Evento` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `nome` VARCHAR(60) NOT NULL COMMENT '',
  `horaInicio` TIME NOT NULL COMMENT '',
  `horaFim` TIME NOT NULL COMMENT '',
  `dataEvento` DATE NOT NULL COMMENT '',
  `local` VARCHAR(50) NOT NULL COMMENT '',
  `custo` FLOAT(11) NOT NULL COMMENT '',
  `capacidadeMinima` INT(11) NOT NULL COMMENT '',
  `capacidadeMaxima` INT(11) NOT NULL COMMENT '',
  `descricao` VARCHAR(1000) NOT NULL COMMENT '',
  PRIMARY KEY (`codigo`)  COMMENT '')
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci;

CREATE TABLE IF NOT EXISTS `TeamCatcher`.`Participacao` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `status` VARCHAR(30) NOT NULL COMMENT '',
  `numeroInscricao` INT(11) NOT NULL COMMENT '',
  `dataInscricao` DATE NOT NULL COMMENT '',
  `Evento_codigo` INT(11) NOT NULL COMMENT '',
  `Usuario_codigo` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`codigo`, `Evento_codigo`, `Usuario_codigo`)  COMMENT '',
  INDEX `fk_Usuario_has_Evento_Evento1_idx` (`Evento_codigo` ASC)  COMMENT '',
  INDEX `fk_Participacao_Usuario1_idx` (`Usuario_codigo` ASC)  COMMENT '',
  CONSTRAINT `fk_Usuario_has_Evento_Evento1`
    FOREIGN KEY (`Evento_codigo`)
    REFERENCES `TeamCatcher`.`Evento` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Participacao_Usuario1`
    FOREIGN KEY (`Usuario_codigo`)
    REFERENCES `TeamCatcher`.`Usuario` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
