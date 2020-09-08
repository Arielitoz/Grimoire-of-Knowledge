package br.com.bandtec.grimorioFantasia;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//Controller e Endpoints
@RestController
public class grimorioController {

    //Atributos

    private List<livrosRPG> livros = new ArrayList<>();
    private List<Personagem> listp = new ArrayList<>();

    //----------------------------------------------------------
        @GetMapping("/listarl")
        public ResponseEntity listarLivros(){

            return ResponseEntity.status(201).body(livros);
        }
    //__________________________________________________________
        @PostMapping("/adicionarl")
        public ResponseEntity adicionarLivro(@RequestBody livrosRPG lr) {
            livros.add(lr);
            //Requestbody(passando o corpo/form. Usado apenas em Post/Put
            return ResponseEntity.status(201).build();
        }
    //__________________________________________________________
        @PostMapping("/addA")
        public ResponseEntity addAventureiro(@RequestBody Aventureiro a) {
            listp.add(a);
            //Requestbody(passando o corpo/form. Usado apenas em Post/Put
            return ResponseEntity.status(201).build();
        }
    //__________________________________________________________
        @PostMapping("/addV")
        public ResponseEntity addVilao(@RequestBody Vilao v) {
            listp.add(v);
            //Requestbody(passando o corpo/form. Usado apenas em Post/Put
            return ResponseEntity.status(201).build();
        }

    //----------------------------------------------------------
    @GetMapping("/listarP")
    public ResponseEntity listarP(){

        return ResponseEntity.status(201).body(listp);
    }


}



