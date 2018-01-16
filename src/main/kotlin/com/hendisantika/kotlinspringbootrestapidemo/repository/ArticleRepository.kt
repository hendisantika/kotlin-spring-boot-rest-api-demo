package com.hendisantika.kotlinspringbootrestapidemo.repository

import com.hendisantika.kotlinspringbootrestapidemo.model.Article
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-spring-boot-rest-api-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/01/18
 * Time: 06.16
 * To change this template use File | Settings | File Templates.
 */

@Repository
interface ArticleRepository : JpaRepository<Article, Long>