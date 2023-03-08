package kodlama.io.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service//Bu sınıf business nesnesidir.

public class BrandManager implements BrandService{

	private BrandRepository brandRepository;
	@Autowired
	//IoC işlemelerini üstlenen Anatasyon'dur.Aşagıdaki constructora bakıyor 
	//BrandRepository interface implements eden sınıfı new'liyor otomatik.
	
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getAll() {
//iş kuralları
		return brandRepository.findAll();
	}

	
}

