package com.example.demo.controller;

import com.example.demo.entity.QuestsEntity;
import com.example.demo.entity.UsersEntity;
import com.example.demo.services.QuestsService;
import com.example.demo.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private QuestsService questsService;



    @GetMapping("/login")
    public String login() {
        return "login";
    }



    @GetMapping("database1")
    public String admin(Model model) {
        model.addAttribute("allSections", usersService.loadAllSections());
        return "database1";
    }

    @GetMapping("database2")
    public String user(Model model, Authentication authentication) {
        model.addAttribute("allProducts", questsService.loadAllSections());
        return "database2";
    }

   @GetMapping("/database1/add")
    public String addPage(Model model) {
      model.addAttribute("user", new UsersEntity());
        return "AEditPage";
    }

    @PostMapping("/database1/add")
    public String addUser(@ModelAttribute UsersEntity user, Model model) {

       model.addAttribute("allSections", usersService.loadAllSections());
        usersService.addProduct(user);
        return "redirect:/database1";
   }



    @GetMapping("/database1/delete")
    public String deleteUser(@RequestParam Integer id, Model model) {
        model.addAttribute("user", usersService.getById(id));
        usersService.Delete(usersService.getById(id));
        return "redirect:/database1";
    }


    @GetMapping("/database1/edit")
    public String editUser(@RequestParam int id, Model model) {
        model.addAttribute("user", usersService.getById(id));
        return "AEditPage2";
   }

    @PostMapping("/database1/edit")
    public String confirmEditUser(@ModelAttribute UsersEntity user) {
        UsersEntity tmpUser = usersService.getById(user.getUserId());
        tmpUser.setAge(user.getAge());
        tmpUser.setBackground(user.getBackground());
        tmpUser.setBalance(user.getBalance());
        tmpUser.setUserName(user.getUserName());
        tmpUser.setUserSettings(user.getUserSettings());
        tmpUser.setAuthToken(user.getAuthToken());
        tmpUser.setPhoto(user.getPhoto());
        tmpUser.setLastAvailable(user.getLastAvailable());
        tmpUser.setMedicalBackground(user.getMedicalBackground());
        tmpUser.setPositionOnStarship(user.getPositionOnStarship());
        tmpUser.setPsychologyBackground(user.getPsychologyBackground());
        tmpUser.setPublicBackground(user.getPublicBackground());
        tmpUser.setSecurityBackground(user.getSecurityBackground());
        tmpUser.setSex(user.getSex());


        usersService.addProduct(tmpUser);

        return "redirect:/database1";
    }


    @GetMapping("/database2/add")
    public String addPage2(Model model) {
        model.addAttribute("user", new QuestsEntity());
        return "UEditPage";
    }

    @PostMapping("/database2/add")
    public String addUser2(@ModelAttribute QuestsEntity user, Model model) {

        model.addAttribute("allSections", questsService.loadAllSections());
        questsService.addProduct(user);
        return "redirect:/database2";
    }



    @GetMapping("/database2/delete")
    public String deleteUser2(@RequestParam Integer id, Model model) {
        model.addAttribute("user", questsService.getById(id));
        questsService.Delete(questsService.getById(id));
        return "redirect:/database2";
    }


    @GetMapping("/database2/edit")
    public String editUser2(@RequestParam int id, Model model) {
        model.addAttribute("user", questsService.getById(id));
        return "UEditPage2";
    }

    @PostMapping("/database2/edit")
    public String confirmEditUser2(@ModelAttribute QuestsEntity user) {
        QuestsEntity tmpUser = questsService.getById(user.getQuestId());
        tmpUser.setPenalty(user.getPenalty());
        tmpUser.setModelId(user.getModelId());
        tmpUser.setLevelDifficulty(user.getLevelDifficulty());
        tmpUser.setPersonId(user.getPersonId());
        tmpUser.setPlaceId(user.getPlaceId());
        tmpUser.setReward(user.getReward());
        tmpUser.setQuestStatus(user.getQuestStatus());
        tmpUser.setQuestText(user.getQuestText());
        tmpUser.setQuestTitle(user.getQuestTitle());
        tmpUser.setTimeForQuestInMinutes(user.getTimeForQuestInMinutes());
        tmpUser.setTimeOfStarted(user.getTimeOfStarted());

        questsService.addProduct(tmpUser);

        return "redirect:/database2";
    }


}




