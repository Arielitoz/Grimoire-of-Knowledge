package br.com.bandtec.grimorioFantasia;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/livros")
public class booksController {

    //Atributos
    private List<livrosRPG> books = new ArrayList<>();

    //----------------------------------------------------------
    @GetMapping() //Listar todos
    public ResponseEntity listBooks() {
        if (books.isEmpty()) {
            return ResponseEntity.status(201).build();
        } else {
            return ResponseEntity.ok(books);
        }
    }
    //__________________________________________________________
    @PostMapping("/add")
    public ResponseEntity adicionarLivro(@RequestBody livrosRPG lr) {
        books.add(lr);
        //Requestbody(passando o corpo/form. Usado apenas em Post/Put
        return ResponseEntity.status(201).build();
    }


}
