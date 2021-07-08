package Resources;

import java.util.List;

@RestController
@RequestMapping

public class CotaarrozResource {

	@Autowired
	private IcotaarrozRepository repository;
	
	@GetMapping
	public ResponseEntity<List<cotaarroz>> listmesescotaarroz() {	
       	return ResponseEntity.
			   status(HttpStatus.OK).
			   body( repository.findAll() );
	}
	
	@PostMapping()
	public void salvarCotaarroz(@RequestBody cotaarroz ca) {
		repository.save(p);
	}
	
	@PutMapping()
	public void atualizarCotaarroz() {
		
	}
	
	@DeleteMapping()
	public void excluirCotaarroz() {
		
	}
}
	
	
	
	
	
}
