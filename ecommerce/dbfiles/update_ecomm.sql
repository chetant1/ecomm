SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `ecomm` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `ecomm` ;

-- -----------------------------------------------------
-- Table `ecomm`.`USERMASTER`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `ecomm`.`USERMASTER` (
  `USER_ID` INT NOT NULL AUTO_INCREMENT ,
  `USERNAME` VARCHAR(45) NULL ,
  `PASSWORD` VARCHAR(45) NULL ,
  `FIRSTNAME` VARCHAR(45) NULL ,
  `LASTNAME` VARCHAR(45) NULL ,
  `MOBILENO` VARCHAR(45) NULL ,
  `EMAIL` VARCHAR(45) NULL ,
  `USERROLE` VARCHAR(45) NULL ,
  `CREATED_DATE` VARCHAR(45) NULL ,
  `CREATED_TIME` VARCHAR(45) NULL ,
  `CHANGED_DATE` VARCHAR(45) NULL ,
  `CHANGED_TIME` VARCHAR(45) NULL ,
  `IS_ACTIVE` VARCHAR(45) NULL ,
  PRIMARY KEY (`USER_ID`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ecomm`.`ROLEMASTER`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `ecomm`.`ROLEMASTER` (
  `ROLE_ID` INT NOT NULL AUTO_INCREMENT ,
  `ROLE_NAME` VARCHAR(45) NULL ,
  `CREATED_DATE` VARCHAR(45) NULL ,
  `CREATED_TIME` VARCHAR(45) NULL ,
  `CHNAGED_DATE` VARCHAR(45) NULL ,
  `CHANGED_TIME` VARCHAR(45) NULL ,
  `IS_ACTIVE` VARCHAR(45) NULL ,
  PRIMARY KEY (`ROLE_ID`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ecomm`.`PRODUCT_MASTER`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `ecomm`.`PRODUCT_MASTER` (
  `PRODUCT_ID` INT NOT NULL AUTO_INCREMENT ,
  `PRODUCT_NAME` VARCHAR(45) NULL ,
  `PRODUCT_BRAND` VARCHAR(45) NULL ,
  `PRODUCT_QUANTITY` VARCHAR(45) NULL ,
  `PRODUCT_PRICE` VARCHAR(45) NULL ,
  `CREATED_DATE` VARCHAR(45) NULL ,
  `CREATED_TIME` VARCHAR(45) NULL ,
  `CHANGED_DATE` VARCHAR(45) NULL ,
  `CHANGE_TIME` VARCHAR(45) NULL ,
  `IS_ACTIVE` VARCHAR(45) NULL ,
  `PRODUCT_DETAILS` BLOB NULL ,
  PRIMARY KEY (`PRODUCT_ID`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ecomm`.`USERPRODUCTDETAILS`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `ecomm`.`USERPRODUCTDETAILS` (
  `USER_PRODUCT_ID` INT NOT NULL AUTO_INCREMENT ,
  `USER_ID` INT NULL ,
  `PRODUCT_ID` INT NULL ,
  `USER_PRODUCT_QUANTITY` VARCHAR(45) NULL ,
  `PRODUCT_PRICE` VARCHAR(45) NULL ,
  `PURCHASE_STATUS` VARCHAR(45) NULL ,
  `CREATED_DATE` VARCHAR(45) NULL ,
  `CREATED_TIME` VARCHAR(45) NULL ,
  `CHANGED_DATE` VARCHAR(45) NULL ,
  `CHANGED_TIME` VARCHAR(45) NULL ,
  `IS_ACTIVE` VARCHAR(45) NULL ,
  PRIMARY KEY (`USER_PRODUCT_ID`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ecomm`.`USER_ACTIVITY`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `ecomm`.`USER_ACTIVITY` (
  `USER_TRACK_ID` INT NOT NULL AUTO_INCREMENT ,
  `USER_ID` INT NULL ,
  `USER_ACTION` VARCHAR(45) NULL ,
  `ACTIVITY_DATE` VARCHAR(45) NULL ,
  `START_TIME` VARCHAR(45) NULL ,
  `END_TIME` VARCHAR(45) NULL ,
  `TIME_SPEND` VARCHAR(45) NULL ,
  PRIMARY KEY (`USER_TRACK_ID`) )
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
