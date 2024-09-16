package com.devteria.identity_service.repository;

import com.devteria.identity_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* 1 request thi di qua 3 layer:
1. Controller: quan ly Mapping, EndPoint
2. Service: xu ly cac logic lien quan den Subdomain cua minh
3. Repository:  tuong tac truc tiep voi db
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {
    // kiem tra su ton tai cua field username nay voi value username ma ta truyen vao
    boolean existsByUsername(String username);
}
