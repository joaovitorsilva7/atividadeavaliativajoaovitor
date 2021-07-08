package Resources;


@RestController
@RequestMapping


public class CotamilhoResource {
	
	@Autowired
	private IcotamilhoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<cotamilho>> listmeses2021() {	
       	return ResponseEntity.
			   status(HttpStatus.OK).
			   body( repository.findAll() );
	}
	
	@PostMapping()
	public void salvarCotamiljo(@RequestBody cotamilho cm) {
		repository.save(p);
	}
	
	@PutMapping()
	public void atualizarMesescotamilho() {
		
	}
	
	@DeleteMapping()
	public void excluirMesescotamilho() {
		
	}
}
	
	


