package com.example.dao;

import com.example.entity.Tuser;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TuserDao extends PagingAndSortingRepository<Tuser, Long>, JpaSpecificationExecutor<Tuser> {


//    int page = 1, size = 10;
//    Sort sort = new Sort(Sort.Direction.DESC, "id");
//    Pageable pageable = new PageRequest(page, size, sort);

    @Query(value = "from Tuser t where id = :id")
//    List<Tuser> queryFamilyList(@Param("id") Long id, Pageable pageable);

    List<Tuser> queryFamilyList(@Param("id") int id);


}