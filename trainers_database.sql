DROP DATABASE IF EXISTS `pschooltrainers`;

CREATE DATABASE IF NOT EXISTS `pschooltrainers`;
USE `pschooltrainers`;
CREATE TABLE IF NOT EXISTS `trainers` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `firstname` VARCHAR(20) NULL DEFAULT NULL,
    `lastname` VARCHAR(30) NULL DEFAULT NULL,
    `subject` VARCHAR(20) NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
);