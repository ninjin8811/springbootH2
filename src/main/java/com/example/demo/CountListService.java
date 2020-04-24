package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CountListService {
	@Autowired
	CountListRepository countListRepository;

	public List<CountList> findAll() {
		return countListRepository.findAll();
	}

	public CountList create(CountList customer) {
		return countListRepository.save(customer);
	}

	public CountList update(CountList countList) {
		return countListRepository.save(countList);
	}
}
