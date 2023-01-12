package com.slf.core.services.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class DummyRepositoryImpl implements DummyRepository {

    @Override
    public String get() {
        return "dummy";
    }
}
