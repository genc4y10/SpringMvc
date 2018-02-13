package springmvc.controller;
import java.util.*;

import springmvc.dao.kullaniciDao;
import springmvc.model.kullanici;
import springmvc.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value="/kullanici")
public class kullaniciKontrol{
		@Autowired
		kullaniciServis kullaniciServis;
		
		@RequestMapping(value="/list",method=RequestMethod.GET)
		public ModelAndView list(){
			ModelAndView model=new ModelAndView("kullanici/kullanici_sayfasi");
			List<kullanici> list=kullaniciServis.tumKullanicileriListele();
			model.addObject("list",	 list);
			
			return model;
		}
		@RequestMapping(value="/add",method=RequestMethod.GET)
		public ModelAndView add(){
			ModelAndView model=new ModelAndView("kullanici/kullanici_form");
			kullanici kullanici=new kullanici();
			
			model.addObject("kullaniciform",kullanici);
			
			return model;
		}
		@RequestMapping(value="/save",method=RequestMethod.POST)
		public ModelAndView save(@ModelAttribute("kullaniciform")kullanici kullanici){
			
			kullaniciServis.kullaniciEkle(kullanici);
			
			return new ModelAndView("redirect:/kullanici/list");
		}
	
}