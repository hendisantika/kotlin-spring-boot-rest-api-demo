package com.hendisantika.kotlinspringbootrestapidemo.model

import org.hibernate.validator.constraints.NotBlank
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-spring-boot-rest-api-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 17/01/18
 * Time: 06.15
 * To change this template use File | Settings | File Templates.
 */

@Entity
data class Article(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,

        @get: NotBlank
        val title: String = "",

        @get: NotBlank
        val content: String = ""
)