package Resources;




@RestController
@RequestMapping


public class CotasojaResource {
	

	@Autowired
	private IcotasojaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<cotasoja>> listvaloressacasha() {	
       	return ResponseEntity.
			   status(HttpStatus.OK).
			   body( repository.findAll() );
	}
	
	@PostMapping()
	public void salvarCotasoja(@RequestBody cotasoja cs) {
		repository.save(p);
	}
	
	@PutMapping()
	public void atualizarValorescotasoja() {
		
	}
	
	@DeleteMapping()
	public void excluirValorescotasoja() {
		
	}
}

	
	
	
	
}
