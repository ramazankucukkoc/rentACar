package kodlama.io.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandResponse;
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
	public List<GetAllBrandResponse> getAll() {
      //iş kuralları

		List<Brand> brands= brandRepository.findAll();
		List<GetAllBrandResponse> brandResponse=new ArrayList<GetAllBrandResponse>();
		for(Brand brand :brands) {
			GetAllBrandResponse responseItem =new GetAllBrandResponse();
		    responseItem.setId(brand.getId());
		    responseItem.setName(brand.getName());
            brandResponse.add(responseItem);
		}			
		return brandResponse ;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		// TODO Auto-generated method stub
		Brand brand =new Brand();
		brand.setName(createBrandRequest.getName());
		this.brandRepository.save(brand);
		
	}

	
}









