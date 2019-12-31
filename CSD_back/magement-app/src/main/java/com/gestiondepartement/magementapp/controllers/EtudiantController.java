package com.gestiondepartement.magementapp.controllers;

import com.gestiondepartement.magementapp.models.Etudiant;
import com.gestiondepartement.magementapp.services.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("etudiants")
public class EtudiantController {


    @Autowired
    EtudiantService etudiantService;

    @CrossOrigin(origins = "*")
    @GetMapping(produces = "application/json")
    public List<Etudiant> all() {
        List<Etudiant> etudiants = this.etudiantService.findAllEtudiants();
        return etudiants;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(consumes = "application/json", produces = "application/json")
    public Etudiant create(@RequestBody Etudiant et) {
        return etudiantService.createEtudiant(et);
    }

//    @CrossOrigin(origins = "*")
//    @PostMapping("logIn")
//    public User logIn(@RequestBody User user) {
//        return userService.logIn(user);
//    }

    @CrossOrigin(origins = "*")
    @PutMapping
    public Etudiant edit(@RequestBody Etudiant et) {
        return etudiantService.updateEtudiant(et);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        etudiantService.deleteEtudiant(id);
    }

//    @CrossOrigin(origins = "*")
//    @PostMapping("{id}")
//    public User addUserToGroup(@PathVariable Long id, @RequestBody Groupe groupe) {
//        return userService.addUserToGroup(id, groupe);
//    }
//
//    @CrossOrigin(origins = "*")
//    @DeleteMapping("group/{id}")//     /user/group/5?groupe=2
//    public void deleteUser(@PathVariable Long id, @RequestParam Long groupe) {
//        userService.deleteUserFromGroup(id, groupe);
//    }
//
//
//    @CrossOrigin(origins = "*")
//    @PostMapping("profil/{id}") // /user/profil/5?profil=2
//    public User addUserToProfil(@PathVariable("id") Long idUser, @RequestParam("profil") Long idProfil) {
//        return this.userService.addUserToProfil(idUser, idProfil);
//    }
//
//
//    @CrossOrigin(origins = "*")
//    @DeleteMapping("profil/{id}") // /user/profil/5?profil=2
//    public void deleteUserFromProfil(@PathVariable("id") Long idUser, @RequestParam("profil") Long idProfil) {
//        this.userService.deleteUserFromProfil(idUser, idProfil);
//    }

}