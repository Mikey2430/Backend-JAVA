package com.example.proyecto.controller;

    import com.example.proyecto.model.Aprendizentity;
    import com.example.proyecto.services.Aprendizservice;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;
    import java.util.List;

    @RestController
    @RequestMapping("/api/v1/aprendiz")
    @CrossOrigin (origins = "http://localhost:5173")
    public class Aprendizcontroller {
        @Autowired
        private Aprendizservice aprendizService;

        @PostMapping
        public void crearAprendiz(@RequestBody Aprendizentity aprendiz){
            aprendizService.crearAprendiz(aprendiz);
        }

        @GetMapping
        public List<Aprendizentity> obtenerAprendices(){
            return aprendizService.obtenerAprendices();
        }

        @GetMapping("/{id}")
        public Aprendizentity buscarAprendiz(@PathVariable Long id){
            return aprendizService.buscarAprendiz(id);
        }

        @PutMapping("/{id}")
        public Aprendizentity actualizarAprendiz(@PathVariable Long id, @RequestBody Aprendizentity aprendiz){
            return aprendizService.actualizarAprendiz(id, aprendiz);
        }

        @DeleteMapping("/{id}")
        public void eliminarAprendiz(@PathVariable Long id) {
            aprendizService.eliminarAprendiz(id);
        }
}
