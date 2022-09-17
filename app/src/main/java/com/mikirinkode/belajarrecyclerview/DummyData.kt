package com.mikirinkode.belajarrecyclerview

class DummyData {
    companion object {

        fun getUserList(): ArrayList<UserEntity> {
            val userList = ArrayList<UserEntity>()

            userList.add(
                UserEntity(
                    "Wafa",
                    "Teknik Informatika",
                    "https://raw.githubusercontent.com/mikirinkode/SampleAvatar/main/user1.png"
                )
            )
            userList.add(
                UserEntity(
                    "Al Ausath",
                    "Ilmu Komputer",
                    "https://raw.githubusercontent.com/mikirinkode/SampleAvatar/main/user2.png"
                )
            )

            userList.add(
                UserEntity(
                    "Muhammad",
                    "Sistem Informasi",
                    "https://raw.githubusercontent.com/mikirinkode/SampleAvatar/main/user3.png"
                )
            )
            userList.add(
                UserEntity(
                    "Al",
                    "Teknik Komputer",
                    "https://raw.githubusercontent.com/mikirinkode/SampleAvatar/main/user4.png"
                )
            )

            return userList
        }
    }
}