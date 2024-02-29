package com.swipe.swipeindata.repo;

import com.swipe.swipeindata.entity.SwipeIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwipeInRepository extends JpaRepository<SwipeIn, Long> {

}
