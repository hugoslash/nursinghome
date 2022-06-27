package com.hugo.nursinghome.database.repository

import com.hugo.nursinghome.database.entity.User

interface UserRepository {
    //@Repository
//interface UserRepository : JpaRepository<User?, Long?> {


    fun findByIdId(id: Long): User
}
