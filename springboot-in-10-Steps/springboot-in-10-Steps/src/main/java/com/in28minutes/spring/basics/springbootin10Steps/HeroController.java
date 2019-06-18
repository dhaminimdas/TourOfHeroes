package com.in28minutes.spring.basics.springbootin10Steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class HeroController 
{
	@GetMapping("/heroes")
	public List<Hero> getAllHeroes()
	{
		Hero Loki=new Hero(0, "Loki");
		Hero IronMan=new Hero(1, "Iron Man");
		Hero DrStrange=new Hero(2, "Dr. Strange");
		Hero Hulk=new Hero(3, "Hulk");
		Hero Thor=new Hero(4, "Thor");
		Hero CaptainAmerica=new Hero(5, "Captain America");
		Hero SpiderMan=new Hero(6, "Spider Man");
		Hero BlackPanther=new Hero(7, "Black Panther");
		Hero BlackWidow=new Hero(8, "Black Widow");
		Hero AntMan=new Hero(9, "Ant Man");
		Hero Wasp=new Hero(10, "Wasp");
		Hero ScarletWitch=new Hero(11, "Scarlet Witch");
		Hero Vision=new Hero(12, "Vision");
		return Arrays.asList(Loki,IronMan,DrStrange,Hulk,Thor,CaptainAmerica,SpiderMan,BlackPanther,BlackWidow,AntMan,Wasp,ScarletWitch,Vision);
	}
}
