package br.com.bandtec.grimorioFantasia;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//Controller e Endpoints
@RestController
@RequestMapping("/personagens")
public class grimorioController {

    //Atributos
    private List<Personagem> chars = new ArrayList<>();


    //----------------------------------------------------------
        @GetMapping()
        //Mostrar todos os personagens
            public ResponseEntity listarTodos() {
                if (chars.isEmpty()) {
                    return ResponseEntity.status(201).build();
                } else {
                    return ResponseEntity.ok(chars);
                }
            }
    //----------------------------------------------------------
        @GetMapping("/{codC}")
        //Mostrar todos os personagens
        public ResponseEntity showOne(@PathVariable Integer codC) {
//                return ResponseEntity.ok(chars.get(codC -1));
            if (chars.isEmpty()) {
                return ResponseEntity.status(201).build();
            } else {
                return ResponseEntity.ok(chars.get(codC - 1));
            }

        }
    //__________________________________________________________
        @PostMapping("/addA")
        public ResponseEntity addAventureiro(@RequestBody Aventureiro a) {
            chars.add(a);
            //Requestbody(passando o corpo/form. Usado apenas em Post/Put
            return ResponseEntity.status(201).build();
        }
    //__________________________________________________________
        @PostMapping("/addV")
        public ResponseEntity addVilao(@RequestBody Vilao v) {
            chars.add(v);
            //Requestbody(passando o corpo/form. Usado apenas em Post/Put
            return ResponseEntity.status(201).build();
        }

    @DeleteMapping("/kill/{idChar}")
    public ResponseEntity killChar(@PathVariable Integer idChar) {
        if (chars.size() >= idChar) {
            chars.remove(idChar - 1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(404).build();
        }
    }

}




