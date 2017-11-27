package humberd.aspects;

public aspect SysoutBlockerAspect {
    pointcut sysout(): get(* System.out);

//    declare error: sysout() : "-------------DON'T USE [SYSTEM.OUT.PRINTLN]! USE LOGGER INSTEAD!-------------";
}
