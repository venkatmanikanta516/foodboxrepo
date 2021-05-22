package com.mjava.foodbox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mjava.foodbox.model.Register;
import com.mjava.foodbox.model.User;

@Repository
public interface UserRepository extends JpaRepository<Register,Integer> {
	  @Query("select f from tbl_register f where first_name=?1 and password=?2 and  rollid=?3")
	    public  Register  isAdminOrNot(String username,String password,int rollid);
	  

		 @Modifying  //for delete and update these annotations required
		 @Transactional //for delete and update these annotations required
		 @Query("update tbl_register set password=?1 where password=?2")
		    public  int  changeUserPasswordRepo(String newpassword,String currentpassword);

}
