package com.example.Abs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ContactRepository extends JpaRepository<ContactForm,Long>{

}