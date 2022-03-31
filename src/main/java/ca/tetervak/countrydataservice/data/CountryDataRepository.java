package ca.tetervak.countrydataservice.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryDataRepository extends JpaRepository<Country, Integer>{
}
