package com.xmiguel.millenniumcomics;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicRepository extends JpaRepository<Comic, Long> {
}
