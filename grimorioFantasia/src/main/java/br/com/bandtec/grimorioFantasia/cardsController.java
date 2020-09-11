package br.com.bandtec.grimorioFantasia;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/cartas")
public class cardsController {

    //Atributos
    private List<cartasMagic>  cards = new ArrayList<>();

    //----------------------------------------------------------
    @GetMapping()
    public ResponseEntity ListarC(){
        return ResponseEntity.status(201).body(cards);
    }
    //__________________________________________________________
    @PostMapping("/adicionar")
    public ResponseEntity addCarta(@RequestBody cartasMagic cm) {
        cards.add(cm);
        //Requestbody(passando o corpo/form. Usado apenas em Post/Put
        return ResponseEntity.status(201).build();
    }
    //__________________________________________________________
    @PostMapping("/criatura")
    public ResponseEntity addCriatura(@RequestBody Criatura cardC) {
        cards.add(cardC);
        //Requestbody(passando o corpo/form. Usado apenas em Post/Put
        return ResponseEntity.status(201).build();
    }

}
