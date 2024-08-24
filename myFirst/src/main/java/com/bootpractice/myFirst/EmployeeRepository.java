package com.bootpractice.myFirst;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// import com.bootpractice.myFirst.EmployeeEntity;
@Repository
public interface EmployeeRepository  extends JpaRepository<EmployeeEntity,Long>{
    
    
}
