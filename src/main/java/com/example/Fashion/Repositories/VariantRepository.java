package com.example.Fashion.Repositories;

import com.example.Fashion.Model.Variant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VariantRepository extends JpaRepository<Variant, Long> {
}
